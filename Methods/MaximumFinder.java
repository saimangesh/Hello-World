package Methods;
import java.util.Scanner;
public class MaximumFinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner input = new Scanner(System.in);
      double num1 = input.nextDouble();
      double num2 = input.nextDouble();
      double num3 = input.nextDouble();
      
      double result = maximum(num1,num2,num3);
      System.out.println("max is :"+ result);	}
	public static double maximum(double x,double y,double z)
	{
		double max = x;
		if(y>max)
			max=y;
		if(z>max)
			max=z;
		return max;
	}

}
