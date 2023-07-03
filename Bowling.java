package Objects;

public class Bowling 
{
	private int firstTurn;
	private int secondTurn;
	private int thirdTurn;
	private int playerTotal;

	public Bowling()
	{
		firstTurn=0;
		secondTurn=0;
		playerTotal=0;
	}
	
	public Bowling(int firstturn, int secondturn, int thirdturn, int playertotal)
	{
		this.firstTurn=firstturn;
		this.secondTurn=secondturn;
		this.thirdTurn=thirdturn;
		this.playerTotal=playertotal;
	}

	public void SetFirstTurn(int firstturn)
	{
		firstTurn=firstturn;
	}
	
	public void SetSecondTurn(int secondturn)
	{
		secondTurn=secondturn;
	}
	
	public void SetThirdTurn(int thirdturn)
	{
		thirdTurn=thirdturn;
	}
	
	public void SetPlayerTotal(int playertotal)
	{
		playerTotal=playertotal;
	}
	
	public int GetFirstTurn()
	{
		return firstTurn;
	}
	
	public int GetSecondTurn()
	{
		return secondTurn;
	}
	
	public int GetThirdTurn()
	{
		return thirdTurn;
	}

	public int GetPlayerTotal()
	{
		return playerTotal;
	}
}