import java.util.Scanner;

/**
 * The class is to help user convert binary  numbers into decimals
 * and later report the statistic information (max, min, median, average)
 *
 
 * @author Jacq Kirkman 
 * @version 1
 */
public class Calculator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean proceed = true;
		while (proceed) {
			startEnteringBinaryNumbers(scanner);
			System.out.print("Would you like to try again [Y or y for yes]?");
			String again = scanner.next();
			proceed = new String("y").equals(again.toLowerCase());
			}
		

	}

	public static void startEnteringBinaryNumbers(Scanner scanner) {
		System.out.print("How many binary numbers would you like to enter? ");
		int quantity = scanner.nextInt();
		int min = 10000;
		int max = 0;
		int sum = 0;
		for (int i = 1; i <= quantity; i++) {
			String binary = enterBinaryNumber(scanner);
			int decimalValue = convertBinaryToDecimal(binary);
			System.out.println("The binary number you just entered has decimal value "+ decimalValue);
			sum += decimalValue;
			if (decimalValue < min) {
				min = decimalValue;
			}
			if (decimalValue > max ) {
				max = decimalValue;
			}
		}
		System.out.println("The sum is "+ sum);
		System.out.println("The minimum value is "+ min);
		System.out.println("The maximum value is "+ max);
		System.out.println("The average is "+ (double) sum / (double) quantity);
		
	}

	public static String enterBinaryNumber(Scanner scanner) {
		System.out.print("Enter the binary number: ");
		String binary = scanner.next();
		return binary;
	}

	public static int convertBinaryToDecimal(String binary) {
		int sum = 0;
		for (int i = binary.length() - 1; i >= 0; i--) {
			int value = Character.getNumericValue(binary.charAt(i));
			if (value == 1) {
				sum += Math.pow(2, binary.length() - 1 - i);
			}
		}
		return sum;
	}

}
