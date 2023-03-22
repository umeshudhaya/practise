package com.company;

import java.util.Random;

public class Main {
    static   char[] otp(int len){
        System.out.println("Generating the OTP using  Random() :");
        System.out.print("Your OTP is.....:   ");
        String num="0123456789";
        Random ran=new Random();
        char otp[]= new char[len];
        for (int i = 0; i <len ; i++) {
            otp[i]=num.charAt(ran.nextInt(num.length()));
        }
        return otp;
    }
    public static void main(String[] args) {
	// write your code here
        int length=6;
        System.out.println(otp(length));
    }
}
