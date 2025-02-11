package com.example.asd.service.implementation;


import com.example.asd.dto.response.ChildResponse;
import com.example.asd.dto.response.FamilyResponse;
import com.example.asd.dto.response.RsuMemberResponse;
import com.example.asd.exception.DomainException;
import com.example.asd.model.entity.Child;
import com.example.asd.model.entity.RsuMember;
import com.example.asd.repository.RsuMemberRepository;
import com.example.asd.service.ChildService;
import com.example.asd.service.MemberService;
import com.example.asd.service.RsuMemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService {

    private final RsuMemberRepository rsuMemberRepository;
    private final ChildService childService;
    private final RsuMemberService rsuMemberService;

    @Override
    public FamilyResponse getMemberData(Long idcs) {
        RsuMember member = rsuMemberRepository.findByIdcs(idcs)
                .orElseThrow(() -> new DomainException("Member not found with idcs: " + idcs));

        if (member instanceof Child) {
            ChildResponse child = childService.getChildByIdcs(idcs);
            return FamilyResponse.builder().child(child).build();
        } else {
            RsuMemberResponse partner = rsuMemberService.rsuMemberResponse(idcs);
            return FamilyResponse.builder().partner(partner).build();
        }
    }
}
