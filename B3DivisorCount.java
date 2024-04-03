class B3DivisorCount extends ConsoleProgram {


 /**
 
 * @author: A. Surees
 */
  public void run() {


   int intInteger;


   intInteger = readInt("Enter an integer: ");


   for (int intDivisors = 1; intDivisors <= intInteger; intDivisors++){
       if (intInteger % intDivisors == 0) {
           System.out.printf("%s%n", intDivisors);
       }
   }
 }
}

