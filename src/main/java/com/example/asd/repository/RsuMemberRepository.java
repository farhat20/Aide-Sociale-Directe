package com.example.asd.repository;

import com.example.asd.model.entity.RsuMember;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface RsuMemberRepository extends JpaRepository<RsuMember, Long> {

    Optional<RsuMember> findByIdcs(Long idcs);

    List<RsuMember> findAll();

//    List<RsuMember> findAllByHouse_hold_code(Integer house_hold_code); // Fetch all members by household


    boolean existsById(Long idcs);
}
