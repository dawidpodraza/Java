import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // dopracowac zeby stos sie faktyczie pomniejszał podczas pop (pobieranie elementow ze stosu)
        // zmodyfikowac metode peek pod to wszystko

        Stos stos = new Stos();
        stos.push(2);
        stos.push(4);
        stos.push(5);
        stos.push(6);
        stos.push(7);
        stos.push(28);
        stos.push(26);
        stos.push(21);

        System.out.println(stos.toString());

        System.out.println(stos.pop());
        System.out.println(stos.pop());
        System.out.println(stos.pop());
        System.out.println(stos.pop());
        System.out.println(stos.pop());
        System.out.println(stos.pop());



        System.out.println("Stos peek: "+stos.peek());




    }

}
