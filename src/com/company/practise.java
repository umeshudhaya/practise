package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class practise {
    public static void main(String[] args) {

            ArrayList colors=new ArrayList();
            colors.add("red");
            colors.add("pink");
            colors.add("green");
            colors.add("white");
            System.out.println(colors);
            colors.add(0,"grey");
            colors.add(2,"purble");
        System.out.println(colors.get(2));
      //  System.out.println("removved -----item----->"+colors.remove(3));
       // System.out.println("remove using object  "+colors.remove("purble"));
       // System.out.println(colors.size());
        System.out.println("before sorting"+colors);
        Collections.sort(colors);
        System.out.println("After sorting"+colors);

        ArrayList colors2=new ArrayList();
        colors2.add(1);
        colors2.add(2);
        colors2.add(3);
        colors2.add(4);
        colors2.add(5);
        colors2.add(6);
        Collections.copy(colors,colors2);
        System.out.println("list 1"+colors);
        System.out.println("list 2"+colors2);

        /*    Object n=colors.toArray();
        for (Object s:colors) {
            System.out.println(s);
        }

         */
    }
}
