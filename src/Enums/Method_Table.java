package Enums;

public class Method_Table {
	public static void main(String[] args) {
		System.out.println(volumeToMass(SolidTable.IRON, 1));
		System.out.println(svtDistance(2.8,3600));
		System.out.println(heat(FluidTable.WATER, 5, 1));
	}
	
	public static double volumeToMass(SolidTable solid, double volume) {
		 double mass = volume*solid.density;
		 return	mass; 
			
			
		}
	public static double svtDistance(double velocity, double time) {
		double distance = velocity*time; // gora om 60 min till sek 60*60=3600. 
		return distance;
	}
	
	public static double heat(FluidTable fluid, double volume, double deltaT) {
		double heat = volume* fluid.heatCapacity * deltaT;
		return heat;
	}

}
