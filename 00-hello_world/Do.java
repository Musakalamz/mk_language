/*
 * File: Do.java
 * Auth: Musa_kalamz A Ogunsolu
 */

public class Do
{
	public static void main(String[] args)
	{
/*
 * Main - Prints even numvers from 2 - 30.
 */
		byte num = 2;

		while (num <= 30)
		{
			if (num % 2 == 0)
				System.out.println(num);
			num++;
		}
	}
}
