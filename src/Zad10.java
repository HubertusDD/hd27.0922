
import java.util.Scanner;
public class Zad10 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int odp = 0;
        int najm =0;
        int najw=0;
        System.out.println("Aby zakończyć program wpisz ''-99''");
        System.out.println("Podaj liczbę");
        if(odp!=-99)
        {
            odp = keyboard.nextInt();
            najm = odp;
            najw = odp;
        }
        else
            System.exit(0);
    while(odp!=-99)
    {
        System.out.println("Podaj liczbę");
        odp= keyboard.nextInt();
        if(odp!=-99)
        {
            if (odp < najm)
                najm = odp;
            if (odp > najw)
                najw = odp;
        }

    }
        System.out.println("Największa: "+ najw);
        System.out.println("Najmniejsza: "+ najm);


    }
}