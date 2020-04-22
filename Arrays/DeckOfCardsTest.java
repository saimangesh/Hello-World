package Arrays;

public class DeckOfCardsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      DeckOfCards test = new DeckOfCards();
      test.suffle();
      for(int i=1; i<=52 ; i++)
      {
    	 System.out.printf("%-19s", test.dealCard());
    	 
    	 if(i % 4 == 0)
    	 {
    		 System.out.println();
    	 }
      }
	}

}
