import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
public class Zad6 {
    public static void main(String[] args) throws IOException {
        Scanner keyboard = new Scanner(System.in);

        File myObj = new File("adzad6.txt");
//        if (myObj.exists()) {
//            System.out.println("File name: " + myObj.getName());
//            System.out.println("Absolute path: " + myObj.getAbsolutePath());
//            System.out.println("Writeable: " + myObj.canWrite());
//            System.out.println("Readable: " + myObj.canRead());
//            System.out.println("File size in bytes " + myObj.length());
//        } else {
//            System.out.println("The file does not exist.");
//        }

        Scanner myReader = new Scanner(myObj);

        System.out.println("litera");
        char litera= keyboard.nextLine().charAt(0);
        int ilosc = 0;


        while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            long l = data.length();
            System.out.println(data);
            for(int i=0; i<l;i++)
            {
                if(data.charAt(i) == litera)
                {
                    ilosc++;
                }
            }

        }



        System.out.println("znak wystąpił "+ilosc+ " razy");
    }
}


//    import java.io.File;
//   import java.util.Scanner;
//public class Zad6 {
//    public static void main(String[] args) throws IOException{
//        Scanner keyboard = new Scanner(System.in);
//
//        File mojPlik = new File ("adzad6.txt");
//
//
//        Scanner fileScanner = new Scanner (mojPlik);
//
//        System.out.println("Ciąg znaków");
//        String slowo= fileScanner.nextLine();
//        int l = slowo.length();
//        System.out.println("litera");
//        char litera= keyboard.nextLine().charAt(0);
//        int ilosc = 0;
//
//        for(int i=0; i<l;i++)
//        {
//            if(slowo.charAt(i) == litera)
//            {
//                ilosc++;
//            }
//        }
//        System.out.println("znak wystąpił "+ilosc+ " razy");
//    }
//}