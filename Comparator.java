 //(Creating a Comparator) Write an application that works as a comparator. Your program
// should read two numbers from the user and print 0 if they are equal to each other, 1 if the first number is greater, and –1 if the second number is greater.

	import java.util.Scanner; 
  public class Comparator{
  public static void main(String [] args){
 
  Scanner input = new Scanner(System.in);

   System.out.println("Enter number: ");
    int firstNumber = input.nextInt();

    System.out.println("Enter second number: ");
    int secondNumber = input.nextInt();

     if(firstNumber == secondNumber ) System.out.println("0");

     if(firstNumber > secondNumber) System.out.println("1");

    if(secondNumber < firstNumber) System.out.println("-1");








 	}




}