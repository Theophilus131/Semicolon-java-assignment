import java.util.Scanner;
public class Sentinel{
public static void main(String [] args){

Scanner input = new Scanner(System.in);
 int sum = 0;
System.out.print(" Enter numbers end process when 0 is entered ");
  int data = input.nextInt();
 
  while( data != 0 ){
   sum =sum + data;
  System.out.print(" Enter numbers end process when 0 is entered:  " );
  data = input.nextInt();
  }

System.out.println("the sum is   " + sum  );




}

}