package com.company;

import java.time.LocalDateTime;
import java.util.List;

public class Reader implements Runnable{
    List<Integer> listInReader;
    public Reader(List<Integer> input) {
    listInReader=input;
    }
    @Override
    public void run() {
        while (true){
            if(listInReader.isEmpty()){
                LocalDateTime loc=LocalDateTime.now();
                System.out.println("The list is empty "+loc );
            }
            else {
                System.out.println(listInReader);
                listInReader.clear();
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
       }


    }
}
