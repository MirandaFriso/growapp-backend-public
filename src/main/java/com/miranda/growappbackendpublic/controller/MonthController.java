package com.miranda.growappbackendpublic.controller;

import com.miranda.growappbackendpublic.model.Month;
import com.miranda.growappbackendpublic.repository.MonthRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/growapp")
public class MonthController {

    @Autowired
    private MonthRepository monthRepository;

    @GetMapping("/months")
    public List<Month> getMonths() {
        return this.monthRepository.findAll();
    }
}

