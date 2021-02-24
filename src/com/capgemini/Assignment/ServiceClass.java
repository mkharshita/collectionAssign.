package com.capgemini.Assignment;

import java.util.Collections;
import java.util.List;


/**
* The ServiceClass implements an application that
* simply have printArrayList,sortByColour,sortByIdentifierNo
*/
public class ServiceClass {
	
	/**
	   * This method is used to print ArrayList<Vehicle>. 
	   * Uses foreach method to print the vehicles.
	   * @param vehicles This is the paramter to be printed
	   * @return void.
	   */
	public void printArrayList(List<Vehicle> vehicles) {
		vehicles.forEach((vehicle)->System.out.println(vehicle.getIdentifierNo()+"  "+
				vehicle.getModelYear()+"  "+vehicle.getColour()));
	}

	/**
	   * This method is used to sort the ArrayList<Vehicle> according to colour. 
	   * @param vehicles This is the paramter to be sorted
	   * @return void.
	   */
	public void sortByColour(List<Vehicle> vehicles){
		Collections.sort(vehicles,(vehicle1,vehicle2) -> 
						vehicle1.getColour().compareTo(vehicle2.getColour()));
	}
	
	/**
	   * This method is used to sort the ArrayList<Vehicle> according to Identifier Number. 
	   * @param vehicles This is the paramter to be sorted
	   * @return void.
	   */
	public void sortByIdentifierNo(List<Vehicle> vehicles){
		Collections.sort(vehicles, (vehicle1,vehicle2)->
						vehicle1.getIdentifierNo()-vehicle2.getIdentifierNo());
	}
	
	
}
