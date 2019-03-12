package läxor_till_github;

import java.util.Scanner;

public class HANGAGUBBE {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("VÄLKOMEN TILL HÄNGA GUBBE");

		String Word = input.nextLine();

		int Lives = 10;

		while (Lives > 0) {
			for (int i = 0; i < Word.length(); i++) {
				System.out.print("_");

			}

			System.out.println("Gissa på en bokstav");
			String letter = input.nextLine();
			
		containsChar(Word, letter.charAt(0));
			if(true);
			System.out.println("Rätt");
			else(false)
				System.out.println("Fel");
				
			
			break;

		}

	}
	
	public static boolean containsChar(String s, char search) {
	    if (s.length() == 0)
	        return false;
	    else
	        return s.charAt(0) == search || containsChar(s.substring(1), search);
	    
	}

}
