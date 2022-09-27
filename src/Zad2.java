import java.util.Scanner;
public class Zad2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

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
                System.out.println(tdr + " " + s);
            }

        }
    }
}