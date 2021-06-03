import java.lang.Math;

public class RaceToGoalDiePlayer implements DiePlayer
{
    public boolean isRolling(int myScore, int turnTotal, int maxScore, int rolls)
    {
        if (turnTotal - this.turnTotal == 1 || turnTotal >= 21 + Math.round(maxScore-myScore)/8 || myScore + turnTotal >= 100)
            return false;

        else if(myScore >= 71 || maxScore >= 71)
        {
            this.turnTotal = turnTotal;
            return true;
        }

        else
        {
            this.turnTotal = turnTotal;
            return true;
        }
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