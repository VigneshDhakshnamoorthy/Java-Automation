package collection.frame;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.Vector;

public class colection_framw {
	public static void main(String[] args) {
		// Vector, Table, Array
		int arr[] = new int[] { 1, 2, 3, 4 };
        Vector<Integer> v = new Vector<Integer>();
        Hashtable<Integer, String> h
            = new Hashtable<Integer, String>();
        
        v.addElement(1);
        v.addElement(2);
        System.out.println( v.contains(2));
        System.out.println( v.contains(3));
       
        
        h.put(1, "geeks");
        h.put(2, "4geeks");
        
        System.out.println(arr[0]);
        System.out.println(v.elementAt(0));
        System.out.println(h.get(1));
        
		// List
        
        System.out.println();
        System.out.println("Array List");
        
        ArrayList<Integer> al
        = new ArrayList<Integer>();
        
        for (int i = 1; i <= 5; i++) {
            al.add(i);
        }
        System.out.println(al);
        
        al.remove(3);
        System.out.println(al.contains(3));
        System.out.println(al.contains(4));
        System.out.println(al);
        for (int i = 0; i < al.size(); i++) {
            System.out.print(al.get(i) + " ");
        }
        System.out.println();
        System.out.println();
        System.out.println("Linked List");
        LinkedList<Integer> ll
        = new LinkedList<Integer>();
        for (int i = 1; i <= 5; i++) {
            ll.add(i);
        }
  
        System.out.println(ll);
  
        ll.remove(3);
  
        System.out.println(ll);
  
        for (int i = 0; i < ll.size(); i++)
            System.out.print(ll.get(i) + " ");
	}

}
