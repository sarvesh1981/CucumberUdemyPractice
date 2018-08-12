package com.udemy.cucumber.pageObject;

public class FloatDoubleCalc {

	static Double lbValue= 0.453592;
	static double result;
	
	public static void lbToKg(Double intValue) {
		Double d= intValue*lbValue;
		System.out.println("Value in KG="+d);
	}
	
	public static void verifyNum(double firstNum,double secondNum) {
		
		result = firstNum+secondNum;
		System.out.println("result ="+result);
		result*=25;
		System.out.println("result ="+result);
		result%=40;
		System.out.println("result ="+result);
		if(result<=20)
			System.out.println("Total was over the limit");
	}
	
	public static void main(String[] str) {
		FloatDoubleCalc.lbToKg(2d);
		FloatDoubleCalc.verifyNum(20, 80);
	}
}
