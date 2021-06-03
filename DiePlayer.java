public interface DiePlayer
{
	public boolean isRolling(int myScore, int turnTotal, int maxScore, int rolls);

	public int getMyScore();
	public int getTurnTotal();
	public int getRolls();

	public void setMyScore(int number);
	public void setTurnTotal(int number);
	public void setMaxScore(int number);
	public void setRolls(int number);
}