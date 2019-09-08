import java.util.*;


public class Game {

	
	private boolean endgame =false;;
	
	public void play() {
		
		////Looping The Game/////////////
		
		
		
		while(endgame==false) {
	   
      // get input from user
      Scanner scnr = new Scanner(System.in);
      System.out.print("How much do you want to bet? ");                                                 
      int enteredBet = scnr.nextInt(); 
      System.out.print("What number do you choose ? ");
      int enteredNum = scnr.nextInt(); 
   
      // generate the die roll 
      Random randGen = new Random();
      int dieNum  =  randGen.nextInt(6) + 1;
      System.out.println("The die is a " + dieNum);
   
      // write the rest of your code below

if(enteredNum==dieNum) {
	enteredBet*=10;
	
	System.out.println("You win "+enteredBet+" dollars!");
	break;
	}

else {System.out.println("Sorry you lose");  continue;}


		}



	
	
	}
}
