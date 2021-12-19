package usecases_Gambler;

public class Gambler_Simulator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int stake = 100;
		int bet = 1;
		int day = 1;
		while (day == 20)
		{
			day++;
		for(stake=100;stake>=50 || stake<=150;stake++)		
		{
		int randomNumber = ( int )( Math.random() * 2 );
		System.out.println("randomnumber is :" + randomNumber);
			
		if(randomNumber == 1)
		{
				stake = stake+1;
		        System.out.println("Current Stake:" + stake);
		}
		else
		{
		        stake = stake-1;
		        System.out.println("Current Stake:" + stake);
		}
		}
			int totalstake=stake;
			System.out.println("totalstakr after 20 days" +totalstake);
			int resign_stake=stake;
			System.out.println("resign stake of the day"+ resign_stake);
		}
	}
}
