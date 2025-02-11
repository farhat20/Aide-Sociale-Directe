package com.example.asd.service.implementation;

import com.example.asd.dto.response.ChildResponse;
import com.example.asd.dto.response.FamilyResponse;
import com.example.asd.dto.response.RsuChefMenageResponse;
import com.example.asd.dto.response.RsuMemberResponse;
import com.example.asd.model.entity.Child;
import com.example.asd.model.entity.RsuMember;
import com.example.asd.repository.RsuMemberRepository;
import com.example.asd.service.ChildService;
import com.example.asd.service.RsuChefMenageService;
import com.example.asd.service.RsuMemberService;
import com.example.asd.service.FamilyService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class FamilyServiceImpl implements FamilyService {

    private final ChildService childService;
    private final RsuMemberService rsuMemberService;
    private final RsuMemberRepository rsuMemberRepository;

    @Override
    public FamilyResponse getFamilyData(Long idcs) {
        // 🔹 Récupérer le membre générique
        RsuMember rsuMember = rsuMemberRepository.findByIdcs(idcs)
                .orElseThrow(() -> new RuntimeException("Member not found"));

        // 🔹 Vérifier le `member_type`
        if (rsuMember instanceof Child) {
            ChildResponse child = childService.getChildByIdcs(idcs);
            return FamilyResponse.builder().child(child).build();
        } else {
            RsuMemberResponse partner = rsuMemberService.rsuMemberResponse(idcs);
            return FamilyResponse.builder().partner(partner).build();
        }
    }
}
