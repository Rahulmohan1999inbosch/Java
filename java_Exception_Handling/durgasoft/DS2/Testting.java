package java_Exception_Handling.durgasoft.DS2;
import static java.lang.Math.sqrt;  //this is static import, you are importing the staic member sqrt from the Math class and you can directlty use the sqrt method which is the static method of Math class.



class Testting {
  // when eer we are importing java packages ,all classes and interfaces present
  // in that package by default available, but not sub package classes, if you
  // want to use sub package class compulsory we should write import statement
  // until sub package level.

  // like java-util-regex-pattern
  // now to use pattern class in our program which import statement is required?
  // import java.* Wrong
  // import java.util.* wrong
  // import java.util.regex.* right

  // all classes and interfaces present in these two packages does not need import
  // statement
  // java.lang package
  // default package i.e the current working directory all classes and interfaces
  // by default is available for the java

  // for example there is a student class in the same folder so let us use the
  // properties and methods of that class without importing.

  // the import statement is a dynamic include i.e it loads all the required class during run time.

  //Static import static import improves readability
  //example of using static import.

  //suppose you are using a static method example math class function like max method or sqrt method, 
  //math.sqrt() instead of using this math.sqrt() you can import the static method and use sqrt() instead.
  // so basically if you want to use the static members of the class we use static import 



  public static void main(String[] args) {
    student s1 = new student();
    System.out.println(s1.name);
    System.out.println(s1.age);
    s1.display();

    System.out.println(Math.sqrt(4)); // math was a static method
  }

}
