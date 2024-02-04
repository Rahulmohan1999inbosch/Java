package Conceptslearnedfromhackerrank;

import java.io.*;
import java.util.*;

class Solution {

  public static void main(String[] args) {
    System.out.println("Enter the string you want to check as palindrome");
    Scanner sc = new Scanner(System.in);
    String A = sc.next();
    /* Enter your code here. Print output to STDOUT. */

    String palindrome = "Yes";
    int length = A.length();
    if (length % 2 == 0) {
      String left = A.substring(0, length / 2);
      String right = A.substring(length / 2, length);
      for (int i = 0; i < left.length(); i++) {
        int temp = -1;
        if (left.charAt(i) != right.charAt(right.length() - i - 1)) {
          palindrome = "No";
          break;
        }
      }
    } else {
      String left = A.substring(0, length / 2);
      String right = A.substring((length / 2) + 1, length);
      for (int i = 0; i < left.length(); i++) {
        if (left.charAt(i) != right.charAt(right.length() - i - 1)) {
          palindrome = "No";
          break;
        }
      }
    }

    System.out.println(palindrome);
  }
}
