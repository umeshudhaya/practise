package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        try {
            int age=150;
            if (age<0||age>=100)
                throw new Exception();
            if (age>=18 )
            {
                System.out.println("eligible to vote");
            }
            else {
                System.out.println("not eligible to vote");
            }
        }catch (Exception e)
        {
            System.out.println("some problem ,contact udhaya");
        }
    }
}
