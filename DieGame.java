public class DieGame 
{
    public DieGame(DiePlayer[] players)
    {
        this.players = players.clone();
    }

    int getMaxScore()
    {
        return 0;
    }

    int playTurn(DiePlayer p, int playerNum)
    {
        Die dice = new Die();
        int diceScore;

        do
        {
            diceScore = dice.nextRoll();
            p.setRolls(p.getRolls()+1);
        }
        while(p.isRolling(players[playerNum].getMyScore(), players[playerNum].getTurnTotal() + diceScore, 
                getMaxScore(), players[playerNum].getRolls()) != false);
 

        return diceScore;
    }

    public int play()
    {
        int maxScore = 0;
        int winnerIndex = -1;
        int tourNumber = 1;

        while (maxScore <= GOAL_SCORE)
        {
            System.out.println("Tour " + tourNumber + "\n");
            for (int i = 0; i < players.length; i++)
            {
                int diceScore = playTurn(players[i], i);

                if(diceScore != 1)
                {
                    players[i].setMyScore(players[i].getMyScore() + diceScore);
                    players[i].setTurnTotal(0);
                    players[i].setRolls(0);

                    if (players[i].getMyScore() > maxScore)
                        maxScore = players[i].getMyScore();

                    players[i].setMaxScore(maxScore);
                }

                else
                {
                    players[i].setTurnTotal(0);
                    players[i].setRolls(0);
                }

                System.out.println("Player " + (i+1) + " : " + players[i].getMyScore());

                if(players[i].getMyScore() > GOAL_SCORE)
                {
                    winnerIndex = i;
                    break;
                }
            }
            System.out.print("\n\n");
            tourNumber++;
        }

        return winnerIndex;
    }


    public static final int GOAL_SCORE = 100;
    private DiePlayer[] players;

}
