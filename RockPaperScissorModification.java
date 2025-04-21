import java.util.Scanner;
import java.util.Random;
public class RockPaperScissorModification{
public static void main(String [] args){

Scanner input = new Scanner(System.in);

	
//System.out.println(computerChoice);
 	Random random = new Random ();
   	
        int userWin = 0;
        int computerWin = 0;
	int difference = 0;


     while(difference != 3 && difference != -3){
         System.out.print(" Enter Scissor(0), Rock (1), Paper (2):  ");
	int userChoice = input.nextInt();
	int computerChoice = random.nextInt(0, 3);
	
	
	if(userChoice == 0 && computerChoice == 2 ){
 	System.out.println("the computer is paper, you are scissor, you won ");
         userWin++;
	}

	if( userChoice == 0 && computerChoice == 1){
	System.out.println("the computer is rock, you are scissor, you lose ");
	computerWin--;
	}

	if(userChoice == 0 && computerChoice == 0){
	System.out.println(" the computer is scissor, you are scissor, it is a draw");
         
	}

	if(userChoice == 1 && computerChoice == 2 ){
 	System.out.println("the computer is paper, you are scissor, you won ");
	userWin++;
        }

	if( userChoice == 1 && computerChoice == 0){
	System.out.println("the computer is scissor, you are rock, you lose ");
	computerWin--;
	}

	if(userChoice == 1 && computerChoice == 1){
	System.out.println(" the computer is rock, you are rock, it is a draw");
	
	}


	if(userChoice == 2 && computerChoice == 0 ){
 	System.out.println("the computer is scissor, you are paper, you lose ");
	computerWin++;
	}

	if( userChoice == 2 && computerChoice == 1){
	System.out.println("the computer is rock, you are paper, you win");
	userWin++;
	}

	if(userChoice == 2 && computerChoice == 2){
	System.out.print(" the computer is paper, you are paper too. it is a draw");
	}
	
	difference = userWin - computerWin;
     
    

	 System.out.println(" user is winning by:   " +userWin );
	 System.out.println("computer is winning by:  " +computerWin);
					
	  }	


	}		


				}