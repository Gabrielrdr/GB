package com.liferay.basic.training.able.internal.number.generator;

import com.liferay.basic.training.able.number.generator.AbleNumberGenerator;

import org.apache.commons.math3.util.ArithmeticUtils;

import org.osgi.service.component.annotations.Component;

@Component(
	immediate = true, service = {AbleNumberGenerator.class}
)
public class AbleNumberGeneratorImpl implements AbleNumberGenerator {

	public long generate() {
		return ArithmeticUtils.mulAndCheck(30624700, 2);
	}

}