class hello {

  public void tables(int number) {
    for (int i = 1; i < 11; i++) {
      System.out.println(number + "*" + i + "=" + number * i);
    }

  }
  public static void main(String[] args) {
    System.out.println("Hello world");
    hello table = new hello();
    table.tables(16);
  }

}