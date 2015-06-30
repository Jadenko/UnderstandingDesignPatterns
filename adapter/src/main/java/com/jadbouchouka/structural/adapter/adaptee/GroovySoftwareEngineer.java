package com.jadbouchouka.structural.adapter.adaptee;

public class GroovySoftwareEngineer implements ISoftwareEngineer {

	@Override
	public String presentation() {
		return "Hi, I'm a Groovy software enginneer";
	}

	@Override
	public String getEnv() {
		return "I work specially on Groovy/Grails environement";
	}

	@Override
	public String getIDEs() {
		return "I'm programming on STS";
	}
}
