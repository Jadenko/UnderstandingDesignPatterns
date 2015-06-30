package com.jadbouchouka.structural.decorator;

import com.jadbouchouka.structural.decorator.decorators.GroovySoftwareEngineer;
import com.jadbouchouka.structural.decorator.decorators.JavaSoftwareEngineer;

public class Main {

	public static void main(String[] args) {
		System.out.println(getResults());
	}

	public static StringBuilder getResults() {
		StringBuilder builder = new StringBuilder();

		IEngineer softwareEngineer = new SoftwareEngineer();
		builder.append(softwareEngineer.graduate()).append("\n");
		builder.append(softwareEngineer.descirption()).append("\n\n");

		IEngineer javaSoftwareEngineer = new JavaSoftwareEngineer(softwareEngineer);
		builder.append(javaSoftwareEngineer.graduate()).append("\n");
		builder.append(javaSoftwareEngineer.descirption()).append("\n\n");

		IEngineer groovySoftwareEngineer = new GroovySoftwareEngineer(softwareEngineer);
		builder.append(groovySoftwareEngineer.graduate()).append("\n");
		builder.append(groovySoftwareEngineer.descirption()).append("\n\n");

		return builder;
	}

}
