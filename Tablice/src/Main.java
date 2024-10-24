//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the g

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] tab1 = {2,4,5};
        int[] tab2 = {21,43,11};

        int[] tab3 = new int[4];
        tab3[0] =10;
        tab3[1] = 4;
        tab3[2] = 2;
        tab3[3] =56;

        Person [] person = new Person[5];

        person[0] = new Person("Kamil","Kowalski");
        person[1] = new Person("Dawid","Podraza");
        person[2] = new Person("Grażyna","Kotra");


        double[][] tablica = new double[3][3];

        tablica[0][0] = 1.0;
        tablica[0][1] = 1.5;
        tablica[0][2] = 2.0;
        tablica[1][0] = 1.5;
        tablica[1][1] = 2.0;
        tablica[1][2] = 2.5;
        tablica[2][0] = 2.0;
        tablica[2][1] = 2.5;
        tablica[2][2] = 3.0;


        double suma1 = tablica[0][0]*tablica[1][1]*tablica[2][2];
        double suma2 = tablica[1][0]*tablica[1][1]*tablica[1][2];
        double suma3 = tablica[2][0]+tablica[2][1]+tablica[2][2];

        System.out.println(suma1);
        System.out.println(suma2);
        System.out.println(suma3);


    }
}