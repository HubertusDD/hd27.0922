
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
public class Zad3 {
    public static void main(String[] args) throws IOException  {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Podaj nazwę pliku");



        String nazwaPliku = keyboard.nextLine();
        FileWriter fw = new FileWriter(nazwaPliku,true);
        PrintWriter pw = new PrintWriter(fw);
        System.out.println("Podaj prędkość w km/h, a następnie liczbę godzin");

        int v= keyboard.nextInt();
        int t= keyboard.nextInt();

        if (v<1 || t<1)
            System.out.println( "Wartości nie powinny być zerowe " );

        else
        {
            int tdr= 1;
            for (int s ;tdr!=t+1; tdr++) {
                s = v * tdr;
                System.out.println();
                pw.println(tdr + " " + s);


            }
            pw.close();
        }

    }
}