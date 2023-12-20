package ThrowsInException;

public class Test4 {
  public static void main(String[] args) {
    dostuff();
  }

  public static void dostuff() {
    try {
      domorestuff();
      System.out.println("This i have handled here");
    } catch (InterruptedException e) {
      System.out.println("Handled the exception");
    }

  }

  public static void domorestuff() throws InterruptedException {
    Thread.sleep(100);
  }
}
