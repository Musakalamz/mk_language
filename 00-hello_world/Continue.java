/*
 * File: Continue.java
 * Auth: Musa_kalamz A Ogunsolu
 */

public class Continue
{
	public static void main(String[] args)
	{
/*
 * Main - Prints all numbers from 1 - 25 aside the multiples of 4.
 */
		byte num;

		for (num = 1; num <= 25; num++)
		{
			if (num % 4 != 0)
				System.out.println(num);
			else
				continue;
		}
	}
}
