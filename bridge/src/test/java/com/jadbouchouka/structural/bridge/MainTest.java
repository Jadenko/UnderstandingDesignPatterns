package com.jadbouchouka.structural.bridge;

import static org.fest.assertions.Assertions.assertThat;

import org.fest.assertions.Condition;
import org.junit.Test;

public class MainTest {

	@Test
	public void mainTest() {
		StringBuilder results = Main.getResult();
		assertThat(results).satisfies(condition);
	}

	private final Condition<Object> condition = new Condition<Object>() {

		@Override
		public boolean matches(Object value) {
			StringBuilder builder = (StringBuilder) value;
			if (builder.toString().contains("Java") && builder.toString().contains("Groovy")
					&& builder.toString().contains("electronic")) {
				return true;
			}
			return false;
		}
	};

}
