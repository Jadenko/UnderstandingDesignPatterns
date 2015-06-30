package com.jadbouchouka.structural.decorator.decorators;

import com.jadbouchouka.structural.decorator.IEngineer;

/**
 * The Decorator
 *
 * @author Jad B.
 */
public abstract class SpecializedSoftwareEngineer implements IEngineer {

	IEngineer engineer;

	public SpecializedSoftwareEngineer(IEngineer engineer) {
		this.engineer = engineer;
	}

	@Override
	public String graduate() {
		return engineer.graduate();
	}

	@Override
	public String descirption() {
		return engineer.descirption();
	}

}
