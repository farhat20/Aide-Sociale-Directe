package com.example.asd.repository;

import com.example.asd.model.entity.TypeAid;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeAidRepository extends JpaRepository<TypeAid, Long> {
}
