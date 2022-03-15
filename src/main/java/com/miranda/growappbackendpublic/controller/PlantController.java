package com.miranda.growappbackendpublic.controller;

import com.miranda.growappbackendpublic.model.Plant;
import com.miranda.growappbackendpublic.repository.PlantRepository;
import com.miranda.growappbackendpublic.service.PlantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/growapp/")
public class PlantController {

    @Autowired
    PlantService plantService;

    //TODO hämta ut plantor där så är valt månadsId
    @GetMapping("plants/so/{so}")
    public List<Plant> findPlantsBySo(@PathVariable("so") int so) {
        return plantService.getPlantsBySo(so);
    }

    //TODO hämta ut plantor där skörda är valt månadsId
    @GetMapping("plants/harvest/{harvest}")
    public List<Plant> findPlantsByHarvest(@PathVariable("harvest") int harvest) {
        return plantService.getPlantsByHarvest(harvest);
    }

    @GetMapping(value = "plants")
    public List<Plant> findAllPlants() {
        return plantService.getPlants();
    }

    //Hämtar ut information om en planta
    @GetMapping(value = "plants/id/{id}")
    public Optional<Plant> findPlantById(@PathVariable("id") long id) {
        return plantService.findById(id);
    }
}
