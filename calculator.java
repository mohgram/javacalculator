import java.util.Scanner;
class Calculator {
  public void main(String[] args){
    System.out.println("Welcome to a calculator. Please input the first number");
    System.out.println("The operator too.");
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
  }  
  public void aMinus(){
    Scanner inp = new Scanner(System.in);
    int num1 = inp.nextInt();
    System.out.println("And the second number.");
    int num2 = inp.nextInt();
    double total2 = num1 - num2; 
    System.out.println(total2);
  }
 public void aTimes(){
   Scanner inp = new Scanner(System.in);
    int num1 = inp.nextInt();
    System.out.println("And the second number.");
    int num2 = inp.nextInt();
    double total3 = num1 * num2;
    System.out.println(total3);
  }
 public void aDivide(){
   Scanner inp = new Scanner(System.in);
    int num1 = inp.nextInt();
    System.out.println("And the second number.");
    int num2 = inp.nextInt();
    double total4 = num1 / num2;
    System.out.println(total4);
  }
}    
