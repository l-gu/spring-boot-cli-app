package org.demo.services.impl;

import org.demo.services.LanguageService;
import org.springframework.stereotype.Component;

@Component
public class LanguageServiceImpl implements LanguageService {

	@Override
	public String getLanguage(int code) {
		switch(code) {
		case 1: return "FR";
		case 2: return "EN";
		case 3: return "IT";
		default: return "??";
		}
	}

}
