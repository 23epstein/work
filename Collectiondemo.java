/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package collectiondemo;
import java.util.*;
import javax.swing.*;
/**
 *
 * @author epste
 */
public class Collectiondemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List < String > list = new ArrayList < > ();
    list.add("Apple");
    list.add("banana");
    list.add("Orange");
    System.out.println("List example: " + list);
    //Set example
    Set < Integer > set = new HashSet < > ();
    set.add(1);
    set.add(2);
    set.add(3);
    set.add(2); //Duplicate element wont be added
    System.out.println("Set Example: " + set);
    System.out.println("Max value of Hash set is: " +
      Collections.max(set));

    //Queu example
    Queue < String > queue = new LinkedList < > ();
    queue.add("One");
    queue.add("Two");
    queue.add("There");

    //Linked List exmple
    LinkedList < String > linkedList = new LinkedList < > ();
    linkedList.add("Dog");
    linkedList.add("Cat");
    linkedList.add("Fish");

    System.out.println("Linked List Example: " + linkedList);

    Boolean result = linkedList.contains("Cat");
    // printing the result
    System.out.println("Is Cat present in the List: " + result);

    //Hash set example
    HashSet < Integer > hashSet = new HashSet < > ();
    hashSet.add(1);
    hashSet.add(2);
    hashSet.add(3);
    System.out.println("Hash Set Example: " + hashSet);
    System.out.println("Is the Hash Set empty: " + hashSet.isEmpty());
    //Tree Set example
    TreeSet < Integer > treeSet = new TreeSet < > ();
    treeSet.add(3);
    treeSet.add(5);
    treeSet.add(2);
    treeSet.add(1);

    System.out.println("Tree Set Example: " + treeSet);

    System.out.println("Therefore the size is: " + treeSet.size());
    }
    
}



