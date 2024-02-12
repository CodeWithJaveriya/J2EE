package com.xworkz.airpods;

import java.util.ArrayList;
import java.util.Iterator;

public class Executor {

    public static void main(String[] args) {
        int av[] = new int[20];
        for(int i =0; i <= 16; i++){
            av[i] = i/3;
            av[i]++;
            System.out.println(av[i]+ " ");
            i++;
        }

    }
}
