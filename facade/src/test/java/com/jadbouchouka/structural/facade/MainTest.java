package com.jadbouchouka.structural.facade;

import static org.fest.assertions.Assertions.assertThat;

import org.fest.assertions.Condition;
import org.junit.Test;

public class MainTest {

	@Test
	public void mainTest() {
		String results = Main.getResults();
		assertThat(results).satisfies(condition);
	}

	private final Condition<String> condition = new Condition<String>() {

		@Override
		public boolean matches(String value) {
			if (value.startsWith("After I wake up") && value.endsWith("Dinner is usually at 9pm")) {
				return true;
			}
			return false;
		}
	};

}
