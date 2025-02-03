package com.example.asd.repository;

import com.example.asd.model.entity.EtatMatrimonial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EtatMatrimonialRepository extends JpaRepository<EtatMatrimonial, Long> {
}
