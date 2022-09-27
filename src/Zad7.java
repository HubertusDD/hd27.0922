
import java.util.Scanner;
public class Zad7 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Podaj liczbę pięter");

        double łpokoi = 0;
        double łzajętych = 0;
        int piętra= keyboard.nextInt();
        if (piętra < 1)
        {
            System.out.println("Liczba pięter musi wynosić min.1 ");
            System.exit(0);
        }
        for(; piętra!=0; piętra--)
        {

            System.out.println("Podaj ile jest łącznie pokoi na tym pietrze, oraz ile pokoi jest zajętych");
            int lpok= keyboard.nextInt();
            int lzaj= keyboard.nextInt();
            if (lpok < 10)
            {
                System.out.println("Liczba pokoi musi wynosić min.10 ");
                System.exit(0);
            }
            łpokoi = łpokoi + lpok;
            łzajętych= łzajętych + lzaj;
        }
        double wolne= łpokoi-łzajętych;
        double obłożenie = łzajętych/łpokoi;
        obłożenie = Math.round(obłożenie * 100.0) / 100.0;
        System.out.println("Liczba pokoi: "+łpokoi);
        System.out.println("Liczba pokojów zajętych: "+łzajętych);
        System.out.println("Liczba pokojów wolnych: "+wolne);
        System.out.println("Obłożenie: "+obłożenie);
    }
}