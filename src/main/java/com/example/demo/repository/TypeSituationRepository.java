package com.example.demo.repository;

import com.example.demo.model.entity.TypeSituation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeSituationRepository extends JpaRepository<TypeSituation, Integer> {
}
