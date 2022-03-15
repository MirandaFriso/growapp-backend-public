package com.miranda.growappbackendpublic.repository;

import com.miranda.growappbackendpublic.model.Plant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PlantRepository extends JpaRepository <Plant, Long> {

    List<Plant> findPlantsBySo(int so);

    List<Plant> findPlantsByHarvest(int harvest);
}
