package com.fundamentals.java;

public class House {
	
	private String windows;
	private String doors;
	private boolean hasStairs;
	protected String value = "My House";
	
	public void setWindows(String value) {
		this.windows = value; 
	}
	
	public String getWindows() {
		return windows;
	}
	
	public void setDoor(String doors) {
		this.doors = doors;
	}
	
	public String getDoors() {
		return doors;
	}
	
	public void setHasStairs(boolean value) {
		this.hasStairs = value;
	}
	
	public boolean getHasStairs() {
		return hasStairs;
	}
	
	public void openDoor() {
		System.out.println("I opened a Steel Door"+value);
		
	}
	
	public void closeDoor() {
		
	}

}
