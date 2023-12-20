package ThrowsInException;

public class Test1 {
  public static void main(String[] args) {
    // System.out.println(10 / 0);
    throw new ArithmeticException("Divide by zero"); // this is how you can throw exeption using throw key word

  }
}
