
		
	public class TabularOutput{
	public static void main(String [] args){

	System.out.printf("%s\t%s\t%s\t%s\t\n",  "N",    "N^2",     "N^3",   "N^4");

   	int count =1; 
        
	int square = 0;
    	int cube = 0;
    	int fourthRoot = 0;  
 

    while(count <= 5){
    square = count * count;
    cube = count * count * count;
    fourthRoot = count * count* count;
	 System.out.printf("%d\t%d\t%d\t%d\t\n ", count,    square,    cube,     fourthRoot );
        count++;   
       }
   
 


}



	}