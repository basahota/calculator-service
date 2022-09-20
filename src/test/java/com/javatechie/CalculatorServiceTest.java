package com.javatechie;

import com.javatechie.service.CalculatorService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorServiceTest {

//    CalculatorService calculator = null;
//
//    @BeforeEach
//    public void init() {
//        calculator = new CalculatorService();
//    }
//
//    @Test
//    public void testSumCalculate() {
//        long result = calculator.calculate(1, 3, "sum");
//        assertEquals(result, 4);
//    }
////
////    @Test
////    public void testMultiplyCalculate() {
////        long result = calculator.calculate(1, 3, "multiply");
////        assertEquals(result, 3);
////    }
//
//    @Test
//    public void testMultiply() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
//        Method method = CalculatorService.class.getDeclaredMethod("multiply", Integer.class, Integer.class);
//        method.setAccessible(true);
//        long result = (long) method.invoke(calculator, 5, 3);
//        assertEquals(result, 15);
//    }
}
