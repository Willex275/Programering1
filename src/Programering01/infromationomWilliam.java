package Programering01;

import java.util.Scanner;

public class infromationomWilliam {
	public static void main(String[] args) {
		
	Scanner input = new Scanner (System.in);
	
	System.out.println("Vad heter du?");
	String namn = input.nextLine();
	
	System.out.println("Vad �r ditt telefon nummer?");
	String telefonnummer = input.nextLine();
	
	System.out.println("Vilken stad bor du i");
	String Stad = input.nextLine();
	
	System.out.println("vad �r ditt postnummer?");
	String postnummer = input.nextLine();
	
	System.out.println("Vilken adress bor du p�?");
	String adress = input.nextLine();
	
	System.out.println("Information:");
	System.out.println(namn + " " + telefonnummer + " " + Stad + " " + postnummer + " " + adress );
	
	
	
	}
}
