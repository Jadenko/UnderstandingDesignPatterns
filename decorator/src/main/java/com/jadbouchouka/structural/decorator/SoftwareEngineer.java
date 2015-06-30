package com.jadbouchouka.structural.decorator;

public class SoftwareEngineer implements IEngineer {

	@Override
	public String graduate() {
		return "Hi I'm a software engineer, and I graduated from the university after 5 years";
	}

	@Override
	public String descirption() {
		return "I can make softwares";
	}

}
