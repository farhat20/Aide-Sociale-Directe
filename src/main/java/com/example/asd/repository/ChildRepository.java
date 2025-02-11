package com.example.asd.repository;

import com.example.asd.model.entity.Child;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ChildRepository extends JpaRepository<Child, Long> {
    Optional<Child> findByIdcs(Long idcs);

    List<Child> findAll();

    boolean existsById(Long idcs);
}
