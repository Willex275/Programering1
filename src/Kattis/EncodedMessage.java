package Kattis;

import java.util.Scanner;

public class EncodedMessage {
	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		String message = input.nextLine();
		int size = (int) Math.sqrt(message.length());

		char[][] matris = new char[size][size];

		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				matris[i][j] = message.charAt(size * i + j);

			}

		}
		char[][] rotate = new char[size][size];
		for (int x = 0; x < size; x++) {
			for (int y = 0; y < size; y++) {
				rotate[x][y] = matris[y][size-1-x];
				System.out.print(rotate[x][y]);
			}
		}
		
		
	}
	

}
