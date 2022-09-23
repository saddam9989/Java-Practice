package com.junit.testcase;

import static org.junit.Assert.*;

import org.junit.Test;

import com.junit.logic.Calculation;

public class Testcase {

	@Test
	public void add() {
		assertEquals(4, Calculation.add(2, 3));
	}
}
