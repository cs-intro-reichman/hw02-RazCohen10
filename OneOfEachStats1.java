/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get one command-line argument: an int value
 * 	that determines how many families to simulate.
 */
public class OneOfEachStats1 {
	public static void main (String[] args) {
		int T = Integer.parseInt(args[0]);
		
		//Initialize variables for a single experiment
		Boolean IsBoy = false;
		Boolean IsGirl = false;
		int NumOfChildrenSingleEx = 0;
		
		//Initialize variables for all experiments
		int TwoChildrenCount = 0;
		int ThreeChildrenCount = 0;
		int FourOrMoreChildrenCount = 0;
		double NumOfChildrenOverall = 0;
		String MostCommonNumOfChildren = "";
		
		for (int i = 0; i < T; i++)
		{
			IsBoy = false;
			IsGirl = false;
			NumOfChildrenSingleEx = 0;
			while (!IsBoy || !IsGirl)
			{
				if (Math.random() < 0.5)
				{
					IsBoy = true;
				}
				else
				{
					IsGirl = true;
				}
				NumOfChildrenSingleEx++;
			}
			if (NumOfChildrenSingleEx == 2) TwoChildrenCount++;
			else if (NumOfChildrenSingleEx == 3) ThreeChildrenCount++;
			else FourOrMoreChildrenCount++;
			NumOfChildrenOverall += NumOfChildrenSingleEx;
		}
		
		System.out.println("Average: " + (NumOfChildrenOverall / T) + " children to get at least one of each gender.");
		System.out.println("Number of families with 2 children: " + TwoChildrenCount);
		System.out.println("Number of families with 3 children: " + ThreeChildrenCount);
		System.out.println("Number of families with 4 or more children: " + FourOrMoreChildrenCount);
		
		MostCommonNumOfChildren = "4 or more.";
		if (ThreeChildrenCount >= Math.max(TwoChildrenCount, FourOrMoreChildrenCount)) MostCommonNumOfChildren = "3.";
		if (TwoChildrenCount >= Math.max(ThreeChildrenCount, FourOrMoreChildrenCount)) MostCommonNumOfChildren = "2.";
		System.out.println("The most common number of children is " + MostCommonNumOfChildren);
	}
}
