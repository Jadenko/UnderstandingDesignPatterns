package com.jadbouchouka.structural.adapter.adaptee;

public class ScalaSoftwareEngineer implements ISoftwareEngineer {

	@Override
	public String presentation() {
		return "Hi, I'm a Scala software enginneer";
	}

	@Override
	public String getEnv() {
		return "I work specially on Scala environement";
	}

	@Override
	public String getIDEs() {
		return "I'm programming on Scala IDE";
	}
}
