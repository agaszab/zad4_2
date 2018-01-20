public class Program {


    public static void main(String[] args) {

        MathQuiz mat = new MathQuiz();

        System.out.println("Proszę o odpowiedź na pytania.Po wpisaniu odpowiedzi proszę wcisnąć enter.");

        System.out.println("");
        mat.question1();
        System.out.print("Odpowiedź na pytanie nr. 1: ");
        if (mat.wynik == true) System.out.println("prawidłowa");
        else System.out.println("błędna");

        System.out.println("");
        mat.question2();
        System.out.print("Odpowiedź na pytanie nr. 2: ");
        if (mat.wynik == true) System.out.println("prawidłowa");
        else System.out.println("błędna");

        System.out.println("");
        mat.question3();
        System.out.print("Odpowiedź na pytanie nr. 3: ");
        if (mat.wynik == true) System.out.println("prawidłowa");
        else System.out.println("błędna");

        System.out.println("");
        System.out.println("Twój wynik: " + mat.licznik + "/3.");

    }
}
