import java.util.Scanner;
public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Student s1 = new Student("John",98.2);
     Student s2 = new Student("Marcel",40.2);
     System.out.println( s1.getName() + " has letter grade of " + s1.getLetterGrade());
     System.out.println( s2.getName() + " has letter grade of " + s2.getLetterGrade());
     
     Scanner input = new Scanner(System.in);
     int total = 0;
     int gradeCounter = 0;
     System.out.println("Enter the grade or -1 to quit: ");
     int grade = input.nextInt();
     while(grade!=-1)
     {
        total  += grade;
        gradeCounter++;
        System.out.println("Enter the grade or -1 to quit: ");
        grade = input.nextInt();
     }
     if(gradeCounter!=0)
     {
        double average = (double) total / 10;
        System.out.println("Total of " + gradeCounter + " grades entered is  " + total);
        System.out.println("Average of Total grades are: " + average);
     }
     else
    	 System.out.println("No grades were entered!");
	}

}
