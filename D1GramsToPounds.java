class D1GramsToPounds extends ConsoleProgram {


 /**
 * @author: A.Surees
 */
  public void run() {
   int intGrams = 100;
   double dblPounds;
   
   System.out.printf("%6s%10s%n", "Grams", "Pounds");
   System.out.println("------------------");


   for (intGrams = 100; intGrams <= 1000; intGrams += 100){
       dblPounds = intGrams * 0.0022046;
       System.out.printf("%6d %10.4f %n", intGrams, dblPounds);
   }
 }
}

