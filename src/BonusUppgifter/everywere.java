package BonusUppgifter;

import java.util.Scanner;

public class everywere {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int T = input.nextInt();
		
		int[] summa = new int[T];
		
		for(int i = 0; i < T; i++) {
			int numberOfCities = input.nextInt();
			String[] cities = new String[numberOfCities];
			
			boolean[] tested = new boolean[cities.length];
					
			
			for (int j = 0; j < numberOfCities; j++) {
				cities[j] = input.next();
				tested[j]=false;
				
			}
			//System.out.println(Arrays.toString(cities));
			//TODO: Avgör hur många unika städer det finns
			summa[i] = 0;  
			
			for (int j = 0; j < tested.length; j++) {
				if(tested[j] != true) {
					for (int j2 = 0; j2 < tested.length; j2++) {
						if(cities[j].equals(cities[j2])) {
							tested[j2] = true;
						}
						
					}
					summa[i]++;
					
				}
				
			}
			
				}
		for (int i = 0; i < summa.length; i++) {
			System.out.println(summa[i]);
		}
		 
		
		
		
	}

}
