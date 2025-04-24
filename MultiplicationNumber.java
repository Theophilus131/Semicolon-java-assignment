 	import java.util.Scanner;
	public class MultiplicationNumber{
 	public static void main(String [] args){
   
        Scanner input = new Scanner(System.in);
     
     System.out.print("Enter integer: ");
      int number = input.nextInt();

     System.out.printf("%s\t      %s\t    %s\t%n ", "N0-",  "Number",  "Result");
    
    
     int counter = 1;
    int Result =0;


   while( counter <=12 ){
   
    Result = counter * number;
    System.out.printf("%d\t       %d\t      %d%n  ",  counter,  number,  Result ); 
	 counter++; 
    
	} 
    


	





	}



}