package HÄNGA_GUBBE_SPEL;

import java.util.Scanner;

public class HÄNGA_GUBBE {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// DATA TYP SOM ANVÄNDS
		String word = input.next();

		String show = "";

		// EN LOOP SOM GÖR OM ORDET MED BOKSTÄVER TILL STRECK
		for (int i = 0; i < word.length(); i++) {
			show += '_';

		}
		// en int som håller koll på ens liv 
		int lives = 10;

		
		//loppar så länge man har liv kvar 
		while (lives > 0) {
			
			//skirver ut hur många liv du har kvar 
			System.out.println("liv kvar: " + lives);
			
			//skriver ut det streckade ordet 
			System.out.println(show);
			
			// testar om man har gissat rätt på ordet 
			if (show.equals(word)) {
				System.out.println("Du vann!!");
				break;
			}
			// tar in en string och sparar första bokstaven i den
			char letter = input.next().charAt(0);
			
			//En string där vi lagrar det förra streckade fast med den nya gissade bokstaven också
			String newShow = "";
			
			
			//En bolean för att hålla koll på om man har gissat rätt 
			boolean check = false;
			
			
			//Loppar igenom ordet 
			for (int i = 0; i < word.length(); i++) {
				//kollar om en gissning matchar den bokstaven i ordet man kollar just nu!
				if (letter == word.charAt(i)) {
					//Lägger till bokstaven i nya streckade ordet och markerar att vi gissat rätt 
					newShow += word.charAt(i);
					check = true;
				} else {
					// lägger till bokstaven i det förra streckade ordet!. 
					newShow += show.charAt(i);
				}
			}
			//Sätter det streckade ordet till det nya streckade ordet 
			show = newShow;
			
			//Om vi inte gissat rätt ta bort ett liv. 
			if (!check) {
				lives--;
			}
			
			//Om vi inte har några  liv kvar skriv ut Du förlorade( Loopen avslutar sig själv)
			if (lives == 0) {
				System.out.println("Du förlorade");
			}
			
		}

	}

}
