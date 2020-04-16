package Methods;
import java.security.*;
public class CrapsGame {
    private static final SecureRandom randomNumbers = new SecureRandom();
    
    private enum status {CONTINUE , WIN ,LOST}
    private static final int Two = 2;
    private static final int Three = 3;
    private static final int Seven = 7;
    private static final int Eleven = 11;
    private static final int Twelve = 12;
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int myPoint = 0;
      status gameStatus; 
      
      int sumOfDice = rollBack();
      switch(sumOfDice)
      {
      case Seven:
      case Eleven:
    	  gameStatus = status.WIN;
    	  break;
      case Two:
      case Three:
      case Twelve:
    	  gameStatus = status.LOST;
    	  default:
    		  gameStatus = status.CONTINUE;
    		  myPoint = sumOfDice;
    		  System.out.printf("Point is %d%n", myPoint);
    		  break;
      }
      while(gameStatus == status.CONTINUE)
      {
    	  sumOfDice = rollBack();
    	  
    	  if(sumOfDice == myPoint)
    	  {
    		  gameStatus = status.WIN;
    	  }
    	  else if (sumOfDice == Seven)
    	  {
    		  gameStatus = status.LOST;
    	  }
      }
      if(gameStatus == status.WIN)
      {
    	  System.out.println("Player Wins");
      }
      else
    	  System.out.println("Player Loses");
	}
	public static int rollBack()
	{
		int die1 = 	1 + randomNumbers.nextInt(6);
		int die2 = 	1 + randomNumbers.nextInt(6);
        
		int sumOfDice = die1 + die2 ;
		System.out.printf("player rolled %d + %d = %d%n",die1, die2, sumOfDice);
		return sumOfDice;
	}

}
