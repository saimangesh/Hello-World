package Arrays;

public class ArrayExceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int[] responses = {1,2,3,1,2,65,4,6,5,2,5,3,14};
     int[]frequency = new int[6];
     
     for(int answer = 0; answer< responses.length ; answer++)
     {
    	 try {
    		// if(responses[answer]<6)
    		    ++frequency[responses[answer]];
    	 }
    	 catch(ArrayIndexOutOfBoundsException e)
    	 {
    		 System.out.println(e);
    		 System.out.printf("Responses[%d] : %d%n%n", answer , responses[answer]);
    	 }
     }
     System.out.printf("%s%10s%n", "Rating" , "Frequency");
     
     for(int rating = 1 ; rating < frequency.length ; rating++)
     {
    	 System.out.printf("%6d%10d%n" , rating, frequency[rating]);
     }
	}

}
