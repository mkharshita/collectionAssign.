package com.capgemini.Assignment;


/**
* The Vehicle Class has the properties,
* getter and setter methods.
*/

public class Vehicle implements Comparable<Vehicle>
{
	private int identifierNo;
	private int modelYear;
	private String colour;
	public Vehicle(int identifierNo, int modelYear, String colour) {
		super();
		this.identifierNo = identifierNo;
		this.modelYear = modelYear;
		this.colour = colour;
	}
	public int getIdentifierNo() {
		return identifierNo;
	}
	public void setIdentifierNo(int identifierNo) {
		this.identifierNo = identifierNo;
	}
	public int getModelYear() {
		return modelYear;
	}
	public void setModelYear(int modelYear) {
		this.modelYear = modelYear;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	@Override
	public String toString() {
		return " [identifierNo="+identifierNo+"]  [modelYear="+modelYear+"]  [colour="+colour+"] \n \t";
	}
	@Override
	public int compareTo(Vehicle o) {
		return this.identifierNo-o.getIdentifierNo();
	}

}
