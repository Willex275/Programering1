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
        	int max = tal2;
        }
        
        // läs in tal 3...
        int tal3 = input.nextInt();
        
     // läs in tal 4...
        int tal4 = input.nextInt();
        
     // läs in tal 5...
        int tal5 = input.nextInt();
        
     // läs in tal 6...
        int tal6 = input.nextInt();
        
     // läs in tal 7...
        int tal7 = input.nextInt();
        
     // läs in tal 8...
        int tal8 = input.nextInt();
        
     // läs in tal 9...
        int tal9 = input.nextInt();
        
     // läs in tal 10...
        int tal10 = input.nextInt();
        
        int summa = tal1 + tal2 + tal3 + tal4 + tal5 + tal6 + tal7 + tal8 + tal9 + tal10;
        
        double medel1 = summa / 5; // 5 
        double medel2 = summa / 5.0; //5,6
        
        System.out.println("Minsta: " + min);
        System.out.println("Största: " + max);
        System.out.println("Medel: " + medel);
        
        		
	}

}
