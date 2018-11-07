package Enums;

public class PhysicsLibrary {
	public static void main(String[] args) {
		
		System.out.println(volumeToMass(SolidTable.IRON, 1));
		
		
	} // En metod som raknar ut massan på ett amne
	
	public static double volumeToMass(SolidTable solid, double volume) {
	 double mass = volume*solid.density;
		
		return	mass; 
		
		
	} 
	/**
	 * 
	 * @param velocity
	 * @param time
	 * @return
	 */
	//En metod som raknar ut tid för hjalp av stracka och hastighet

	public static double svtDistance(double velocity, double time) {
		
		return velocity*time; 
		 
	}
	//En metod som raknar ut hur mycket energi som gar at for att varme upp x volym vatska 
	
     public static double heat(FluidTable fluid, double volume, double deltaT) {
    	 
    	 return volume*deltaT;
     }
	
	
	

}
