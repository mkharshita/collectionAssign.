package com.capgemini.Assignment;

import java.util.ArrayList;


public class ProgramClass implements Comparable<ProgramClass>
{
	private int id;
	private String name;
	private ArrayList<Vehicle> vehicles;
	public ProgramClass() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ProgramClass(int id, String name, ArrayList<Vehicle> vehicles2) {
		super();
		this.id = id;
		this.name = name;
		this.vehicles = vehicles2;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<Vehicle> getVehicles() {
		return vehicles;
	}
	public void setVehicles(ArrayList<Vehicle> vehicles) {
		this.vehicles = vehicles;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Program [id="+id+"]    [name="+name+"]    [Vehicles="+vehicles+"]";
	}
	@Override
	public int compareTo(ProgramClass o) {
		return this.id-o.getId();
	}
	
	
	
	
}
