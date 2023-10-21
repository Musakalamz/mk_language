/*
 * File: calc.java
 * Auth: Musa_kalamz A Ogunsolu
 */

public class calc
{
/*
 * Main - prints the sum, difference, product, division, modulus , maximum and minimum of x and y.
 */
	public static void main(String[] args)
	{
		int x = 10, y = 3;
		int max = Math.max(x, y);
		int min = Math.min(x, y);

		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x * y);
		System.out.println(x / y);
		System.out.println(x % y);
		System.out.println(max);
		System.out.println(min);
	}
}
