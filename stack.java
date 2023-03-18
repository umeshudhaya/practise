package com.company.stackdemo;

public class stack {
   int v[] = new int[18];
   int top;
    stack(){
        top=-1;
    }
    void push(int no){
        if(top==17){
            System.out.println("the stack is full");
        }
        else
             top++;
    }
  int  push(){
        return v[top--];
    }

}
