package com.jadbouchouka.structural.bridge;

import com.jadbouchouka.structural.bridge.client.ElectronicEngineer;
import com.jadbouchouka.structural.bridge.client.SoftwareEngineer;
import com.jadbouchouka.structural.bridge.impl.electronic.RoboticEngineerImpl;
import com.jadbouchouka.structural.bridge.impl.software.GroovySoftwareEngineer;
import com.jadbouchouka.structural.bridge.impl.software.JavaSoftwareEngineer;

public class Main {

	public static void main(String[] args) {
		System.out.println(getResult());
	}

	public static StringBuilder getResult() {
		StringBuilder builder = new StringBuilder();

		SoftwareEngineer softwareEngineer1 = new SoftwareEngineer(new JavaSoftwareEngineer());
		builder.append(softwareEngineer1.graduate()).append("\n");
		builder.append(softwareEngineer1.description()).append("\n\n");

		SoftwareEngineer softwareEngineer2 = new SoftwareEngineer(new GroovySoftwareEngineer());
		builder.append(softwareEngineer2.graduate()).append("\n");
		builder.append(softwareEngineer2.description()).append("\n\n");

		ElectronicEngineer electronicEngineer = new ElectronicEngineer(new RoboticEngineerImpl());
		builder.append(electronicEngineer.graduate()).append("\n");
		builder.append(electronicEngineer.description());

		return builder;
	}

}
