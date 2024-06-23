/**
 * The class is to print out the lyrics of the song Five Little Ducks
 *
 * @author Jacq Kirkman
 * @version 1
 */

public class Lyrics {
	/**
	 * The driver method to print out the lyrics of the song
	 *
	 * @param theArgs is used for command line input.
	 */
	public static void main(final String[] theArgs) {
		//Five ducks
		String start = "Five";
		String end = "four";
		System.out.print(start);
		roundOne();
		butOnly();
		System.out.print(end);
		cameBack();
		
		quacks();
		butOnly();
		System.out.print(end);
		cameBack();
		System.out.println();
		
		//Four ducks
		start = "Four";
		end = "three";
		System.out.print(start);
		roundOne();
		butOnly();
		System.out.print(end);
		cameBack();
		
		quacks();
		butOnly();
		System.out.print(end);
		cameBack();
		System.out.println();
		
		//Three ducks
		start = "Three";
		end = "two";
		System.out.print(start);
		roundOne();
		butOnly();
		System.out.print(end);
		cameBack();
		
		quacks();
		butOnly();
		System.out.print(end);
		cameBack();
		System.out.println();
		
		//Two ducks
		start = "Two";
		end = "one";
		System.out.print(start);
		roundOne();
		butOnly();
		System.out.print(end);
		cameBack();
		
		quacks();
		System.out.print(end);
		cameBack();
		System.out.println();
		
		//One duck
		start = "One";
		end = "But none of the five";
		System.out.print(start);
		roundOne();
		System.out.print(end);
		cameBack();
		
		quacks();
		System.out.print(end);
		cameBack();
		System.out.println();
		
		//Sad duck
		end = "all";
		System.out.println("Sad mother duck went out one day,");
		overTheHill();
		
		System.out.print("And all of the five little ducks came back.");
		System.out.println();
		
		quacks();
		System.out.print("And all of the five little ducks came back.");
	}
	

	public static void butOnly() {
		System.out.print("But only ");
	}
	
	public static void littleDucks() {
		System.out.print(" little ducks");
	}
	
	public static void cameBack() {
		littleDucks();
		System.out.print(" came back.");
		System.out.println();
	}
	
	public static void wentOut() {
		littleDucks();
		System.out.print(" went out one day,");
		System.out.println();
	}
	
	public static void overTheHill() {
		System.out.println("over the hill and far away.");
		System.out.println("Mother duck said, \"Quack, quack, quack, quack.\"");
	}
	
	public static void roundOne() {
		wentOut();
		overTheHill();
	}
	
	public static void quacks() {
		System.out.println();
		System.out.print("Quack, ");
		for (int i = 1; i <=4; i++) {
			System.out.print("quack, ");
		}
		System.out.print("quack.");
		System.out.println();
	}
	
	
	
}
