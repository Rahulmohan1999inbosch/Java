import java.util.*;

public class input {
  public static void main(String[] args) {

    // here the delimiter used was a white space

    // Scanner input=new Scanner(System.in); //This is something i am entering
    // System.out.println(input.next());
    // int num1=input.nextInt();
    // float num2=input.nextFloat();
    // boolean value =input.nextBoolean();

    // float sum=num1+num2;

    // if(value==true){
    // System.out.println("The addition of the numbers is :-"+sum);
    // }

    // System.out.println("The Multiplication of the table that iam giving you is");
    // for(int i=1;i<11;i++){
    // System.out.println(num1+"*"+i+"="+num1*i);
    // }

    // This
    // input.next this method only the string until encoubters a space()

    // if you want to read a full senetence you cannot use the next method.

    // lets try to read int ,float boolean and double value

    // using custom delimeter

    Scanner scanner = new Scanner(System.in);
    scanner.useDelimiter(",");
    System.out.println("Enter two numbers with comma seperated");

    // exception handlers while processing inputs
    // to read the entire line use nextLine() method.

    try {
      int n1 = scanner.nextInt();
      int n2 = scanner.nextInt();
      System.out.println("Sum of two numbers are " + n1 + n2);
    }

    catch (InputMismatchException e) {
      System.out.println("Invalid inputs please check your inputs and try again ......");
    }

  }
}
