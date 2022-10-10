package org.demo.services;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.demo.services.impl.CalculatorServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CalculatorServiceMockTest {

	@Mock
	private WriterService writerServiceMock; 
    
	@Mock
	private LanguageService languageServiceMock; 
    
	@BeforeEach
    void beforeEach() {
		when(languageServiceMock.getLanguage(30)).thenReturn("Y0");
		when(languageServiceMock.getLanguage(31)).thenReturn("Y1");
		when(languageServiceMock.getLanguage(32)).thenReturn("Y2");
    }	
	
    @InjectMocks
    CalculatorService calc = new CalculatorServiceImpl(); // concrete class required for mock
    
    @DisplayName("Test CalculatorService add")
	@Test
	void testAdd() {
    	int r = calc.add(2,  3);
    	assertEquals(5, r);
	}

    @DisplayName("Test CalculatorService substract")
	@Test
	void testSubstract() {
    	// "doNothing()" is Mockito's default behavior for void methods
    	//doNothing().when(writerServiceMock).write(2);
    	int r = calc.subtract(12, 6);
    	assertEquals(6, r);
	}
    
	@Test
	void testGetHelp() {
		when(languageServiceMock.getLanguage(20)).thenReturn("Z0");
		when(languageServiceMock.getLanguage(21)).thenReturn("Z1");
		when(languageServiceMock.getLanguage(22)).thenReturn("Z2");
    	
		assertEquals("Help in Z0", calc.getHelp(20));
    	assertEquals("Help in Z1", calc.getHelp(21));
    	assertEquals("Help in Z2", calc.getHelp(22));

    	assertEquals("Help in Y0", calc.getHelp(30));
    	
    	//assertEquals("Help in FR", calc.getHelp(1));
	}

}
