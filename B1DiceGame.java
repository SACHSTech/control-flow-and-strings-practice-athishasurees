import java.util.Random;
class B1DiceGame extends ConsoleProgram {
  
 /**
 * @author: A. Surees
 */
 public void run() {

    //declare variables 
   int intTotal;
   int intDiceRoll1;
   int intDiceRoll2;
   int intOneHundred;
  
   //randomizer (for the dice roll)
   for (intOneHundred = 1; intOneHundred <= 100; intOneHundred++){
       Random randomA = new Random();
       Random randomB = new Random();
       intDiceRoll1 = randomA.nextInt(6);
       intDiceRoll2 = randomB.nextInt(6);
      
    //add the totals of both dice 
   intTotal = intDiceRoll1 + intDiceRoll2;

    //if statement 
   if (intTotal == 2){
       System.out.println("snake eyes!");
   }
   else if (intTotal == 7){
       System.out.println("lucky seven!");     
   }
  
   }
}
}

