package com.primitive.datatype;

import java.math.BigDecimal;

public class SimpleIntrestCalRun {

	public static void main(String[] args) {
		SimpleInterestCal calu=new SimpleInterestCal("4500", "7.5");
		BigDecimal totalval=calu.calculateTotalVal(5);
		System.out.println(totalval);
	}

}
