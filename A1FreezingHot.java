class A1FreezingHot extends ConsoleProgram {

  /**
  * Description
  * @author: A. Surees 
  */
  
  public void run() {

 //define variables
    int temp1;
    int temp2;

//get user input 
temp1 = readInt("Input temperature 1: ");
temp2 = readInt("Input temperature 2: ");

//if else statement
if (temp1 < 0 && temp2 > 100 || temp2 < 0 && temp1 > 100){
    System.out.println("True");
}
else{
    System.out.println("False");
}
  }
}

