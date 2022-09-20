package com.javatechie;

import com.javatechie.service.CalculatorService;
import lombok.NoArgsConstructor;
import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.powermock.api.mockito.PowerMockito.doReturn;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
@PrepareForTest(fullyQualifiedNames = "com.javatechie.service.*")
@NoArgsConstructor
class CalculatorServiceApplicationTests {

    @InjectMocks
    private CalculatorService service;


    @Test
    public void testCalculate() {
        int i1 = 10;
        int i2 = 20;
        String operationType = "sum";
        String result = service.calculate(i1, i2, operationType);
        assertEquals(result, "Here the result is ! "+30);
    }



//	@Test
//    public void testMultiply() throws Exception {
//        CalculatorService spy = PowerMockito.spy(service);
//        doReturn(80).when(spy, "multiply", any(),any());
//        long result = spy.calculate(20, 4, "multiply");
//        assertEquals(result, 80);
//    }


}
