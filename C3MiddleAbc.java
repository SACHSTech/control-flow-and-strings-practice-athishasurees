class C3MiddleAbc extends ConsoleProgram {


 /**
 */
  public void run() {
  
   String strAbc;
   int intLength;
   int intB;
   int intEnd;


   strAbc = readLine("Enter a string that contains abc: ");


   intLength = strAbc.length();
 
   intB = strAbc.indexOf("b");
   intEnd = intLength - intB - 1;
  
   if ((intEnd == intB || intEnd - intB == 1) || (intB - intEnd == 1)){
       System.out.println("true");
   }
   else {
       System.out.println("false");
   }
  
 }
}

