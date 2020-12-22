package com.breizh_video.breizh_video.services;

import com.breizh_video.breizh_video.model.Village;
import com.breizh_video.breizh_video.repositories.VillageRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataBaseLoader implements CommandLineRunner {

    private final VillageRepository villageRepository;

    public DataBaseLoader(VillageRepository villageRepository) {
        this.villageRepository = villageRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Village Nantes = new Village("Nantes", "44000");

        villageRepository.save(Nantes);
    }
}