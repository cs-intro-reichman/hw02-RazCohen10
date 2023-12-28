/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {
	public static void main (String[] args) {
		int HighestNum = -1;
		int RandomNum = (int) (Math.random() * 10);
		while (RandomNum >= HighestNum)
		{
			System.out.println(RandomNum);
			HighestNum = RandomNum;
			RandomNum = (int) (Math.random() * 10);
		}
	}
}
