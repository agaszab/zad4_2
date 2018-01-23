public class Program {


    public static void main(String[] args) {


        boolean odpowiedz=false;

        MathQuiz mat = new MathQuiz();

        System.out.println("Proszę o odpowiedź na pytania.Po wpisaniu odpowiedzi proszę wcisnąć enter.");

        odpowiedz = mat.question1();
        System.out.print("Odpowiedź na pytanie nr. 1: ");
        if (odpowiedz) System.out.println("prawidłowa");
        else System.out.println("błędna");

        System.out.println();
        odpowiedz = mat.question2();
        System.out.print("Odpowiedź na pytanie nr. 2: ");
        if (odpowiedz) System.out.println("prawidłowa");
        else System.out.println("błędna");

        System.out.println();
        odpowiedz = mat.question3();
        System.out.print("Odpowiedź na pytanie nr. 3: ");
        if (odpowiedz) System.out.println("prawidłowa");
        else System.out.println("błędna");

        System.out.println();
        System.out.println("Twój wynik: " + mat.getLicznik() + "/3.");

    }
}
