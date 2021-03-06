package com.fundamentals.java;

public class OperatorExamples {
	
	int numValue1 = 25, numValue2 = 43;
	
	// Method increments the value by 1; same as numValue = numValue + 1;
	public void incrementSample() {
		numValue1++;
		System.out.println(numValue1);
		
		int value = ++numValue1;
		System.out.println(value);
	}
	
	public void decrementSample() {
		numValue1--;
		System.out.println(numValue1);
		
		int value = --numValue1;
		System.out.println(value);
	}
	
	public void equalsExample() {
		String a = "happy" ,b = "happy" ,c = new String("happy");
		
		System.out.println(a.equals(b)); // true
		System.out.println(a == c); // 5 - true,
		System.out.println(a.equals(c)); // 4 - true, ?
	}
	
	public void equalsExample2() {
		int val1 = 10, val2 = 10;
		double val3 = 10.1;
		System.out.println(val1 == val2);
		System.out.println(val2 == val3);
	}
	
	// logical operator compares two expressions using And / Or
	// And means both expressions must be true
	// Or means the first expression must be true otherwise the second is checked
	// if the second one is also false, the whole statement is false.
	public void logicalExample() {
		int val = 15, val2 = 25, val3 = 16, val4 = 25;
		System.out.println(val == val3 && val2 == val4); // false
		System.out.println(val == val3 || val2 == val4); // 4 true, 1 false
		System.out.print(!(val2 == val4));
		System.out.println(val !=val2);
	}

}
