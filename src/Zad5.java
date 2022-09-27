import java.util.Scanner;
public class Zad5 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Ciąg znaków");
        String slowo= keyboard.nextLine();
        int l = slowo.length();
        System.out.println("litera");
        char litera= keyboard.nextLine().charAt(0);
        int ilosc = 0;

        for(int i=0; i<l;i++)
        {
            if(slowo.charAt(i) == litera)
            {
                ilosc++;
            }
        }
        System.out.println("znak wystąpił "+ilosc+ " razy");
    }
}