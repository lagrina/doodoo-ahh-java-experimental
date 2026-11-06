package bwiset;

import java.util.Scanner;

/* I hate this java project so much. I uploaded it here just so i could 
 * look back from the future and look at how insanely in love i was when i was at my second year
 * college. I wasn't supposed to be having this peculiar feeling. But man sige lang, what can you do
 * with a loving feeling gid
 * */

/* I made this as a joke just to get this feeling off my chest, fuck that.
 * But hey, it applied some aspects of Object-Oriented Programming, diba?
 * Base64 aint gonna hide your feelings, bro
 * */

public class Main {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Type a name: ");
		
		String personName = input.nextLine();
		
		Secret person = new Secret(personName);
		
		person.isItM();
		person.nameDrop();
		
		input.close();
	}
}
