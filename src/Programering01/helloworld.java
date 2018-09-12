package Programering01;

import java.util.Scanner;

public class helloworld {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int x = input.nextInt();
		int k = input.nextInt();

		if (x > 0 && k > 0) {
			System.out.println(1);
		}
		if (x > 0 && k < 0) {
			System.out.println(4);
		}
		if (x < 0 && k > 0) {
			System.out.println(2);
		}
		if (x < 0 && k < 0) {
			System.out.println(3);
		}

	} // END main

} // END helloworld