
	public class IntegersDivisible3{
	public static void main(String [] args){
	
       int count = 1;
	int sum = 0;

	for(    ; count <= 30; count++){

		if(count % 3 == 0){
		sum = sum + count;
		
		}

	}

	System.out.println("sum of numbers: " + sum);


}




}