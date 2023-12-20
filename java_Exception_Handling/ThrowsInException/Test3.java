package ThrowsInException;

public class Test3 {
  // In this we use the throws keyword in oreder to handle the chekced exceptions
  public static void main(String[] args) throws InterruptedException {
    Thread.sleep(100);
    System.out.println("The execution is successful");
  }
}
