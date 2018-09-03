package com.capgemini.day5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


	import static org.junit.jupiter.api.Assertions.assertEquals;
	import static org.junit.jupiter.api.Assertions.assertThrows;

	import org.junit.jupiter.api.BeforeEach;
	import org.junit.jupiter.api.Test;

	import com.capgemini.day5.MathException;
	import com.capgemini.day5.MyCalculator;
	import com.capgemini.day5.ZeroInputException;

	class MyCalculatorTest {

		MyCalculator c1 ;
		
		@BeforeEach
		void setup()
		{
			c1 = new MyCalculator() ;
		}
		
		

		@Test
		void testPower() {
			try 
			{
				assertEquals(243,c1.power(3, 5));
				assertEquals(16,c1.power(2, 4));
				assertThrows(ZeroInputException.class, () -> c1.power(0, 0));
				/*assertEquals(243,c1.power(3, 5));
				assertEquals(243,c1.power(3, 5));*/
			}
			catch(Exception e)
			{
				e.getMessage() ;
			}
			
			
		}
		
		
		

	

	@Test
	void test() {
//		fail("Not yet implemented");
	}

}
