/**
 *  Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
	public static void main(String[] args) {
		int N = Integer.parseInt(args[0]);
		String Row = "";
		for (int i = 0; i < N; i++)
		{
			Row = "";
			for (int j = 0; j < N; j++)
			{
				if(i % 2 == 0)
				{
					Row += "* ";
				}
				else
				{
					Row += " *";
				}
			}
			System.out.println(Row);
		}
	}
}
