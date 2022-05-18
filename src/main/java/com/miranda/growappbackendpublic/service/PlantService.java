package com.miranda.growappbackendpublic.service;

import com.miranda.growappbackendpublic.model.Plant;
import com.miranda.growappbackendpublic.repository.PlantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PlantService {

    @Autowired
    PlantRepository plantRepository;

    public List<Plant> getPlants() {
        return plantRepository.findAll();
    }

    //Hämta plantor som ska sås i en vald månad
    public Optional<Plant> findById(Long id) {
      return plantRepository.findById(id);
    }

    public List<Plant> getPlantsBySo(int so) {
        return plantRepository.findPlantsBySo(so);

    }

    public List<Plant> getPlantsByHarvest(int harvest) {
        return plantRepository.findPlantsByHarvest(harvest);
    }
}

