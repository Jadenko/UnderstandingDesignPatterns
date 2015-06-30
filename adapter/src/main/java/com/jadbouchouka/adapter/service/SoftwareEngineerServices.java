package com.jadbouchouka.adapter.service;

public class SoftwareEngineerServices {

	public enum Language {
		JAVA, SCALA, GROOVY
	}

	public Engineer getSoftwareEngineer(Language language) {
		return new SoftwareEngineerAdapter(language);
	}

}
