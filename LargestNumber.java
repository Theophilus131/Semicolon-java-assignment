// pseudocode
// 
// initialize number to 0;
//initialize counter to 0; to increment my number
 //number enter shuld not be less than equal to 10 ( <=10)
// if  

import java.util.Scanner;
public class LargestNumber{
public static void main(String [] args){

Scanner input = new Scanner(System.in);

int number = 0;
int counter = 1;
int Largest = 0;


System.out.print("please enter numbers: ");
 
 while(counter <= 10){
number = input.nextInt();
 
    if( number > Largest){

Largest = number;
}
  counter++;
}


System.out.print("The largest number in the group " + Largest);


}

}