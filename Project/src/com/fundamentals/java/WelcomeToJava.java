package com.fundamentals.java;

/*
public - Access Modifier
class - File type
WelcomeToJava - Name of class
*/
public class WelcomeToJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// someMethod();
		// myAssignmentExample();
		myDecisionExample();
		mySongExample();
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
