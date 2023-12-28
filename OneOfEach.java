
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main (String[] args) {
		Boolean IsBoy = false;
		Boolean IsGirl = false;
		int NumOfChildren = 0;
		String Children = "";
		while (!IsBoy || !IsGirl)
		{
			if (Math.random() < 0.5)
			{
				IsBoy = true;
				Children += "b ";
			}
			else
			{
				IsGirl = true;
				Children += "g ";
			}
			NumOfChildren++;
		}
		System.out.println(Children);
		System.out.println("You made it... and you now have " + NumOfChildren + " children.");
	}
}
