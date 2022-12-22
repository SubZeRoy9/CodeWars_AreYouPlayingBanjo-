/* Create a function which answers the question "Are you playing banjo?".
 * If your name starts with the letter "R" or lower case "r", you are playing banjo!
 * The function takes a name as its only argument, and returns one of the following strings:*/

import java.util.Scanner;
public class Banjo {

	public static void main(String[] args) {
		System.out.println("Enter a name.");
		Scanner scan = new Scanner(System.in);
		String n = scan.next();
		System.out.println(areYouPlayingBanjo(n));

	}
	
	public static String areYouPlayingBanjo(String name) {
		String st;
	    char[] n = name.toCharArray();
	    if (n[0] == 'R' || n[0] == 'r') {
	    	st = name + " plays banjo";
	    }
	    else {
	    	st = name + " does not play banjo";
	    	
	    }
	    return st;
	  }

}
