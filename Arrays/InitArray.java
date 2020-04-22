package Arrays;

public class InitArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int array_length = 50;
       int[] array = new int[array_length];
		//int[] array  = {32,1,2,3,4,5,6,7,8};
  	 System.out.println("Array count " +   array_length + "\n ");
     System.out.printf("%s\t%8s%n", "Counter" , "Value");
     for(int counter = 0; counter< array.length ;counter++)
     {
    	 array[counter] = 2 + 2 * counter ; 
     }
     for(int counter = 0; counter< array.length ;counter++)
     {
    	 System.out.printf("%5d\t%8d%n", counter , array[counter]);
     }
	 int total = 0;
     for(int counter = 0; counter< array.length ;counter++)
     {
    	 total += array[counter];
     }
	 System.out.printf("Total sum of array : %2d%n", total );
	}
}
