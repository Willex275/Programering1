package Programering01;

import java.util.Scanner;

public class Vecka37 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
	     
        // läs in tal 1...
        int tal1 = input.nextInt();
        int max = tal1;
        int min = tal1;
       
        // läs in tal 2...
        int tal2 = input.nextInt();
        if (tal2 > max) {
        	max = tal2;
        }
        if (tal2 < min) {
        	min = tal2;
        }
        // läs in tal 3...
        int tal3 = input.nextInt();
        if (tal3 > max) {
        	max = tal3;
        }
        if (tal3 < min) {
        	min = tal3;
        }
     // läs in tal 4...
        int tal4 = input.nextInt();
        if (tal4 > max) {
        	max = tal4;
        }
        if (tal4 < min) {
        	min = tal4;
        }
     // läs in tal 5...
        int tal5 = input.nextInt();
        if (tal5 > max) {
        	max = tal5;
        }
        if (tal5 < min) {
        	min = tal5;
        }
     // läs in tal 6...
        int tal6 = input.nextInt();
        if (tal6 > max) {
        	max = tal6;
        }
        if (tal6 < min) {
        	min = tal6;
        }
     // läs in tal 7...
        int tal7 = input.nextInt();
        if (tal7 > max) {
        	max = tal7;
        }
        if (tal7 < min) {
        	min = tal7;
        }
     // läs in tal 8...
        int tal8 = input.nextInt();
        if (tal8 > max) {
        	max = tal8;
        }
        if (tal8 < min) {
        	min = tal8;
        }
     // läs in tal 9...
        int tal9 = input.nextInt();
        if (tal9 > max) {
        	max = tal9;
        }
        if (tal9 < min) {
        	min = tal9;
        }
     // läs in tal 10...
        int tal10 = input.nextInt();
        if (tal10 > max) {
        	max = tal10;
        }
        if (tal10 < min) {
        	min = tal10;
        }
        
        
        int summa = tal1 + tal2 + tal3 + tal4 + tal5 + tal6 + tal7 + tal8 + tal9 + tal10;
        
       
        
        System.out.println("Minsta: " + min);
        System.out.println("Största: " + max);
        System.out.println("Medel: " + summa/10);
        
        		
	}

}
