import java.util.ArrayList;

import javax.swing.text.html.HTMLDocument.Iterator;

class ArrayListDemo {
  public static void main(String[] args) {
    ArrayList al = new ArrayList(); // Declaring an array list
    ArrayList<Integer> al1 = new ArrayList<Integer>(); // Array list contians only integer

    // Add new elements to Array list
    al.add(100);
    al.add("Welcome");
    al.add(12.45);

    System.out.println(al); // [100, Welcome, 12.45]

    System.out.println(al.size()); // 3

    al.remove(0);
    System.out.println(al); // [Welcome, 12.45]

    // inset element at particular location

    al.add(0, "rahul");
    System.out.println(al); // [rahul, Welcome, 12.45]

    // retrieve elements
    al.get(0); // No impact on the list

    // over write the existing value
    al.set(0, "Upgraded Rahul");
    System.out.println(al); // [Upgraded Rahul, Welcome, 12.45]

    // for loop to read data from array list
    for (int i = 0; i < al.size(); i++) {
      System.out.println(al.get(i));
    }

    for (Object o : al) {
      System.out.println(o);
    }

    // Here the Object o can hold all kind of data , if the there is only integer
    // then you can use Integer wrapper class to interate the Array list

    // iterator

    //Iterator it = al.iterator();

  }
}
