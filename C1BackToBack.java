class C1BackToBack extends ConsoleProgram {


 /**
 * User inputs a string, take the last character and print a new string with the last character added at the front and back.
 * @author: A. Surees 
 */
  public void run() {
  
   String strWord;
   int intLength;
   String strLast;


   strWord = readLine("Enter a word: ");
  
   intLength = strWord.length();


   if (strWord.length() > 0){ 
       strLast = strWord.substring(intLength - 1);
       System.out.println(strLast + strWord + strLast);
   }


 }
}

