package läxor_till_github;

import java.util.Scanner;

public class uppgift_v41_rovarspraket {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		System.out.println(sjorovare(str));
		
		
	}
	public static String sjorovare(String str) {
	      String mon = "";
	      for(int i = 0; i < str.length(); i++) {
	      switch (str.toLowerCase().charAt(i)) {
	      
	      case 'b':
	      case 'c':
	      case 'd':
	      case 'f':
	      case 'g':
	      case 'h':
	      case 'j':
	      case 'k':
	      case 'l':
	      case 'm':
	      case 'n':
	      case 'p':
	      case 'q':
	      case 'r':
	      case 's':
	      case 't':
	      case 'v':
	      case 'w':
	      case 'z':
	    	  mon += str.charAt(i) + "o" + str.charAt(i); 
	    	  
	      }
switch (str.toLowerCase().charAt(i)) {
	      
	      case 'a':
	      case 'e':
	      case 'i':
	      case 'o':
	      case 'u':
	      case 'y':
	      case 'å':
	      case 'ä':
	      case 'ö':
	      case ' ':
	    	  mon += str.charAt(i); 
}
	      }

		
		return mon;
	}

}
