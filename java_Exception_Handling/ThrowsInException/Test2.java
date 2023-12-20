package ThrowsInException;

public class Test2 {
  public static void main(String[] args) {
    try {
      Thread.sleep(100000);
      System.out.println("Done");
    }

    catch (Exception e) {
      System.out.println("handled exception here");
    }

  }
}
