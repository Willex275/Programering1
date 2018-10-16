package läxor_till_github;

import java.util.Scanner;

public class uppgift_3_vecka41 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println(count(input.nextLine(), input.next().charAt(0)));
		input.close();
	}
	public static int count(String str, char c) {
		int count = 0;
		for(int i = 0; i < str.length();i++) {
			if (str.charAt(i) == c) {
			    count++;			
			}
		}
		return count;
	}

}
