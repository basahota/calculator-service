package com.javatechie.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {


    public String calculate(int no1, int no2, String operationType) {
        String result = "Here the result is ! ";
        switch (operationType) {
            case "sum":
                result = result + "" + sum(no1, no2);
                break;
            case "multiply":
                result = result + "" + multiply(no1, no2);
                break;
        }
        return result;
    }

    private long sum(Integer no1, Integer no2) {
        return no1 + no2;
    }

    private long multiply(Integer no1, Integer no2) {
        return (long) no1 * no2;
    }
}
