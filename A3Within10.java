class A3Within10 extends ConsoleProgram {

  /**
  * Description
  * @author: A. Surees
  */
  
  public void run() {
           
   
     // Parse the arguments to integers
    int num1 = readInt("Input first number: ");
    int num2 = readInt("Input second number: ");
        

        // Calculate the absolute differences from 10
        int diff1 = Math.abs(num1 - 10);
        int diff2 = Math.abs(num2 - 10);
        
        // Check which value is closer to 10
        if (diff1 < diff2) {
            System.out.println(num1);
        } else if (diff2 < diff1) {
            System.out.println(num2);
        } else {
            // If both are equidistant from 10, output 0
            System.out.println(0);
        }
    }
}
    
  

