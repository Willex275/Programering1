package Kattis;

import java.util.Scanner;

public class Spavanac {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int H = input.nextInt();
		int M = input.nextInt();
		
		if (M >= 45) {
			M = M-45;
			
		}
		else {
			H = H-1 ; 
			M = M + 60 -45;
			
			if(H==-1) {
				H=23;
			}
			
		}
		
		System.out.println(H + " " + M);
		
		
		
	}

}
