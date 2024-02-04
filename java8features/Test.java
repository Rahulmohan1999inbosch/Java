@FunctionalInterface // this annotation is used to make sure the interface is an functional
                     // interface,but not mandatory.
interface Interf {
  // This is a functional method as it has only one abstract method and can have
  // multiple satic methods and default methods such interfaces are known as
  // functional interface
  public void m1();
}

class Test {
  public static void main(String[] args) {
    Interf i = () -> System.out.println("Hello... By lambda Expression");
    i.m1();
  }
}
