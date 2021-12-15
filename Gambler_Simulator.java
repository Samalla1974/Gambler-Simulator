package usecases_Gambler;

public class Gambler_Simulator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int stake = 100;
		int bet = 1;

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

}
