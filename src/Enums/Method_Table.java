package Enums;

public class Method_Table {
	
	static double G = 9.82;
	static double ATM = 101.3E3;
	
	public static void main(String[] args) {
		System.out.println(volumeToMass(SolidTable.IRON, 1));
		System.out.println(svtDistance(2.8,3600));
		System.out.println(heat(FluidTable.WATER, 5, 1));
		System.out.println(pressureUnderWater(100)); // svar 979054pa 
		System.out.println(velocityToHeight(50/3.6)+1.8);
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
		double heat = volume* fluid.heatCapacity * deltaT * fluid.density;
		return heat;
	}
	
	public static double pressureUnderWater(double deep) {
		double pressure = deep * G * 0.997 * 1E3;
		return pressure;
		
	}
	
	public static double velocityToHeight(double velocity) {
		double height = Math.pow (velocity,2)/(2*G);
		return height; 
	}
	
	
	
	
}
