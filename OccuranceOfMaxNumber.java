    	import java.util.Scanner;
        public class OccuranceOfMaxNumber{
	public static void main(String [] args ){
        Scanner input = new Scanner(System.in);

          System.out.print("Enter numbers and end with (0): ");
         
   
        int count = 0;
        int largest = 0;
  
      	while(true){
     	int number = input.nextInt();
         if (number == 0){
               break;}

        if(number > largest){
	largest = number;
	count = 1;
                   }

       else if (largest == number){
    	 count++;}

       }
         
        System.out.println("the largest number is : " + largest);
         System.out.println("the number with the highest occurance is: " + count);

}
}