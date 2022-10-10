package org.demo.services.impl;

import org.demo.services.CalculatorService;
import org.demo.services.LanguageService;
import org.demo.services.WriterService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CalculatorServiceImpl implements CalculatorService {

	private final Logger log = LoggerFactory.getLogger(this.getClass());

	@Autowired
	WriterService writerService;
	
	@Autowired
	LanguageService languageService;
	
	@Override
	public int add(int value1, int value2) {
		log.info("'add' (" + value1 + "," + value2 + ")");
		int r = value1 + value2;
		writerService.write(r);
		return r;
	}

	@Override
	public int subtract(int value1, int value2) {
		log.info("'subtract' (" + value1 + "," + value2 + ")");
		int r = value1 - value2;
		writerService.write(r);
		return r;
	}

	@Override
	public String getHelp(int langCode) {
		log.info("'getHelp' (" + langCode + ")");
		String s = languageService.getLanguage(langCode);
		return "Help in " + s ;
	}
}
