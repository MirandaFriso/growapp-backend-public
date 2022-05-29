package com.miranda.growappbackendpublic.controller;

import com.miranda.growappbackendpublic.model.Plant;
import com.miranda.growappbackendpublic.service.PlantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/growapp/")
public class PlantController {

    @Autowired
    private PlantService plantService;

    //Hämta ut plantor där så är valt månadsId
    @GetMapping("plants/so/{so}")
    public List<Plant> findPlantsBySo(@PathVariable("so") int so) {
        return plantService.getPlantsBySo(so);
    }

    //Hämta ut plantor där skörda är valt månadsId
    @GetMapping("plants/harvest/{harvest}")
    public List<Plant> findPlantsByHarvest(@PathVariable("harvest") int harvest) {
        return plantService.getPlantsByHarvest(harvest);
    }

    @GetMapping(value = "plants")
    public List<Plant> findAllPlants() {
        return plantService.getPlants();
    }

    @GetMapping(value = "plants/id/{id}")
    public Optional<Plant> findPlantById(@PathVariable("id") long id) {
        return plantService.findById(id);
    }
}
