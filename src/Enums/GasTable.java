package Enums;

public enum GasTable{

	HELIUM(0.18, 5.1), 
	O2(1.43, 0.92), 
	OXYGEN(1.43, 0.92),
	AMMONAIK(0.77, 2.05),
	ARGON(1.78, 0.52),
	
	
	;

	double density;
	double heatCapacity;

	GasTable(double d, double hc) {
		density = d;
		heatCapacity = hc * 1E3; // 1E3 = 1*10^3
	}

}