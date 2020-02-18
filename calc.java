import java.util.Scanner;
class Calculator {
  public static void main(String[] args){
    System.out.println("Please enter the operator");
    System.out.println("+ for addition");
    System.out.println("- for subtraction");
    System.out.println("* for multiplication");
    System.out.println("/ for division");
    Scanner op = new Scanner(System.in);
    String operation = op.next();
    Calculator pika = new Calculator();
    if (operation.equals("+")){
      pika.aPlus();
    } 
    else if (operation.equals("-")){
      pika.aMinus();
    } 
    else if (operation.equals("*")){
      pika.aTimes();
    } else if (operation.equals("/")) {
      pika.aDivide();
    } 
  }  
  public void aPlus(){
    Scanner inp = new Scanner(System.in);
    int num1 = inp.nextInt();
    System.out.println("And the second number.");
    int num2 = inp.nextInt();
    int total = num1 + num2;
    System.out.println(total);
    Scanner ch = new Scanner(System.in);
    String choice = ch.next();
    if (choice == "Y"  || choice == "y"){
        String[] uhuh = null;
        main(uhuh);
    }  
    else{
        System.exit(0);
    }  
} 
  public void aMinus(){
    Scanner inp = new Scanner(System.in);
    int num1 = inp.nextInt();
    System.out.println("And the second number.");
    int num2 = inp.nextInt();
    double total2 = num1 - num2; 
    System.out.println(total2);
    Scanner ch = new Scanner(System.in);
    String choice2 = ch.next();
    if (choice2 == "Y"  || choice2 == "y"){
        String[] uhuh = null;
        main(uhuh);
    }
    else{
      System.exit(0);
    }
  }
 public void aTimes(){
   Scanner inp = new Scanner(System.in);
    int num1 = inp.nextInt();
    System.out.println("And the second number.");
    int num2 = inp.nextInt();
    double total3 = num1 * num2;
    System.out.println(total3);
    Scanner ch = new Scanner(System.in);
    String choice3 = ch.next();
    if (choice3 == "Y"  || choice3 == "y"){
        String[] uhuh = null;
        main(uhuh);
    }
    else{
      System.exit(0);
    }
  }
 public void aDivide(){
   Scanner inp = new Scanner(System.in);
    int num1 = inp.nextInt();
    System.out.println("And the second number.");
    int num2 = inp.nextInt();
    double total4 = num1 / num2;
    System.out.println(total4);
    System.out.println("Would you like to enter another calculation? Y/N");
    Scanner ch = new Scanner(System.in);
    String choice4 = ch.next();
    if (choice4 == "Y"  || choice4 == "y"){
        String[] uhuh = null;
        main(uhuh);
    }
    else{
      System.exit(0);
    }
}  }  
