package org.demo.services;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.when;

import org.demo.services.impl.CalculatorServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
// if the Spring Boot starter class is not in a higher package level => specify the class (cannot be found)
//@SpringBootTest(classes = SpringBootStarter.class) 
class CalculatorServiceBasicTest {

    @Autowired
	CalculatorService calc;

    @DisplayName("Test CalculatorService add")
	@Test
	void testAdd() {
    	int r = calc.add(2,  3);
    	assertEquals(5, r);
	}

    @DisplayName("Test CalculatorService substract")
	@Test
	void testSubstract() {
    	int r = calc.subtract(12, 6);
    	assertEquals(6, r);
	}

	@Test
	void testGetHelp() {
    	assertEquals("Help in ??", calc.getHelp(0));
    	assertEquals("Help in FR", calc.getHelp(1));
	}

}
