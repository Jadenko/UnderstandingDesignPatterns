package com.jadbouchouka.adapter;

import com.jadbouchouka.adapter.service.Engineer;
import com.jadbouchouka.adapter.service.SoftwareEngineerServices;
import com.jadbouchouka.adapter.service.SoftwareEngineerServices.Language;

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
