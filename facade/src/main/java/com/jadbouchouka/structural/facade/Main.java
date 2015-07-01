package com.jadbouchouka.structural.facade;

public class Main {

	public static void main(String[] args) {
		System.out.println(getResults());
	}

	public static String getResults() {
		SoftwareEngineer softwareEngineer = new SoftwareEngineer();
		return softwareEngineer.startDay();
	}

}
