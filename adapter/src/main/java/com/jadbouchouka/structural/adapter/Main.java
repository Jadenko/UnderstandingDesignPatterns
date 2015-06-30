package com.jadbouchouka.structural.adapter;

import com.jadbouchouka.structural.adapter.services.Engineer;
import com.jadbouchouka.structural.adapter.services.SoftwareEngineerServices;
import com.jadbouchouka.structural.adapter.services.SoftwareEngineerServices.Language;

public class Main {

	static SoftwareEngineerServices softwareEngineerServices = new SoftwareEngineerServices();

	public static void main(String[] args) {
		System.out.println(getResults());
	}

	public static StringBuilder getResults() {
		StringBuilder result = new StringBuilder();

		Engineer engineer = softwareEngineerServices.getSoftwareEngineer(Language.JAVA);
		result.append(engineer.doWork());

		result.append("\n----------------Vs.----------------\n");

		engineer = softwareEngineerServices.getSoftwareEngineer(Language.GROOVY);
		result.append(engineer.doWork());

		result.append("\n----------------Vs.----------------\n");

		engineer = softwareEngineerServices.getSoftwareEngineer(Language.SCALA);
		result.append(engineer.doWork());

		return result;
	}

}
