
/**
 * The class is to print a text-based duck to the console
 *
 * @author Varik Hoang <varikmp@uw.edu>
 * @author Jacq Kirkman <jacq.kirkman@seattlecolleges.eduL>
 * @version 1
 */

public class Duck
{
	/**
	 * The driver method to print out the duck
	 *
	 * @param theArgs is used for command line input.
	 */
	public static void main(final String[] theArgs)
	{
		printDucks();

	}
	public static void printDuck() {
		System.out.println("              ____");
		System.out.println("           __|____|__");
		System.out.println("          |__________|       ");
		System.out.println("           ((      ))");
		System.out.println("          ((     O  ```)");
		System.out.println("          ((        ``) ");
		System.out.println("           \\\\     x``");
		System.out.println("    (())    \\\\     X");
		System.out.println("   ((  ))~~~~      ))");
		System.out.println(" ((                 ))");
		System.out.println("((      ~~~~~~       )) ");
		System.out.println("((     ~~~~~~~~      ))");
		System.out.println(" \\\\     ~~~~~~      //");
		System.out.println("  --__--__--__--__--__");
		System.out.println(" --__--__--__--__--__");
	}
	
	public static void printDucks() {
		for (int i = 1; i<=5; i++) {
			printDuck();
		}
	}
}