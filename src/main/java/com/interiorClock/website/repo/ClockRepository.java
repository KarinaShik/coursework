package com.interiorClock.website.repo;

import com.interiorClock.website.entities.ClockEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClockRepository extends JpaRepository<ClockEntity, Integer> {

    List<ClockEntity> findAllByCategory(String category, org.springframework.data.domain.Sort sort);
}
