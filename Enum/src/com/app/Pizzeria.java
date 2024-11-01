package com.app;

import com.pizza.Pizza;

import java.util.Scanner;

public class Pizzeria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dostępne pizze :");
        Pizza[] pizza = Pizza.values();
        for (Pizza item : pizza) {
            System.out.println(item.ordinal()+" "+item.name() + " " + item.getDescription());
        }
        System.out.println("Wybierz pizze: ");
        int choice = scanner.nextInt();

        switch(choice){
            case 0 -> System.out.println("Wybrano "+ Pizza.MARGHERITA.name()+" "+Pizza.MARGHERITA.getDescription());
            case 1 -> System.out.println("Wybrano "+Pizza.CAPRICIOZA.name()+" "+Pizza.CAPRICIOZA.getDescription());
            case 2 -> System.out.println("Wybrano "+Pizza.PROSCIUTTO.name()+" "+Pizza.PROSCIUTTO.getDescription());
        }

    }
}
