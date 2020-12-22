package com.breizh_video.breizh_video.services;

import com.breizh_video.breizh_video.model.Village;
import com.breizh_video.breizh_video.repositories.VillageRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VillageService {
    private VillageRepository villageRepository;

    public VillageService(VillageRepository villageRepository){
        this.villageRepository = villageRepository;
    }

    public List<Village> getAllVillages() {
        return villageRepository.findAll();
    }
}
