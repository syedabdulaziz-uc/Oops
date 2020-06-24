package com.primitive.datatype;

import java.math.BigDecimal;

public class SimpleInterestCal {
	BigDecimal pal;
	BigDecimal intr;
	public SimpleInterestCal(String pal, String intr) {
		this.pal=new BigDecimal(pal);
		this.intr=new BigDecimal(intr).divide(new BigDecimal(100));
	}
	public BigDecimal calculateTotalVal(int numOfYr) {
		BigDecimal totalVal=pal.add(pal.multiply(intr).multiply(new BigDecimal(numOfYr)));
		return totalVal;
	}

}
