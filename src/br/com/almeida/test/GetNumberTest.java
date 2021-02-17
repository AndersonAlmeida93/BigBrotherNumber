package br.com.almeida.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import br.com.almeida.impl.GetNumber;

public class GetNumberTest {

	@Test
	public void shouldGetNumber() {
		
		var number1 = 123;
		var number2 = 2348;
		
		var returnedNumber1 = 321;
		var returnedNumber2 = 8432;
		
		int obtainedReturn1 = GetNumber.init(number1);
		assertEquals(returnedNumber1, obtainedReturn1);
		
		int obtainedReturn2 = GetNumber.init(number2);
		assertEquals(returnedNumber2, obtainedReturn2);
	}
	
	@Test
	public void shouldGetNumberNegative() {
		
		var number1 = 129433162;
		
		var returnedNumber1 = -1;
		
		int obtainedReturn1 = GetNumber.init(number1);
		
		assertEquals(returnedNumber1, obtainedReturn1);
	}
	
	
}
