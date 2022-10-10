package org.demo.services.impl;

import org.demo.services.WriterService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class WriterServiceImpl implements WriterService {

	private final Logger log = LoggerFactory.getLogger(this.getClass());

	@Override
	public void write(int value) {
		log.info("write("+value+")");	
	}

}
