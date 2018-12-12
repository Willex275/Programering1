package BonusUppgifter;

import java.util.Scanner;

public class Bijele {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int King = input.nextInt();
		
		int Queen = input.nextInt();
		
		int Rooks = input.nextInt();
		
		int Bishop = input.nextInt();
		
		int Knight = input.nextInt();
		
		int Pawn = input.nextInt();
		
		System.out.print(1-King + " ");
		System.out.print(1-Queen + " ");
		System.out.print(2-Rooks + " ");
		System.out.print(2-Bishop + " ");
		System.out.print(2-Knight + " ");
		System.out.print(8-Pawn + " ");
	}
	

	
}
