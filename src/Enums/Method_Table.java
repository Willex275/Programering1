package Enums;

public class Method_Table {
	public static void main(String[] args) {
		System.out.println(volumeToMass(SolidTable.IRON, 1));
	}
	
	public static double volumeToMass(SolidTable solid, double volume) {
		 double mass = volume*solid.density;
		 return	mass; 
			
			
		}

}
