import java.util.Scanner;
public class Zad1 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Podaj cyfrę niezerową całkowitą");

        int wynik=0;

        for (int i= keyboard.nextInt();i!=0; i--) {

            wynik = wynik + i;

        }
        System.out.println("wynik to " + wynik);
    }
}
