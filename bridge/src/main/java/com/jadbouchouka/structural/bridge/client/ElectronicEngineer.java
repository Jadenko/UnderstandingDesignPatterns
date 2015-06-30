package com.jadbouchouka.structural.bridge.client;

import com.jadbouchouka.structural.bridge.impl.IEngineerImpl;

public class ElectronicEngineer implements IEngineer {

	IEngineerImpl impl;

	public ElectronicEngineer(IEngineerImpl impl) {
		this.impl = impl;
	}

	@Override
	public String graduate() {
		return impl.graduateImpl();
	}

	@Override
	public String description() {
		return "I study climate and weather condition";
	}
}
