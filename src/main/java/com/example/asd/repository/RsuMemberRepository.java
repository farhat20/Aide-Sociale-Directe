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

    boolean existsById(Long idcs);
}
