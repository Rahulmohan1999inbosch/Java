package UncheckedException;

public class Test2 {
  public static void main(String[] args) {
    // Here we will be seeing differnt ways of printing exception on the console

    try {
      int x = 10 / 0;
    } catch (ArithmeticException e) {
      System.out.println("This is a stack trace method");
      e.printStackTrace();//This gives the complete information 

      System.out.println(e.toString()); //this gives the name  of the exception only
      

    }
  }
}
