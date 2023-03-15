package com.company;

import java.util.*;

public class linkedlist {
    public static void main(String[] args) {
        LinkedList ls=new LinkedList<>();
        ls.add("one");
        ls.add("two");
        ls.add("three");
        ls.add("four");
        ls.add("five");
       // System.out.println(ls);

//        /*26. Write a Java program to replace an element in a linked list */
        System.out.println("before change element "+ls);
        ls.set(2,"Eight");
        System.out.println("The value of second element changed.");
        System.out.println("New linked list: " + ls);


        /*25. Write a Java program to test an linked list is empty or not.
        System.out.println("list not empty  "+ls.isEmpty());
        ls.removeAll(ls);
        System.out.println("list is empty  "+ls.isEmpty());
        System.out.println(ls.isEmpty());

         */



        /*24. Write a Java program to compare two linked lists.
        LinkedList ls4=new LinkedList<>();
        ls4.add("Audi");
        ls4.add("one");
        ls4.add("Ferrari");
        ls4.add("five");
        ls4.add("four");
        ls4.add("two");

        LinkedList ls5=new LinkedList<>();
        for (Object z:ls) {
            ls5.add(ls4.contains(z) ? "yes": " no");
        }
        System.out.println(ls5);

         */




        /*23. Write a Java program to convert a linked list to array list
        List list=new ArrayList<>(ls);
        for (Object v:ls) {
            System.out.println(v);
        }
         */

        /*22.Write a Java program to check if a particular element exists in a linked list
        System.out.println(ls.contains("three"));
         */

      /*21. Write a Java program to retrieve but does not remove, the last element of a linked list.
           Object y=ls.peekLast();
        System.out.println("last element of list \""+ y+"\"");
        System.out.println("original element of the list \""+ls+"\"");

       */


         /* 20.Retrieve but does not remove, the first element of a linked list
        Object x=ls.peekFirst();
        System.out.println("first element to peek \""+x+"\"");
        System.out.println("original list "+ls);
          */

        /*19. Write a Java program to remove and return the first element of a linked list
        System.out.println("before remove element "+ls);
        ls.remove(0);
        System.out.println("removed element \""+ls.pop()+"\"");
        System.out.println("after remove element \""+ls+"\"");

         */


        /*  18. Write a Java program to clone an linked list to another linked list
        System.out.println("before clone "+ls);
        LinkedList ls3=new LinkedList<>();
        ls3=(LinkedList)ls.clone();
        System.out.println(" after clone linked list "+ls3);

         */


        /*17. Write a Java program to join two linked lists
        LinkedList lls=new LinkedList<>();
        lls.add("yamaha");
        lls.add("Honda");
        lls.add("Himalaya");
        ls.addAll(5,lls);
        System.out.println("after joined two linked list "+ls);
         */

        /* 16. Write a Java program to shuffle the elements in a linked list
        System.out.println("before shuffle element ls "+ ls);
        Collections.shuffle(ls);
        System.out.println("After shuffle element ls "+ ls);

         */


        /*15. Write a Java program of swap two elements in a linked list.
        System.out.println("before swaping two elements "+ls);
        Collections.swap(ls,0,4);
        System.out.println("After swaping two elements "+ls);

         */


        /*14. Write a Java program to remove all the elements from a linked list
        System.out.println("before removing list ls"+ls);
        System.out.println("after  removed all the elements from a linked list "+ls.removeAll(ls));
         */

        /*13. Write a Java program to remove first and last element from a linked list
        System.out.println("removing value first -- "+ls.removeFirst());
        System.out.println("removing value last  -- "+ls.removeLast());
        */

       /*12. Write a Java program to remove a specified element from a linked list
        System.out.println("remove specified object "+ls.remove("four"));
        System.out.println("remove specified  index "+ls.remove(2));
        */

     /* //11. Write a Java program to display the elements and their positions in a linked list.
        for (int i = 0; i < ls.size() ; i++) {
            System.out.println("elements and their positions "+i+" "+ls.get(i));
        }

      */

    /* 10.write Java program to get the first and last occurrence of the specified elements in a linked lis
        System.out.println("to get first element --> "+ls.getFirst());
        System.out.println("to get last element  --> "+ls.getLast());

     */


      /*9. write java program to insert some elements at the specified position into a linked list
        LinkedList ls2=new LinkedList<>();
        ls2.add("Right");
        ls2.add("Kite");
        ls2.add("Bright");
        System.out.println("before insert"+ls);
        ls.addAll(1,ls2);
        System.out.println("after insert"+ls);

       */

     /*   //8. Add an element to front and End of LinkedList
        System.out.println("before adding value Front and End "+ls);
        ls.offerFirst("Sweet");
        ls.offerLast("Chocolate");
        System.out.println("After adding value Front and End "+ls);
    */


      /* 7. insert values first and  last
       System.out.println("before insert first and last "+ls);
        ls.addFirst("NIKE");
        ls.addLast("BIKE");
        System.out.println("After insert first and last "+ls);
     */

       /*
       System.out.println("before insert");
        ls.add(0,"TEN");
        System.out.println("after insert"+ls);*/


       /* for (Object d:ls) {
            System.out.println(d);
        }
     */

     /*   iterator hasnext() use pani athula index value pass pana athuku munnadi value skip panidum
        Iterator itr= ls.listIterator(2);
        while (itr.hasNext()){
            System.out.println(itr.next());
        }*/


   /*   //  Write a Java program to iterate a linked list in reverse order
    //Collections.reverse(ls); this is one of method another method using
        Iterator itr1= ls.descendingIterator();
                    System.out.println("reversed value of ls " );

        while (itr1.hasNext()) {
            System.out.println( itr1.next());
        }
*/

    }
}
