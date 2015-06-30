package com.jadbouchouka.structural.bridge.client;

import com.jadbouchouka.structural.bridge.impl.IEngineerImpl;

public class SoftwareEngineer implements IEngineer {

	IEngineerImpl impl;

	public SoftwareEngineer(IEngineerImpl impl) {
		this.impl = impl;
	}

	@Override
	public String graduate() {
		return impl.graduateImpl();
	}

	@Override
	public String description() {
		return "I can make softwares";
	}

}
