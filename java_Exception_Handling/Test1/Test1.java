class Test1{


public static void dostuff(){  //if you declare method as static it is class level method and you need not require instance variable to call this method .
 domsomemorestuff();
}

public static void domsomemorestuff(){
  System.out.println(10/0);
}

  public static void main(String[] args) {
    System.out.println("Hello world");
    dostuff();
  }
}