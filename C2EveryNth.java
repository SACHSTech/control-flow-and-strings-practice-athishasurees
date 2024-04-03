class C2EveryNth extends ConsoleProgram {


 /**
 * Given a non-empty string and an int N, return the string made starting with character 0, and then every Nth char of the string.
 * @author: A. Surees
 */
  public void run() {
  
   String strString;
   int intNumber;
   int intLength;
   String strFinal = ""; 
   int intTimes;
   String strCharacter;
  
   strString = readLine("Enter a word: ");
   intNumber = readInt("Enter a number: ");
  
   intLength = strString.length();


   for (intTimes = 0; intTimes < intLength; intTimes += intNumber){
       strCharacter = strString.substring(intTimes, intTimes + 1);
       strFinal += strCharacter;
   }
       System.out.println(strFinal);
 }
}

