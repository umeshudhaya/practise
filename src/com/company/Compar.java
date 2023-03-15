package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Compar {
    public static void main(String[] args) {
        ArrayList al=new ArrayList();
        al.add("red");
        al.add("pink");
        al.add("green");
        al.add("white");
        al.add("blue");
        al.add("grey");

       /* <----------shuffle------------->
               System.out.println("before suffle"+al);
               Collections.shuffle(al);
                System.out.println("After suffle"+al);*/


       /* <-----------reverse----------->
       System.out.println("before reverse"+al);
        Collections.reverse(al);
        System.out.println("after reverse"+al);
       */

      /*   // <-----------extract----------->
        System.out.println("before extract"+al);
        List extractss=al.subList(0,4);
        System.out.println("after extract"+extractss);
    */
        ArrayList  al2=new ArrayList<>();
        al2.add("violit");
        al2.add("red");
        al2.add("white");
        al2.add("black");
        al2.add("yellow");
        al2.add("pink");
        al2.add("green");

        /*-----------replace element-------
        System.out.println("BEFORE replace al2 "+al2);
        al2.set(03,"--RAINBOW--");
        System.out.println("AFTER replace al2 "+al2);
         */

        /* Java program to print all the elements of a ArrayList using the position of the elements*/
       int numelement=al2.size();
        System.out.println("position of the elements");
        for (int i = 0; i <numelement ; i++) {
            System.out.println(al2.get(i));
        }


        /*--------------trim list size----------------
        System.out.println("before trim al2  "+al2);
        al2.trimToSize();
        System.out.println("after trim al2 "+al2);
         */
        /*<---------------REPLACE THE ELEMENT---------------->
        System.out.println("before replace al2 "+al2);
        al2.re
        System.out.println("after replace al2 "+al2);

         */



        /*<----------------emptylist----------------->
        System.out.println("before list empty"+al);
        al.removeAll(al);
        System.out.println("after list empty"+al);
         */

          /* <-------------check given list is empty or not------------->
                System.out.println("before checking al "+al.isEmpty());
                al.removeAll(al);
                System.out.println("after checking al "+al.isEmpty());
           */

      /*       <----------------clone---------------->
        System.out.println("<-------before clone ----->"+al);
        al.clone();
        System.out.println("<-------after clone ----->"+al);

        */

       /* <------------------join to 2 list elements------------------->
        al.addAll(al2);
        System.out.println("Join two lists "+ al);*/


        /* <--------------swap to element----------------->
        System.out.println("before swap al2  "+ al2);
        Collections.swap(al2,0,5);
        System.out.println("after swap al2  "+ al2);
       */
        //<-------------compar 2 lists------------->
     /*   ArrayList al3=new ArrayList();

        for (Object e :al )
            al3.add(al2.contains(e) ? "Yes" : "No");
        System.out.println(al3);
     */
       /* //capacity incresing using ensure capacity
        ArrayList<String> al4=new ArrayList<String>(3);
        al4.add("ball");
        al4.add("bat");
        al4.add(" run");
        System.out.println("Before increasing capacity al4 "+al4);
        al4.ensureCapacity(7);
        al4.add("set");
        al4.add("jet");
        al4.add("pet");
        al4.add("wet");
        System.out.println("After increasing capacity al4 "+al4);
*/
    }
}
