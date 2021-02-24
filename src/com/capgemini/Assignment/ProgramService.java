package com.capgemini.Assignment;

import java.util.Collections;
import java.util.List;

public class ProgramService 
{
	ServiceClass service = new ServiceClass();
	public void printArrayList(List<ProgramClass> programs) {
		programs.forEach((program)->System.out.println(program.getId()+"  "+
				program.getName()+"  "+program.getVehicles()));
	}
	
	public void sortById(List<ProgramClass> programs) {
		Collections.sort(programs);
		for (ProgramClass program : programs) {
			service.sortByIdentifierNo(program.getVehicles());
		}
	}
}