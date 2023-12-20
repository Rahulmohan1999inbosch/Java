package UncheckedException;

public class Test4 {
  public static void main(String[] args) {

    try {
      System.out.println("Outer try block");
      try {
        int x = 10 / 0;

      } catch (ArithmeticException e) {
        System.out.println("Caught the inner exception" + e);
      }
    }

    catch (Exception e) {
      System.out.println("Caught the outer exception");
    }
  }
}
