 public class TablePrint{
 public static void main(String[] args){

 	double square = 0;
	int power=0;
        int b = 2; 
        int a = 1;
		System.out.printf("%s%10s%15s%n",  "a",  "b",  " pow(a, b)");
	for(a = 1; a <= 5; a++){

 	 b= a + 1;
 	square = Math.pow(a, b);
 	int power = (int) square;
	}

    
 	//System.out.printf("%10s, %10s, %10s ", a , b, square);
	
	//System.out.printf("%s\t  %s\t %s\t ", a , b, square);
	
 	System.out.printf("%-10d%-10d%-10.2f", a , b, square);



}


}