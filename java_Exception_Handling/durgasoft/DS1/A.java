// A seperate .class will be created based on the class files.
//discussion based on the naming the file name convention, should the .java file and be named same as the class name in java.
//well if the .java has only one class you can name this java file with whatever name you want to name it.but the .class file that gets generated will be the class name you defined as the class name.

//when the class is declared as public , the same class should name should be used for naming the .java file as well.

//if theres is multiple classes in a .java file only one class can have public modifiers . and the file name shoud also be the same

public class A {

  public static void main(String[] args) {
    System.out.println("this is class A main");
  }

}

class B {
  public static void main(String[] args) {
    System.out.println("This is class b main");
  }
}

class C {
  public static void main(String[] args) {
    System.out.println("class c main");
    java.util.ArrayList l = new java.util.ArrayList(); //instead of this use the import statement.
    
  }
}