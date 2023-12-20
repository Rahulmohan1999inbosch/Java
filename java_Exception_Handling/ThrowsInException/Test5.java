package ThrowsInException;

public class Test5 {
  public static void main(String[] args) {
    int age = 70;
    if (age > 60) {
      throw new TooOldException("You are too old gransps");
    } else if (age < 18) {
      throw new TooyoungException("You are too young you pervert");
    }

    else {
      System.out.println("Thank you for registration");
    }
  }
}

class TooyoungException extends RuntimeException {
  TooyoungException(String msg) {
    super(msg);

  }
}

class TooOldException extends RuntimeException {
  TooOldException(String msg) {
    super(msg);
  }
}
