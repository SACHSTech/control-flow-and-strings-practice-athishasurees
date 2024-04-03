class B4IsPrime extends ConsoleProgram {


 /**
 *  a program that lets you enter an integer, and that will print appropriately "is a prime number" or "is a composite number".
 * @author: A. Surees
 */
  public void run() {
   int intNumber;
   int intCounter;
   int intPrime = 1;


   intNumber = readInt("Enter an integer greater than 1: ");


   for (intCounter = 2; intCounter < intNumber; intCounter++){
       if (intNumber % intCounter == 0) {
            intPrime = 0;
       }
   }
   if (intNumber <= 1) {
       System.out.println("it is less than or equal to 1");
   }
   else if (intPrime == 1) {
       System.out.println("it is a prime number");
   }
   else {
       System.out.println("it is a composite number");
   }     
 }
}

