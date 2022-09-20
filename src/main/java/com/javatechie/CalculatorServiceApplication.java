package com.javatechie;

import com.javatechie.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CalculatorServiceApplication {

    @Autowired
    public CalculatorService service;

    @GetMapping("/calculate/{no1}/{no2}/{operationType}")
    public String getResults(@PathVariable int no1, @PathVariable int no2, @PathVariable String operationType) {
        return service.calculate(no1, no2, operationType);
    }

    public static void main(String[] args) {
        SpringApplication.run(CalculatorServiceApplication.class, args);
    }

}
