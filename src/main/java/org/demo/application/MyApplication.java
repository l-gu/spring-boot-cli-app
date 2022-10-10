package org.demo.application;

import org.demo.services.BonjourService;
import org.demo.services.CalculatorService;
import org.demo.services.HelloService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyApplication {

	private final Logger log = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private HelloService helloService ;
	
	@Autowired
	private BonjourService bonjourService ;
	
	@Autowired
	private CalculatorService calculatorService ;
	
    public void run(String[] args) {
    	log.info("Starting application...");
    	log.info("args.length = " + args.length);

    	helloService.hello("Bob");
    	bonjourService.bonjour("John");
    	
    	log.info("add(2,6) = " + calculatorService.add(2,6));
    	log.info("subtract(12,4) = " + calculatorService.subtract(12,4));
    }
}
