	import java.util.Scanner;
 	public class Evennnn{
 	public static void main(String [] args){


        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        System.out.print("The even numbers are: ");

        for (int count = 2; count <= number; count += 2) {
            System.out.print(count + " ");


        }



    }
		}

