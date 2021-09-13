package com.company;

import java.util.List;
import java.util.Random;

public class Writer implements Runnable {
    Random random = new Random();
    List<Integer> listInWriter;

    public Writer(List<Integer> input) {
        listInWriter = input;
    }

    @Override
    public void run() {
        while (true) {
            int random_number1 = random.nextInt();
            listInWriter.add(random_number1);
            try {
                Thread.sleep(2500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
