package com.jadbouchouka.structural.adapter.adaptee;

public class JavaSoftwareEngineer implements ISoftwareEngineer {

	@Override
	public String presentation() {
		return "Hi, I'm a Java software enginneer";
	}

	@Override
	public String getEnv() {
		return "I work specially on Java/JEE environement";
	}

	@Override
	public String getIDEs() {
		return "I'm programming on Eclipse, IntelliJ or NetBeans";
	}

}
