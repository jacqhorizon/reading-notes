package assignment05_kirkman_jacq;


import java.util.Scanner;

/**
 * The class is to run the main workflow.
 *
 * @author Jacq Kirkman 
 */
public class FractionMain
{
	public static void main(String[] args)
	{
		System.out.println("Welcome to the Fraction program");
		System.out.println("===============================");
		Scanner console = new Scanner(System.in);
		char tryAgain = runWorkflow(console);
		while (tryAgain == 'y' || tryAgain == 'Y')
			tryAgain = runWorkflow(console);
		System.out.println("===============================");
		System.out.println("Thank you for using the program");
	}

	public static char runWorkflow(Scanner console)
	{
		// TODO declare variables

		// TODO get inputs for f1 numerator and denominator
		System.out.print("Enter the numerator for the 1st fraction: ");
		int firstNumer = console.nextInt();
		System.out.print("Enter the denominator for the 1st fraction: ");
		int firstDenom = console.nextInt();

		// TODO get inputs for f2 numerator and denominator
		System.out.print("Enter the numerator for the 2nd fraction: ");
		int secondNumer = console.nextInt();
		System.out.print("Enter the denominator for the 2nd fraction: ");
		int secondDenom = console.nextInt();
		
		// TODO create instances for two fractions
		Fraction first = new Fraction(firstNumer, firstDenom);
		Fraction second = new Fraction(secondNumer, secondDenom);

		// TODO display the two fractions
		System.out.println("f1 == "+first.toString());
		System.out.println("f2 == "+second.toString());
		// TODO display the two fractions as decimal values
		System.out.println(first.toString()+" == "+String.format("%.4f", first.getDecimalValue()));
		System.out.println(second.toString()+" == "+String.format("%.4f", second.getDecimalValue()));
		// TODO multiply the two fractions and store product in f3
		
		// TODO display f3 after multiplication
		System.out.println(first.toString()+" * "+second.toString()+" = "+first.multiply(second));;
		// TODO display f3 after division
		System.out.println(first.toString()+" / "+second.toString()+" = "+first.divide(second));;
		// TODO display f3 after addition
		System.out.println(first.toString()+" + "+second.toString()+" = "+first.add(second));;
		// TODO display f3 after subtraction
		System.out.println(first.toString()+" - "+second.toString()+" = "+first.subtract(second).toString());;

		
		// TODO prompt the user if like to try again
		System.out.print("Would you like to try again ['Y' or 'y']? ");
		String proceed = console.next();
		return proceed.charAt(0);
	}
}