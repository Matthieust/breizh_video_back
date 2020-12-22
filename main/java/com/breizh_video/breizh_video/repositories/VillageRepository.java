package com.breizh_video.breizh_video.repositories;

import com.breizh_video.breizh_video.model.Village;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VillageRepository extends JpaRepository<Village, Long> {
}
