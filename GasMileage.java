	import java.util.Scanner;

	public class GasMileage{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	int SENTINEL= -1 ;
	int totalMiles = 0;
	int totalGallons = 0;
	int counter = 0;
	int Miles = 0;
	int gallons = 0;

	while (Miles != SENTINEL){
 	System.out.println(" Enter Miles Driven and stop" +SENTINEL);
 	Miles = input.nextInt();
	totalMiles += Miles;
	counter++;
	}

	while(gallons != SENTINEL){
	System.out.println("Enter Gallons used for the trip and stop" +SENTINEL);
	gallons = input.nextInt(); 
	totalGallons += gallons;
	counter++;
 	}
 
  	double overallMPG = totalMiles/totalGallons;

	System.out.printf("Miles per gallon for this trip: %.2f%n", overallMPG);



	}


		}