package com.company;

import java.util.List;

public class Writer implements Runnable {
    List<Integer> listInWriter;
    public Writer(List<Integer> input) {
    listInWriter=input;
    }

    @Override
    public void run() {
while (true){
    int random_number1 =  (int) (Math.random() * 10);
    listInWriter.add(random_number1);
    try {
        Thread.sleep(2500);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

}
    }
}
