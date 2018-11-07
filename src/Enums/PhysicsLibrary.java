package Enums;

public class PhysicsLibrary {
	
	static double G = 9.82;
	static double ATM = 101.3E3; // 101.3 Kpa
	
	public static void main(String[] args) {
		
		System.out.println(volumeToMass(SolidTable.IRON, 1));
		
		
	} // En metod som raknar ut massan pa ett amne Metod (1)
	
	public static double volumeToMass(SolidTable solid, double volume) {
	 double mass = volume*solid.density;
		
		return	mass; 
		
		
	} 
	/**
	 * 
	 * @param velocity
	 * @param time
	 * @return Velocity*time 
	 */
	//En metod som raknar ut tid for hjalp av stracka och hastighet metod (2)

	public static double svtDistance(double velocity, double time) {
		
		return velocity*time; 
		 
	}
	
	//En metod som raknar ut hur mycket energi som gor at for att varme upp x volym vatska till y Grader 
	// metod (3)
     public static double heat(FluidTable fluid, double volume, double deltaT) {
    	 
    	 return volume*deltaT;
     }
     
     //  metod som gor om grader fahrenheit till grader celcius. metod (4)
     public static double fahrenheitToCelsius(double fahrenheit ) {
    	 
    	 return (fahrenheit -32) / 1.8;
     }
     
         // En metod som raknar ut vatsketrycket I en vatska vid ett vIsst dJup. (5)
     public static double fluidPressure(FluidTable fluid, double deep) {
    	 
    	 return fluid.density * G * deep; 
     }
	//En metod som raknar ut vatsketrycket i vatten vid ett visst djup. (6)
     public static double pressureUnderWater(double deep) {
    	 return deep * G * 0.997 * 1E3;
     }
	// gor om grader kelvin till grader celcius (7)
     public static double kelvinToCelsius(double kelvin) {
    	 double celsius = kelvin + 273.15; 
    	 return celsius; 
     }
     // En metod som raknar ut kinetisk energi med hjalp av massa och hastighet.(8)
     public static double kineticEnergy(double mass, double velocity) {
    	 
    	 return 0.5 * mass * velocity;
     }
     // En metod som raknar ut potentiell energi med hjalp av massa och hojd (9)
     public static double potentialEnergy(double mass, double height) {
    	
    	 return mass * 9.82 * height;
     }
     // En metod som raknar ut hur hog hastighet man kommer upp i som man (10)
     // slapper ett foremål från en viss hojd.
     public static double fallSpeed(double height) {
    	 
    	 return Math.sqrt(2*G*height);
     }
     // metod (11) En metod som raknar ut skillnad mellan tva givna varden.
     public static double delta(double first, double last) {
    	 
    	 return last - first;
     }
     // metod 12 En metod som gor om en viss volym av gas till en massa.
     public static double volumeToMass(GasTable gas, double volume) {
    	 
    	 return volume * gas.density;
     }
     
    
}

     
