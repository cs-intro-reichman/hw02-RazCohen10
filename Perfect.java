/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
	public static void main (String[] args) {
		int num = Integer.parseInt(args[0]);
		int DivSum = 0;
		String divisors = "1";
		for (int i = 1; i<num; i++)
		{
			if (num % i == 0)
			{
				DivSum += i;
				if(i != 1)
				{
					divisors += " + " + i;
				}
			}
		}
		if(num == DivSum && num != 0)
		{
			System.out.println(num + " is a perfect number since " + num + " = " + divisors);
		}
		else
		{
			System.out.println(num + " is not a perfect number");
		}
	}
}
