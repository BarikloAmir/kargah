package com.company;

public class Main {

    public static void main(String[] args) {
	ClockDisplay clock = new ClockDisplay(10,50,5);
	for(int i=0; i<100 ; i++){
        System.out.println(clock.getTime());
        clock.timeTick();
        }
    }
}
