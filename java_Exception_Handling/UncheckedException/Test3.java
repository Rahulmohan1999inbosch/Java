package UncheckedException;

public class Test3 {
  public static void main(String[] args) {
    try {
      int x = 10 / 1;
    } catch (ArithmeticException e) {
      System.out.println("This is exception occured case" + e);
    } finally {
      System.out.println("This block is always executed");
    }
  }
}
