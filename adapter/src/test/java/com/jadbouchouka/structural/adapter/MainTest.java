package com.jadbouchouka.structural.adapter;

import static org.fest.assertions.Assertions.assertThat;

import org.fest.assertions.Condition;
import org.junit.Test;

import com.jadbouchouka.structural.adapter.Main;

public class MainTest {

	@Test
	public void mainTest() {
		StringBuilder results = Main.getResults();
		assertThat(results).satisfies(condition);
	}

	private final Condition<Object> condition = new Condition<Object>() {

		@Override
		public boolean matches(Object value) {
			StringBuilder builder = (StringBuilder) value;
			if (builder.toString().contains("Java") && builder.toString().contains("Groovy")
					&& builder.toString().contains("Scala")) {
				return true;
			}
			return false;
		}
	};

}
