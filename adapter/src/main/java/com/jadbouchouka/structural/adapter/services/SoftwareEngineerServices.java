package com.jadbouchouka.structural.adapter.services;

public class SoftwareEngineerServices {

	public enum Language {
		JAVA, SCALA, GROOVY
	}

	public Engineer getSoftwareEngineer(Language language) {
		return new SoftwareEngineerAdapter(language);
	}

}
