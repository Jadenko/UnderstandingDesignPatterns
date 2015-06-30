package com.jadbouchouka.adapter.service;

import com.jadbouchouka.adapter.adaptee.GroovySoftwareEngineer;
import com.jadbouchouka.adapter.adaptee.ISoftwareEngineer;
import com.jadbouchouka.adapter.adaptee.JavaSoftwareEngineer;
import com.jadbouchouka.adapter.adaptee.ScalaSoftwareEngineer;
import com.jadbouchouka.adapter.service.SoftwareEngineerServices.Language;

/**
 * The Adapter
 *
 * @author Jad B.
 */
public class SoftwareEngineerAdapter implements Engineer {

	private ISoftwareEngineer softwareEngineer;

	public SoftwareEngineerAdapter(Language language) {
		switch (language) {
			case JAVA:
				softwareEngineer = new JavaSoftwareEngineer();
				break;

			case SCALA:
				softwareEngineer = new ScalaSoftwareEngineer();
				break;

			case GROOVY:
				softwareEngineer = new GroovySoftwareEngineer();
				break;

		}
	}

	@Override
	public String doWork() {
		StringBuilder builder = new StringBuilder();
		builder.append(softwareEngineer.presentation());
		builder.append("\n");
		builder.append(softwareEngineer.getEnv());
		builder.append("\n");
		builder.append(softwareEngineer.getIDEs());
		return builder.toString();
	}

}
