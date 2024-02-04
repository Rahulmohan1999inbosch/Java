package Conceptslearnedfromhackerrank;

import java.io.*;
import java.util.*;

public class javaEndofline {
  public static void main(String[] args) {
    /*
     * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
     * class should be named Solution.
     * Add some comments just to create a pull request.
     */
    Scanner sc = new Scanner(System.in);
    int count = 1;
    while (sc.hasNext()) {
      String word = sc.nextLine();
      if (word.contains("end-of-file.")) {
        System.out.println(count + " " + word);
        break;
      }
      System.out.println(count + " " + word);
      count++;
    }

  }

}
