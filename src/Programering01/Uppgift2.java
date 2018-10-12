package Programering01;

import java.util.Scanner;

public class Uppgift2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int tal = input.nextInt(); // 1066
		int summa = 0;
		
		while(tal != 0) {
			
		summa = summa + tal%10; // 6
		
		tal = tal - tal%10; // 1060
		tal = tal/10; // 106
		}
		
		System.out.println(summa + tal);
		
		
		// tal%10=6
		
	}
}
