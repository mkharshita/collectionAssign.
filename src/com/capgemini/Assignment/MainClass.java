package com.capgemini.Assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
* The MainClass implements an application that
* simply uses ArrayList<> and perform sorting operations 
* using ServiceCLass or ProgramServiceClass.
*/

public class MainClass {

	/**
	 * This is the main method which makes use of ProgramClass and Vehicle class.
	 * @param args Unused.
	 * @return Nothing.
	 */
	public static void main(String[] args) {
		
		ArrayList<Vehicle> vehicles=new ArrayList<Vehicle>();
		vehicles.add(new Vehicle(5,2020,"red"));
		vehicles.add(new Vehicle(4,2019,"blue"));
		vehicles.add(new Vehicle(3,2016,"white"));
		vehicles.add(new Vehicle(2,2021,"grey"));
		vehicles.add(new Vehicle(1,2020,"red"));
		
		List<ProgramClass> programs=new ArrayList<ProgramClass>();
		programs.add(new ProgramClass(222,"first",vehicles));
		programs.add(new ProgramClass(111,"second",vehicles));
		
		Map<Integer,ArrayList<Vehicle>> map=new HashMap<Integer,ArrayList<Vehicle>>();
		
		for (ProgramClass program : programs) {
			map.put(program.getId(), program.getVehicles());
		}
		
		System.out.println("Printing Map");
		for(Map.Entry<Integer,ArrayList<Vehicle>> data : map.entrySet()) {
			System.out.print(data.getKey()+" : ");
			System.out.println(data.getValue());
		}
		
	}

	/**
	 * This is the programMethod method which makes use of ProgramServiceClass and Vehicle class.
	 * @param List<ProgramClass> programs used to perform operation on progrms.
	 * @return Nothing.
	 */
	private static void programMethod(List<ProgramClass> programs) {
		System.out.println("Before any sorting");
		ProgramService programService=new ProgramService();
		programService.printArrayList(programs);
		System.out.println("====================================");
		System.out.println();
		
		System.out.println("Sorting according to id Number");
		programService.sortById(programs);
		programService.printArrayList(programs);
		System.out.println("====================================");
		System.out.println();
	}
	
	/**
	 * This is the vehiclesMethod method which makes use of ServiceClass and Vehicle class.
	 * @param ArrayList<Vehicle> vehicles used to perform operation on vehicles.
	 * @return Nothing.
	 */
	public static void vehiclesMethod(ArrayList<Vehicle> vehicles) {
		ServiceClass service=new ServiceClass();
		System.out.println("Before any sorting");
		service.printArrayList(vehicles);
		System.out.println("====================================");
		
		System.out.println("Sorting according to colour");
		service.sortByColour(vehicles);
		service.printArrayList(vehicles);
		System.out.println("====================================");
		
		System.out.println("Sorting according to identifier Number");
		service.sortByIdentifierNo(vehicles);
		service.printArrayList(vehicles);
	}
}
