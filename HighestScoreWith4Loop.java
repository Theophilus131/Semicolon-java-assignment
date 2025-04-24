	import java.util.Scanner;
 	public class HighestScoreWith4Loop{
 	public static void main(String [] args){
 	
	Scanner input = new Scanner(System.in);

	System.out.println("Enter number of students: ");
	int numberOfStudent = input.nextInt();


	int Highest = 0;
	String name = " ";
	String StudentsName = " ";
	int StudentScore = 0;
	
	for(int counter = 1; counter <= numberOfStudent; counter++){
	System.out.println("Enter students score : ");
         StudentScore = input.nextInt();
 	
	if(StudentScore >= Highest ){
	 Highest = StudentScore;
	}

 	 
	System.out.println("Enter students names: ");
	 StudentsName = input.next();
 		
	if(StudentScore >= Highest ){
	name = StudentsName;
	}

}

	System.out.println("The name of students is: " + name);

	System.out.println( "The student with the highest score is: " + Highest);




	}
}