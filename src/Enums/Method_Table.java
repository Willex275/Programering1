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
		System.out.println(PhysicsLibrary.power(PhysicsLibrary.work(740, 100), 4.4));// uppgift 6
        double height = 10;
		int s = 0;
		while(PhysicsLibrary.velocityToHeight(PhysicsLibrary.fallSpeed(height)) > 0.5) {
			height = height*0.99;
			s++; }System.out.println(s);// metoden raknar ut hur manga ganger bollen hinner stutsa innan energi
			//tar slut när Bollen minskar med 1% efter varje stuts mot marken
		System.out.println(PhysicsLibrary.work(700*30, 100));// räknar arbete med hjälp av Massa*a Sträckan	
		System.out.println((PhysicsLibrary.heat(SolidTable.ICE, 0.5,5)+2260*1E3*0.5) + "J");
		System.out.println(PhysicsLibrary.fallSpeed(100) + " m/s");
		
		
			
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
