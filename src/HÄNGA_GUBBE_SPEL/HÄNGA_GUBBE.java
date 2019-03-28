package H�NGA_GUBBE_SPEL;

import java.util.Scanner;

public class H�NGA_GUBBE {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// DATA TYP SOM ANV�NDS
		String word = input.next();

		String show = "";

		// EN LOOP SOM G�R OM ORDET MED BOKST�VER TILL STRECK
		for (int i = 0; i < word.length(); i++) {
			show += '_';

		}
		// en int som h�ller koll p� ens liv 
		int lives = 10;

		
		//loppar s� l�nge man har liv kvar 
		while (lives > 0) {
			
			//skirver ut hur m�nga liv du har kvar 
			System.out.println("liv kvar: " + lives);
			
			//skriver ut det streckade ordet 
			System.out.println(show);
			
			// testar om man har gissat r�tt p� ordet 
			if (show.equals(word)) {
				System.out.println("Du vann!!");
				break;
			}
			// tar in en string och sparar f�rsta bokstaven i den
			char letter = input.next().charAt(0);
			
			//En string d�r vi lagrar det f�rra streckade fast med den nya gissade bokstaven ocks�
			String newShow = "";
			
			
			//En bolean f�r att h�lla koll p� om man har gissat r�tt 
			boolean check = false;
			
			
			//Loppar igenom ordet 
			for (int i = 0; i < word.length(); i++) {
				//kollar om en gissning matchar den bokstaven i ordet man kollar just nu!
				if (letter == word.charAt(i)) {
					//L�gger till bokstaven i nya streckade ordet och markerar att vi gissat r�tt 
					newShow += word.charAt(i);
					check = true;
				} else {
					// l�gger till bokstaven i det f�rra streckade ordet!. 
					newShow += show.charAt(i);
				}
			}
			//S�tter det streckade ordet till det nya streckade ordet 
			show = newShow;
			
			//Om vi inte gissat r�tt ta bort ett liv. 
			if (!check) {
				lives--;
			}
			
			//Om vi inte har n�gra  liv kvar skriv ut Du f�rlorade( Loopen avslutar sig sj�lv)
			if (lives == 0) {
				System.out.println("Du f�rlorade");
			}
			
		}

	}

}
