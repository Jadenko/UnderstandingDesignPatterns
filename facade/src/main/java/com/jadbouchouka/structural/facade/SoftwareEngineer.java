package com.jadbouchouka.structural.facade;

import com.jadbouchouka.structural.facade.services.PersonalLifeServices;
import com.jadbouchouka.structural.facade.services.RoutineServices;
import com.jadbouchouka.structural.facade.services.WorkServices;

public class SoftwareEngineer {

	private final PersonalLifeServices personalLifeServices;

	private final RoutineServices routineServices;

	private final WorkServices workServices;

	public SoftwareEngineer() {
		personalLifeServices = new PersonalLifeServices();
		routineServices = new RoutineServices();
		workServices = new WorkServices();
	}

	public String startDay() {
		StringBuffer buffer = new StringBuffer();

		buffer.append(routineServices.breakFast()).append("\n");
		buffer.append(workServices.turnOnComputer()).append("\n");
		buffer.append(workServices.doWork()).append("\n");
		buffer.append(routineServices.lunch()).append("\n");
		buffer.append(workServices.makeCoffe()).append("\n");
		buffer.append(personalLifeServices.doSport()).append("\n");
		buffer.append(personalLifeServices.meetFriends()).append("\n");
		buffer.append(routineServices.dinner());

		return buffer.toString();
	}

}
