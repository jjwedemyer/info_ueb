import java.io.*;
import java.util.Arrays;
public class NiixPlusZwei {
    public static void main(String[] args) {
      int n = Integer.parseInt(args[0]);  //var deklaration und initialisierung
      int b = 1;
      int sum = 0;

      for (int i = 0; i < n; i++) { //loop zum addieren der zahlen
        sum = sum + b;
        b = b+2;
      };
      System.out.println(sum);  // ausgabe der summe
    }
}
