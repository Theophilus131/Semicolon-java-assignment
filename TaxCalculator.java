	import java.util.Scanner;
   
   	public class TaxCalculator{
   	public static void main(String [] args){

   	Scanner input = new Scanner(System.in);

    	double taxRate15 = 0.15;
     	double taxRate20 = 0.2;
     	int earning = 30000;
      	int count = 1;
	double TotaltaxRate = 0;

	while(count <= 3){
  	System.out.println("Enter earning to calculate your tax: ");
     	int number = input.nextInt();
         if(number > earning){
      	TotaltaxRate= number * taxRate20 ;
           }
      	else{ TotaltaxRate = earning * taxRate15;
            }
	System.out.printf("The total tax earning of the citizen %.2f%n: ", TotaltaxRate);
	 count++;
	}

}
}