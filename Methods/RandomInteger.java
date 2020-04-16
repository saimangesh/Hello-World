package Methods;
import java.security.SecureRandom;
public class RandomInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int frequency1 = 0;
		int frequency2 = 0;
		int frequency3 = 0;
		int frequency4 = 0;
		int frequency5 = 0;
		int frequency6 = 0;
     SecureRandom random = new SecureRandom();
     
     for(int  counter =1 ; counter<=6000000 ; counter++)
     {
    	 int face = 1 + random.nextInt(6);
    	  
    	 switch(face)
    	 {
    	 case 1: ++frequency1;
    	 break;
    	 case 2: ++frequency2;
    	 break;
    	 case 3: ++frequency3;
    	 break;
    	 case 4: ++frequency4;
    	 break;
    	 case 5: ++frequency5;
    	 break;
    	 case 6: ++frequency6;
    	 break;													
    	 }
     }
     System.out.println("Face \tFrequency");
     System.out.printf("1\t%d%n2\t%d%n3\t%d%n4\t%d%n5\t%d%n6\t%d%n", 
    		frequency1 , frequency2 ,frequency3,frequency4 , frequency5 , frequency6);
	}
}
