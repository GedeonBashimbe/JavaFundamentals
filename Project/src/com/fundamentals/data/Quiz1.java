package com.fundamentals.data;

public class Quiz1 {
	
	public void divisibleByThree() {
		for (int i = 0; i < 30; i++) {
			if(i % 3 == 0) {
				System.out.println(i);
			}
		}
	}
	
	public void evenNumbers() {
		for(int i = 0; i < 100; i++) {
			if(i % 2 == 0) {
				System.out.println(i);
			}
		}
	}
	
	public void oddNumbers() {
		for(int i = 0; i < 100; i++) {
			if(i % 2 == 0) {
				if (i == 0) {
					continue;
				}
				System.out.println(i - 1);
			}
		}
	}
	
	public void grade(char value) {
		switch(value) {
		case 'E':
		case 'e':
			System.out.println("Excellent");
			break;
		case	'V':
		case 'v':
			System.out.println("Very Good");
			break;
		case 'G':
		case 'g':
			System.out.println(:"Good");
			break;
		case 'A':
		case 'a':
			System.out.println("Average");
			break;
		case 'F':
		case 'f':
			System.out.println("Fail");
			break;
			default:
				System.out.println("Not a valid number");
				break;
		}
	}

}
