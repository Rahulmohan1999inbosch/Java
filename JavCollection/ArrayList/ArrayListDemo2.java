import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListDemo2 {
  public static void main(String[] args) {
    ArrayList al = new ArrayList();
    for (int i = 0; i < 10; i++) {
      al.add(i);
    }

    System.out.println(al);

    ArrayList al1 = new ArrayList();
    al1.addAll(al);
    al1.add(99);
    System.out.println(al1); // [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 99]

    // remove all elements from Array list
    al1.removeAll(al);
    System.out.println(al1); // [99]

    // Sorting ArrayList
    // sort method is present in the collection class

    Collections.sort(al);// sort the element in asxending order by default

    Collections.sort(al, Collections.reverseOrder());
    System.out.println(al); // [9, 8, 7, 6, 5, 4, 3, 2, 1, 0]

    // Collections.shuffle ,

    // You have some array elemensts and you want to convert it to ArrayList .

    String[] animal = { "Dog", "cat", "Horse" };

    ArrayList ar = new ArrayList(Arrays.asList(animal));// This is how you can convert into array Lisr.5

    // String[] a = { "Rahul" };
    // for (int k = 0; k < a.length; k++) {
    // System.out.println(a.length);

    // System.out.print(a[a.length - 1 - k]);
    // }

  }
}
