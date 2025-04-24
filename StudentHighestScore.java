	
	import java.util.Scanner;
 	public class StudentHighestScore{
 	public static void main(String[] args){
 	
	Scanner input = new Scanner(System.in);

	System.out.println("Enter number of students: ");
	int numberOfStudent = input.nextInt();

	int secondHighest = 0;
	int Highest = 0;
	String name = " ";
	String secondName = " ";
	String StudentsName = " ";
	int StudentScore = 0;
	
	for(int counter = 1; counter <= numberOfStudent; counter++){
	System.out.println("Enter students score : ");
         StudentScore = input.nextInt();
 	
	if(StudentScore == Highest){
	secondHighest = Highest;
	 Highest = StudentScore;
	}
	
	if(StudentScore > Highest){
	secondHighest = Highest;
	 Highest = StudentScore;
	}


	System.out.println("Enter students names: ");
	 StudentsName = input.next();
 	
	if(StudentScore == Highest){
	secondName = StudentsName;
	name = StudentsName;
	}

	
	if(StudentScore > Highest){
	secondName = StudentsName;
	name = StudentsName;
	}

}

	System.out.println("The name of students is: " + name);
	System.out.println( "The student with the highest score is: " + Highest);


	System.out.println("the name of student with the second highest is: " + secondName);
	System.out.println("The student with the second highest score is: " + secondHighest);


	}
}