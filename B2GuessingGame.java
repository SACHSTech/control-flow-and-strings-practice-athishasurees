import java.util.Random;
class B2GuessingGame extends ConsoleProgram {


 /**
 * @author: A. Surees
 */
  public void run() {
   int intAttemps;
   int intSecret;
   int intGuess;


   Random randomA = new Random();
   intSecret = randomA.nextInt(1, 100);
  
   for (intAttemps = 1; intAttemps <=5; intAttemps++){
        intGuess = readInt("Guess a number between 1-100: ");
   if (intGuess == intSecret){
       intAttemps = 5;
       System.out.println("congratulations");
   }
   else if (intGuess < intSecret && intAttemps !=5) {
       System.out.println("too low, guess again");
   }
   else if (intGuess > intSecret && intAttemps !=5){
       System.out.println("too high, guess again");
   }
   else {
       System.out.println("Nice try");
   }
   }
 }  
}

