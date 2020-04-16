package controlStatements;
import java.util.Scanner;
public class Switch {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
	Scanner input = new Scanner(System.in)) {
		int total = 0;
		   int gradeCounter = 0;
		   int acount = 0;
		   int bcount = 0;
		   int ccount = 0;
		   int dcount = 0;
		   int fcount = 0;

			System.out.println("Enter integer grades in range 1-100\n");
			System.out.println("Type end-of-file input to terminate: \n "
					+ "On linux/unix/mac press control d\n"
					+ "On windows press control z \n");
		    while(input.hasNext())
		    {
		    	int grade = input.nextInt();
		    	total += grade;
		    	gradeCounter++;
		    	switch(grade/10)// grade is int and 10 is int so remainder will also be int
		    	{
		    	case 9:
		    	case 10: //for 90-100
		    		acount++;
		    		break;
		    	case 8:
		    		bcount++; // for 80-89
		    		break;
		    	case 7:
		    		ccount++;
		    		break;
		    	case 6:
		    		dcount++;
		    		break;
		    	default:
		    		fcount++;
		    		break;
		    	}
		    }
		    if(gradeCounter!=0)
		    {
		    	double average = (double) total / gradeCounter;
		    	System.out.printf("Total of %d grades entered is %d%n" , gradeCounter ,total);
		    	
		    	System.out.printf("Average of total grades is %.2f%n", average);
		    	System.out.printf("%n%s%n%s%d%n%s%d%n%s%d%n%s%d%n%s%d%n","Number of students who recieved grades ",
		    			    "A: ",acount,"B: ",bcount, "C: ",ccount ,"D: ",dcount, "F: ", fcount);
		    }
		    else
		    	System.out.printf("%n%s", "No grades were entered");
	}
	}

}
