package com.example.asd.dto.response;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiResponse<T> {

    private T data;

    private ApiResponseDetail responseContext = ApiResponseDetail.builder()
            .code("000")
            .description("success")
            .build();

    public ApiResponse(T data) {
        this.data = data;
    }

    @Data
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    public static class ApiResponseDetail {
        private String code;
        private String description;
    }

    @JsonIgnore
    public boolean isSuccess() {
        return "000".equals(responseContext.getCode());
    }

    @JsonIgnore
    public boolean isFailure() {
        return !isSuccess();
    }

    @JsonIgnore
    public boolean is4xx() {
        return "400".equals(responseContext.getCode()) || "404".equals(responseContext.getCode());
    }

    public static <T> ApiResponse<T> of(T data, String code, String description) {
        return ApiResponse.<T>builder()
                .responseContext(new ApiResponseDetail(code, description))
                .data(data)
                .build();
    }
}
