package com.acme.able;

import org.apache.commons.math3.util.ArithmeticUtils;
import org.apache.commons.text.WordUtils;

public class Test {

	public static void main(String[] args) {
		System.out.println(
			"1 + 2 is equal to " + ArithmeticUtils.addAndCheck(1, 2) + ".");
		System.out.println(WordUtils.capitalize("aaa, bbb!"));
	}

}