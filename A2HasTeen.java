class A2HasTeen extends ConsoleProgram {

  /**
  * Description
  * @author: A. Surees
  */
  
  public void run() {

    //get variables
    int age1 = readInt("Input age 1: ");
    int age2 = readInt("Input age 2: ");
    int age3 = readInt ("Input age 3: ");

    //if else 
    if (age1 >= 13 && age1 <= 19 || age2 >= 13 && age2 <= 19 || age3 >= 13 && age3 <= 19){
        System.out.println("true");
    }
    else {
     System.out.println("False");

    }
}
}
