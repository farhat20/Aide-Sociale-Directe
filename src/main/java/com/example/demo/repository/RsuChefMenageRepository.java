package com.example.demo.repository;

import com.example.demo.model.entity.RsuChefMenage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface RsuChefMenageRepository extends JpaRepository<RsuChefMenage, Long> {

    @Query(value = "SELECT * FROM D_RSU_CHEF_MENAGE_AID", nativeQuery = true)
    List<Map<String, Object>> findAllDynamic();
}
