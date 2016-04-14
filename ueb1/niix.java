import java.io.*;
import java.util.Arrays;
public class Niix {
  public static void main( String[] args){
        int n = Integer.parseInt(args[0]);
        int b = 1;
        String out = "Ungrade Zahlen: 1";
        int[] zahlen;
        zahlen = new int[n];
        int sum = 0;

        for (int i = 0; i < n; i++) {                       //das zählen an sich und das hinzufügen zum array
                sum = sum + b;
                b = b+2;
                zahlen[i] = b;


        };
        for (int l = 0; l < zahlen.length; l++) {   //array element werden zu strings und dann in einen string geschrieben
              out = out + "," + zahlen[l];
        };
        System.out.println(out);
        System.out.println("Jetzt die Summe:" + sum );
    }
    // public static void main(String[] args) {
    //   int n = Integer.parseInt(args[0]);
    //   int b = 1;
    //   int sum = 0;
    //
    //   for (int i = 0; i < n; i++) {
    //     sum = sum + b;
    //     b = b+2;
    //   };
    //   System.out.println(sum);
    // }
}
