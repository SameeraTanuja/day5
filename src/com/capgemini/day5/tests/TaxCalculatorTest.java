package com.capgemini.day5.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day5.domain.CountryNotValidException;
import com.capgemini.day5.domain.EmployeeNameInvalidException;
import com.capgemini.day5.domain.MyCalculator1;
import com.capgemini.day5.domain.TaxCalculator;
import com.capgemini.day5.domain.TaxNotEligibleException;

class TaxCalculatorTest {

	@Test
	void testCalculateTaxWithValidInputs() throws CountryNotValidException, EmployeeNameInvalidException, TaxNotEligibleException {
		assertEquals(16000,TaxCalculator.calculateTax("John",true,200000));
		assertEquals(3600,TaxCalculator.calculateTax("Sam",true,60000));
		assertEquals(2000,TaxCalculator.calculateTax("Hari",true,40000));
		assertEquals(800,TaxCalculator.calculateTax("Tanu",true,20000));
		
	
	}
	
		
	@Test
		void testCalculateTaxWithInvalidName() {
		Exception e;
		e = assertThrows(CountryNotValidException.class,()->TaxCalculator.calculateTax("Rohn",false,34000));
		assertEquals("The Employee should be Indian to calculate tax",e.getMessage());
//		fail("Not yet implemented");
	}
		
		@Test
		void testCalculateTaxWithValidIneligible() {
			Exception e;
			e = assertThrows(Exception.class,()->TaxCalculator.calculateTax("Rohn",false,34000));
			assertEquals("The Employee should be Indian to calculate tax",e.getMessage());
			
		
}
		
		@Test
		void testCalculateTaxWithInvalidCountry() {


}
}
