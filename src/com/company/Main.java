package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> input = new ArrayList<>();
        input.add(1);
        input.add(2);
        input.add(3);
        Runnable first = new Reader(input);
        Runnable second = new Writer(input);
        Thread thread1 = new Thread(first);
        Thread thread2 = new Thread(second);
        thread1.start();
        thread2.start();
    }
}
