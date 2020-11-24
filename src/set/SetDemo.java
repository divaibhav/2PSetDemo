/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 24-Nov-20
 *  Time: 10:19 AM
 */
package set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Going to create a set to hold integer objects, and check some of the method of set. Using
 * HashSet class
 */
public class SetDemo {
    public static void main(String[] args) {
        //creating a set to hold integer objects
        Set<Integer> set = new HashSet<>();//capacity = 16 and load factor = 0.75

        //adding elements in set
        System.out.println(set.add(10));
        System.out.println(set.add(10));
        set.add(5);
        set.add(19);
        set.add(8);
        set.add(15);
        //printing set
        System.out.println(set);
        //removing an element
        System.out.println(set.remove(67));
        System.out.println(set.remove(8));
        //printing set
        System.out.println(set);

        //creating an arraylist
        List<Integer> list = new ArrayList<>();
        //adding random elements in list
        for (int i = 0; i < 20; i++) {
            list.add((int)(Math.random()*100));
        }
        System.out.println("list = " + list);

        //adding all the elements of list in set
        set.addAll(list);
        //printing set
        System.out.println("set = " + set);


    }
}
