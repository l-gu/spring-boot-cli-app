package org.demo.services.impl;

import org.demo.services.BonjourService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

//with Lombok
// import lombok.extern.slf4j.Slf4j;
//@Slf4j

@Component
public class BonjourServiceImpl implements BonjourService {

//	private final Logger log = LoggerFactory.getLogger(BonjourServiceImpl.class); 
	private final Logger log = LoggerFactory.getLogger(this.getClass());
	
//	private final Logger log ; 
//	public BonjourServiceImpl() {
//		super();
//	//	log = LoggerFactory.getLogger(this.getClass()); 
//	}

	public void bonjour(String name) {
		log.info("in bonjour method");
		System.out.println("Bonjour " + name + " !");
	}
}
