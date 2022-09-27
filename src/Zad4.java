import java.util.Scanner;
public class Zad4 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Liczba dni");

        int ldni= keyboard.nextInt();
        int  i = 1;
        double  zarobki= 0;
        if (ldni<1)
            System.out.println( "Wartości nie powinny być mniejsze od 1 " );

        else {

            for (double wynik = 0.01; i != ldni+1; i++)
            {

                zarobki = zarobki + wynik;


                System.out.println(i + " " + wynik);
                wynik = wynik * 2;
            }
            System.out.printf("Ostateczne zarobki %.2f zł \n", zarobki);
        }
    }
}