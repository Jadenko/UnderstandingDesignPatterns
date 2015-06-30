package com.jadbouchouka.structural.decorator.decorators;

import com.jadbouchouka.structural.decorator.IEngineer;

public class JavaSoftwareEngineer extends SpecializedSoftwareEngineer {

	public JavaSoftwareEngineer(IEngineer engineer) {
		super(engineer);
	}

	@Override
	public String descirption() {
		return engineer.descirption() + ", and my annual salary is 45K$";
	}
}
