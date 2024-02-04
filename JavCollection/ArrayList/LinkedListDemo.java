import java.util.LinkedList;

class LinkedListDemo {
  public static void main(String[] args) {
    LinkedList<Integer> l = new LinkedList<Integer>(); // this to store homogenous data

    // Add elements into linked list
    l.add(1);
    l.add(39);
    l.add(69);

    System.out.println(l); // [1, 39, 69]

    // to remove element
    l.remove(0);
    System.out.println(l); // [39, 69]
    
    l.add(2, 45);
    System.out.println(l);

    // l.get(index) to get the 
    //l.set(index,value) to over write 
    


  }
}