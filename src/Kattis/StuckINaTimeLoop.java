package Kattis;

import java.util.Scanner;

public class StuckINaTimeLoop {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int i = input.nextInt();
		for (int j = 1; j <= i; j++) {
			System.out.println(j + " Abracadabra");
		}
		
	}

}
