package com.fundamentals.java;

import java.lang.reflect.Array;
import com.fundamentals.data.*;
/*
public - Access Modifier
class - File type
WelcomeToJava - Name of class
*/
public class WelcomeToJava {
	
	public static final int MY_VALUE = 10;
	public static int MY_OTHER_VALUE;
	
	static {
		MY_OTHER_VALUE = 25;
		int total = MY_VALUE * MY_OTHER_VALUE; // total should 250
		System.out.println(total);
	}

	public static void main(String[] args) {
		MY_VALUE = 35;
		// TODO Auto-generated method stub
		// someMethod();
		// myAssignmentExample();
		//myDecisionExample();
		//mySongExample();
		//myHouse();
		//sampleArray();
		//myTwoDimensionalArray();
		myJaggedArray();
		accessModifierExamples();
		//overloadExample();
		sampleUtility();
		//something(); //Can not run in a static method
	}
	
	public void something() {//Will not run in a static method}
	
	public static void sampleUtility() {
		System.out.println(Utility.addSomething(5, 23));
	}
	
	public static void overrideExample() {
		House myHouse = new House();
		Condo myCondo = new Condo();
		House myOtherhouse = new Condo(); //Implicit Cast
		Condo myOtherCondo = (Condo)new House(); //Explicit Cast
		//myHouse.openDoor();
		//myCondo.openDoor();
		myOtherhouse.openDoor();
	}
	
	public static void overloadExample() {
		Apple myApple = new Apple();
		myApple.display("Granny Smiths", 5);
		myApple.display("Sour", 3, "Red");
		//String show = myApple.display("Granny Smiths", "Green");
		System.out.println(myApple.display("Granny Smiths", "Green"));
		
		System.out.println(Apple.SOUR_SCALE);
		System.out.println(myApple.SOUR_SCALE);
		System.out.println(Apple.SWEET_SCALE);
		Apple.SWEET_SCALE = 25;
	}
	
	public static void overloadExample() {
		Apple myApple = new Apple();
		myApple.display("Granny Smiths", 5);
		myApple.display("Sour", 3, "Red");
		String show = myApple.display("Granny Smiths", "Green");
		System.out.println(myApple.display("Granny Smiths", "Green"));
	}
	
	public static void inheritanceExample() {
		House house = new House();
		Condo condo = new Condo();
		condo.setDoor("Red Door");
		System.out.println(condo.getDoors());
		house.setDoor("Purple Door");
		System.out.println(house.getDoors());
	}
	
	public static void quiz1() {
		Quiz myQuiz = new Quiz1();
		//myQuiz.divisibleByThree();
		//myQuiz.grade('g');
		//myQuiz.grade('b');
		myQuiz.oddNumbers();
	}
	
	public static void accessModifierExamples() {
		PrimitiveExamples pe = new PrimitiveExamples();
		Apple myApple = new Apple();
		pe.myProtectedMethod();
		
	}
	
	public static void myJaggedArray() {
int[][] anArray = new int [3][5];
		
		anArray[0][0] = 6;
		anArray[0][1] = 8;
		anArray[0][2] = 10;
		anArray[0][3] = 11;
		anArray[0][4] = 13;
		anArray[1][0] = 12;
		anArray[1][1] = 14;
		anArray[1][2] = 16;
		anArray[1][3] = 17;
		anArray[1][4] = 19;
		anArray[2][0] = 18;
		anArray[2][1] = 20;
		anArray[2][2] = 22;
		anArray[2][3] = 21;
		anArray[2][4] = 23;
		System.out.println(anArray[0].length);
		for(int i = 0; i < anArray.length; i++) {
			for(int j = 0; j < anArray[i].length; j++) {
			System.out.println(anArray[i][j]);
			}
		}
	}

	
	public static void myTwoDimensionalArray() {
		int[][] anArray = new int [3][3];
		
		anArray[0][0] = 6;
		anArray[0][1] = 8;
		anArray[0][2] = 10;
		anArray[1][0] = 12;
		anArray[1][1] = 14;
		anArray[1][2] = 16;
		anArray[2][0] = 18;
		anArray[2][1] = 20;
		anArray[2][2] = 22;
		//System.out.println(anArray.length); //
		for(int i = 0; i < anArray.length; i++) {
			for(int j = 0; j < anArray.length; j++) {
			System.out.println(anArray[i][j]);
			}
		}
	}
	
	public static void sampleArray() {
		String[] myStringArray = {"happy","monday","java"};
		int[] myIntArray = new int[3];
		myIntArray[0] = 5;
		myIntArray[1] = 17;
		myIntArray[2] = 10;
		
		int[] mySecondIntArray = myIntArray.clone();
		
		
		for(int i = 0; i < myIntArray.length; i++) {
			System.out.println(myIntArray[i]);
		}
		for(int i = 0; i < mySecondIntArray.length; i++) {
			System.out.println(myIntArray[i]);
		}
		int j = 0;
		while(j < myStringArray.length) {
			System.out.println(myStringArray[j]);
			j++;
		}
	}
	
	public static void myHouse() {
		House myHouse = new House();
		//myHouse.doors = "Red Doors";
		myHouse.setDoor("Red Doors");
		
		House mySecondHome = new House();
		//mySecondHome.doors = "Purple Doors";
		mySecondHome.setDoor("Purple Doors");
		
		House myThirdHome = myHouse;
		myHouse = mySecondHome;
		
		House[] houseArray = new House[] { myHouse, mySecondHome, myThirdHome};
		
		System.out.println(myHouse.getDoors()); // 5 Red doors, 1 null, ? Purple Doors
		System.out.println(mySecondHome.getDoors()); // Purple Doors
		System.out.println(myThirdHome.getDoors()); // 2 null, 3 Red Doors, 1 Purple Doors
		
		int i = 0;
		do {
			System.out.println(houseArray[i].getDoors());
			i++;
		} while(i < houseArray.length);
	}
	
	public static void myCat() {
		Cat myCat = new Cat();
	}
	
	public static void mySongExample() {
		SongsExamples se = new SongsExamples();
		String beer = se.bottlesOfBeer();
		System.out.println(beer);
	}
	
	public static void myDecisionExample() {
		DecisionExamples de = new DecisionExamples();
		de.basicifStatement();
		de.chainIfStatement();
		de.switchExample(5);
		
		LoopingExamples le = new LoopingExamples();
		le.myWhileLoop();
		le.myDoWhileLoop();
		le.myForLoop();
		le.myBranchExample();
	}

	public static void myAssignmentExample() {
		AssignmentExample ae = new AssignmentExample();
		ae.plusEqualsExample();
		ae.minusEqualsExample();
		ae.multiplyEqualsExample();
		ae.divisionEqualsExample();
		ae.modulusEqualsExample();
		ae.leftShiftEqualsExample();
		ae.rightShiftEqualsExample();
		ae.bitwiseAndEqualsExample();
		ae.bitwiseOrEqualsExample();
	}

	// My first method
	public static void someMethod() {
		System.out.println("Welcome to Java");
	}

}
