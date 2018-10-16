package läxor_till_github;

import java.util.Scanner;

public class String_namne_return_Name_backwards {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println(reverse(input.nextLine()));
	}
	
	public static String reverse(String str) {
		
		int length =  str.length();
		char[] arr = new char[length];
		for(int i = length -1; i >= 0; i--) {
			arr[length-(i+1)] = str.charAt(i);
			
			
		}
		String s = new String(arr);
		return s;
		
			
		
	}
	
		
	
		
	

}
