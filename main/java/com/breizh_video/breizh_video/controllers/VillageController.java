package com.breizh_video.breizh_video.controllers;

import com.breizh_video.breizh_video.model.Village;
import com.breizh_video.breizh_video.services.VillageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class VillageController {
    @Autowired
    private VillageService villageService;

    public VillageController(VillageService villageService)
    {
     this.villageService = villageService;
    }

    @GetMapping("/villages")
    public List<Village> getAllVillage(){
        List<Village> result = villageService.getAllVillages();
        return result;
    }
}
