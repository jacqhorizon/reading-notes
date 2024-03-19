package assignment05_kirkman_jacq;


/**
 * The class is to define the fraction object that include properties
 * - Numerator
 * - Denominator
 * The class provided some methods such as:
 * - Addition
 * - Subtraction
 * - Multiplication
 * - Division
 *
 * @author Jacq Kirkman <jacq.kirkman@seattlecolleges.edu>
 * @version 
 */
public class Fraction
{
	/**
	 * The value of numerator of the fraction.
	 */
	private int numerator;
	
	/**
	 * The value of denominator of the fraction.
	 */
	private int denominator;

	/**
	 * The constructor accepts numerator and denominator
	 * @param numerator the numerator of fraction
	 * @param denominator the denominator of fraction
	 */
	public Fraction(int numerator, int denominator)
	{
		// TODO assign the value to the numerator field
		setNumerator(numerator);
		setDenominator(denominator);
		reduce();
		adjustSign();
		// TODO use setDenominator() setter to protect against divide by zero
		// make sure that we reduce the fraction at this point and adjust the sign
		
	}

	/**
	 * The setter method for numerator
	 * @param numerator the denominator
	 */
	public void setNumerator(int numerator)
	{
		this.numerator = numerator;
	}

	/**
	 * The setter method for denominator
	 * @param denominator the denominator
	 */
	public void setDenominator(int denominator)
	{
		// TODO throw the exception if the denominator is zero

		if (denominator == 0) {
		    throw new ArithmeticException();
		} else {
		this.denominator = denominator;
		}
		// TODO set the value to the denominator

	}

	/**
	 * The method returns the numerator.
	 * @return the numerator
	 */
	public int getNumerator()
	{
		return this.numerator;
	}

	/**
	 * The method returns the denominator.
	 * @return the denominator
	 */
	public int getDenominator()
	{
		return this.denominator;
	}

	/**
	 * The method returns the decimal value.
	 * @return the decimal value of the fraction
	 */
	public double getDecimalValue()
	{
		return (double) this.numerator / this.denominator;
	}

	/**
	 * The method returns the sum of fractions
	 * @param other the other fraction
	 * @return the sum of fractions
	 */
	public Fraction add(Fraction other)
	{
		// TODO if this fraction and the other fraction have the same denominator
		// otherwise make them same denominator before doing the addition
		int newNumerator;
		int newDenom;
		if (this.denominator != other.denominator) {
			newDenom = this.denominator * other.denominator;
			newNumerator =other.denominator * this.numerator + this.denominator * other.numerator;
		} else {
			newNumerator = this.numerator + other.numerator;
			newDenom = this.denominator;
		}
		Fraction sum = new Fraction(newNumerator, newDenom);
		sum.reduce();
		sum.adjustSign();
		// TODO simplify and adjust sign for the result fraction

		return sum;
	}

	/**
	 * The method returns the difference between fractions
	 * @param other the other fraction
	 * @return the difference between fractions
	 */
	public Fraction subtract(Fraction other)
	{
		// TODO if this fraction and the other fraction have the same denominator
		// otherwise make them same denominator before doing the addition
		int numer;
		int denom;
		if (this.denominator != other.denominator) {
			denom = this.denominator * other.denominator;
			numer = other.denominator * this.numerator - this.denominator * other.numerator;
		} else {
			denom = this.denominator;
			numer = this.numerator - other.denominator;
		}
		Fraction difference = new Fraction(numer, denom);
		difference.reduce();
		difference.adjustSign();
		// TODO simplify and adjust sign for the result fraction


		return difference;
	}

	/**
	 * The method returns the product of two fractions
	 * @param other the other fraction
	 * @return the product of two fractions
	 */
	public Fraction multiply(Fraction other)
	{
		// TODO declare local variables for the new numerator and denominator
		int numer;
		int denom;

		// TODO get the new numerator by multiplying the two numerators
		numer = this.numerator * other.numerator;

		// TODO get the new numerator by multiplying the two denominators
		denom = this.denominator * other.denominator;

		// TODO create new fraction instance by calling (output fraction)
		// the constructor to instantiate the new fraction
		Fraction product = new Fraction(numer, denom);
		product.reduce();
		product.adjustSign();
		
		// TODO return the output fraction
		return product;
	}

	public Fraction divide(Fraction other)
	{
		// TODO throw ArithmeticException if the numerator of the divided fraction is zero
		if (other.numerator == 0) {
		    throw new ArithmeticException();
		} 
		int numer;
		int denom;
		
		// TODO declare local variables for the new numerator and denominator


		// TODO get the new numerator by multiplying
		// this fraction's numerator and the other fraction's denominator
		numer = this.numerator * other.denominator;

		// TODO get the new denominator by multiplying
		// this fraction's denominator and the other fraction's numerator
		denom = this.denominator * other.numerator;

		// TODO create new fraction instance by calling (output fraction)
		// the constructor to instantiate the new fraction
		Fraction quotient = new Fraction(numer, denom);
		
		// TODO return the output fraction
		return quotient;
	}

	/**
	 * The method returns the greatest common factor (GCF) of two integers
	 * @param a the first integer
	 * @param b the second integer
	 * @return the greatest common factor of a and b
	 */
	protected int getGCF(int a, int b)
	{
		// TODO declare local variable for remainder
		int r = 1;
		// TODO use while loop to determine greatest common factor of a and b
		while (r != 0) {
			r = a % b;
			a = b;
			b = r;
		}
		// TODO return the values stored in a
		return a;
	}

	/**
	 * The method simplify the current fraction.
	 */
	protected void reduce()
	{
		// TODO declare a variable to hold the value of common greatest factor
		int gcf = 1;
		if (this.numerator != 0) {
			gcf = getGCF(this.denominator, this.numerator);
		}
		setNumerator(this.numerator/gcf);
		setDenominator(this.denominator/gcf);
		// TODO reduce the fraction by dividing numerator and
		// denominator by the value of common greatest factor

	}

	/**
	 * The method makes sure the negative sign always goes with
	 * the denominator instead of the numerator.
	 */
	protected void adjustSign()
	{
		if (this.numerator < 0) {
			setNumerator(this.numerator * -1);
			setDenominator(this.denominator * -1);
		}
	}

	/**
	 * The method returns a string representing a fraction.
	 */
	public String toString()
	{
		// TODO the fraction must have the string format without spaces 1/2 for example
		// if the denominator is one, the string format should be in integer type.
		// For example, if the fraction is 2/1, the string format should be 2 instead of 2/1
		if (this.numerator == 0) {
			return "0";
		} else if (Math.abs(this.denominator) == 1) {
			return Integer.toString(this.numerator * this.denominator);
		} else if (this.denominator < 0) {
			return "-"+Integer.toString(this.numerator)+"/"+Integer.toString(this.denominator*-1);
		} else {
			return Integer.toString(this.numerator)+"/"+Integer.toString(this.denominator);
		}
	}
}

