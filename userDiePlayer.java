import java.util.Scanner;

public class userDiePlayer implements DiePlayer
{
	public boolean isRolling(int myScore, int turnTotal, int maxScore, int rolls)
	{
		if (turnTotal - this.turnTotal == 1)
		{	
			System.out.println("Your dice score is 1 !");
			return false;
		}

		Scanner input = new Scanner(System.in);
		
		System.out.println("Turn Total is : " + turnTotal);
		System.out.println("Total Score without Turn Total : " + myScore);
		System.out.println("Roll or Hold ?");	

		if(input.nextLine().equals(""))
		{
			this.turnTotal = turnTotal;
			return true;
		}

		else
			return false;

	}

	public int getMyScore()
	{
		return myScore;
	}

	public int getTurnTotal()
	{
		return turnTotal;
	}

	public int getRolls()
	{
		return rolls;
	}

	public void setMyScore(int number)
	{
		myScore = number;
	}

	public void setTurnTotal(int number)
	{
		turnTotal = number;
	}

	public void setMaxScore(int number)
	{
		maxScore = number;
	}

	public void setRolls(int number)
	{
		rolls = number;
	}

	int myScore = 0;
	int turnTotal = 0;
	int maxScore = 0;
	int rolls = 0;
}