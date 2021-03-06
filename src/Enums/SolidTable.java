package Enums;

public enum SolidTable {

	ICE(0.92, 2.2, 0, 334),
	IRON(7.87, 0.45, 1538, 276),
    GOLD(19.3, 0.13, 1064, 66),
    BLY(11.3, 0.13, 327, 24.7),
    SILVER(10.5, 0.24, 962, 105), 
   
    ;

	double density;
	double heatCapacity;
	double meltPoint;
	double meltEntalpy;
	
	SolidTable(double d, double hc, double sp, double se) {
		density = d * 1E3;
		heatCapacity = hc * 1E3;
		meltPoint = sp;
		meltEntalpy = se * 1E3;
	}
	

	
}