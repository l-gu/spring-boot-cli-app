package org.demo.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class HelloService {

	private final Logger log = LoggerFactory.getLogger(this.getClass());  

	public void hello(String name) {
		log.info("in 'hello' method");
		System.out.println("Hello " + name + " !");
	}
}
