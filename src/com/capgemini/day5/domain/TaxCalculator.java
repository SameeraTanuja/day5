package com.capgemini.day5.domain;

public class TaxCalculator {
	public static double calculateTax(String empName, boolean isIndian, double empSal)throws CountryNotValidException,EmployeeNameInvalidException,TaxNotEligibleException {
		double taxAmount;
		if(isIndian==false) {
			throw new CountryNotValidException("The Employee should be Indian to calculate tax");
		}
		 if(empName==null || empName=="") {
			throw new EmployeeNameInvalidException("The Employee name cannot be empty");
		 }
		 if(empSal<1000) {
			throw new TaxNotEligibleException("The Employee does not need to pay tax");
		 }
		
		if(empSal>100000 && isIndian==true)
		{
			taxAmount=empSal*8/100;
			return taxAmount;
		}
		if(empSal>50000 && empSal<100000 && isIndian==true) {
			taxAmount=empSal*6/100;
			return taxAmount;
			
		}
		if(empSal>30000 && empSal<50000 && isIndian==true) {
			taxAmount=empSal*5/100;
			return taxAmount;
		}
		if(empSal>10000 && empSal<30000 && isIndian==true) {
			taxAmount=empSal*4/100;
			return taxAmount;
		}
		return 0;
	}

}
