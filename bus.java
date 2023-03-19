package com.company;

public class bus {
  private int busno;
  private boolean AC;
  private  int capacity;
  bus(int busno,boolean AC,int capacity){
      this.busno=busno;
      this.AC=AC;
      this.capacity=capacity;
  }

    public int getBusno() {
        return busno;
    }

    public void setBusno(int busno) {
        this.busno = busno;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public boolean isAC() {
      return AC;
  }

    public void setAC(boolean AC) {
        this.AC = AC;
    }
    public  void dispbusinfo(){
        System.out.println("busno"+ " "+busno+" "+"capacity"+" "+capacity+" "+"AC"+" "+AC);
    }
}
