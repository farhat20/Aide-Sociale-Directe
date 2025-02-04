package com.example.asd.repository;

import com.example.asd.model.entity.TypeMember;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeMemberRepository extends JpaRepository<TypeMember, Integer> {
}
