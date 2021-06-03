import java.util.*;

public class Die
{
	int nextRoll()
	{
		Random rand = new Random();

		return rand.nextInt((6-1)+1) + 1;
	}
}