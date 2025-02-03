package com.example.asd.repository;

import com.example.asd.model.entity.RsuChefMenage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RsuChefMenageRepository extends JpaRepository<RsuChefMenage, Long> {
    Optional<RsuChefMenage> findByIdcs(Long idcs);

}
