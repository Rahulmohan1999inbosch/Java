@FunctionalInterface
package java8features;

/**
 * Test1
 */
public interface Interf1 {

  public add(int n1,int n2);

}

class Test1 {
  public static void main(String[] args) {
    Interf1 i = (n1, n2) -> n1 + n2;

  }
}
