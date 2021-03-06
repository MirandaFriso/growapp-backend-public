package com.miranda.growappbackendpublic.repository;

import com.miranda.growappbackendpublic.model.Month;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MonthRepository extends JpaRepository <Month, Long>{
}
