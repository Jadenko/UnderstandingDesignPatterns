package com.jadbouchouka.structural.decorator.decorators;

import com.jadbouchouka.structural.decorator.IEngineer;

public class GroovySoftwareEngineer extends SpecializedSoftwareEngineer {

	public GroovySoftwareEngineer(IEngineer engineer) {
		super(engineer);
	}

	@Override
	public String descirption() {
		return engineer.descirption() + ", and my annual salary is 40K$";
	}
}
