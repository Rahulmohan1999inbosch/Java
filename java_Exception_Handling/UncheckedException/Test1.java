package UncheckedException;

public class Test1 {
  public static void main(String[] args) {
    System.out.println("Statemnt");
    try {
      System.out.println(10 / 0);
    } catch (ArithmeticException e) {
      System.out.println("This is an Java unchecked exception which is handled by using the try and catch block");
      System.out.println(e);
      System.out.println("Here even if the error occurs the code excudes gracefully");
    }
  }
}
