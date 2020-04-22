package Arrays;

public class RollDie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     java.security.SecureRandom  random = new java.security.SecureRandom();
     int[] frequency = new int[7];
     for(int counter = 1; counter<600000; counter++)
     {
    	 ++frequency[1+ random.nextInt(6)];
     }
     System.out.printf("%s%10s%n", "Face" , "Frequency");
     
     for(int face = 1 ;face<frequency.length ; face++)
     {
    	 System.out.printf("%4d%10d%n", face , frequency[face]);
     }
	}

}
