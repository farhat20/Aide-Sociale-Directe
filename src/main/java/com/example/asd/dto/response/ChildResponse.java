package com.example.asd.dto.response;

import com.example.asd.model.entity.Child;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder // Utilisation de SuperBuilder pour supporter l'héritage
@JsonInclude(JsonInclude.Include.NON_NULL)
@EqualsAndHashCode(callSuper = true)
public class ChildResponse extends RsuMemberResponse {

        private Long establishmentTypeId;
        private String establishmentCode;
        private boolean withDisability;
        private String parentalRelationship;
        private Boolean orphan;
        private String partnerId;
        private String partnerIdType;

        public static ChildResponse of(Child child) {
                return ChildResponse.builder()
                        .id(child.getId() != null ? child.getId().longValue() : null) // ✅ Conversion Integer -> Long
                        .idcs(child.getIdcs())
                        .firstNameFr(child.getFirst_name_fr())
                        .lastNameFr(child.getLast_name_fr())
                        .firstNameAr(child.getFirst_name_ar())
                        .lastNameAr(child.getLast_name_ar())
                        .birthDate(child.getBirth_date())
                        .gender(child.getGender())
                        .seuil(child.getSeuil())
                        .status(child.getStatus())
                        .country(child.getCountry())
                        .city(child.getCity())
                        .familyMemberCount(child.getFamily_member_count())
                        .houseHoldCode(child.getHouse_hold_code())
                        .cin(child.getCin())
                        .establishmentTypeId(child.getEstablishmentTypeId())
                        .establishmentCode(child.getEstablishmentCode())
                        .withDisability(child.getWithDisability() != null ? child.getWithDisability() : false) // ✅ Ajout d'une valeur par défaut
                        .parentalRelationship(child.getParentalRelationship())
                        .orphan(child.getOrphan())
                        .partnerId(child.getPartnerId())
                        .partnerIdType(child.getPartnerIdType())
                        .build();
        }
}
