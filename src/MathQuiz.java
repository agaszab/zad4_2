import java.util.Scanner;

public class MathQuiz {

    boolean wynik;
    int odpowiedz;
    int licznik = 0;


    Scanner scan = new Scanner(System.in);


    boolean question1() {               // pyta, jaki jest wynik mnożenia 3*5

        System.out.println("Jaki jest wynik mnożenia 3 i 5?");
        odpowiedz = scan.nextInt();
        if (odpowiedz == 15) {
            licznik = licznik + 1;
            wynik = true;
        } else {
            wynik = false;
        }
        return wynik;
    }


    boolean question2() {               // pyta jakie jest pole kwadratu o boku 12

        System.out.println("Jakie jest pole kwadratu o boku 12?");
        odpowiedz = scan.nextInt();
        if (odpowiedz == 144) {
            licznik = licznik + 1;
            wynik = true;
        } else {
            wynik = false;
        }
        return wynik;
    }


    boolean question3() {               // pyta jaki jest pierwiastek kwadratowy z liczby 15129

        System.out.println("Jaki jest pierwiastek kwadratowy z liczmy 15129?");
        odpowiedz = scan.nextInt();
        if (odpowiedz == 123) {
            licznik = licznik + 1;
            wynik = true;
        } else {
            wynik = false;
        }
        return wynik;

    }

}
