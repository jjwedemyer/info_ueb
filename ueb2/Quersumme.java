public class Quersumme {
  public static void main(String[] args) {
    int x = Integer.parseInt(args[0]); //var für die eingabe
    int iqsout;
    int qsout;
    qsout = quersumme(x);
    System.out.println("QS = " + qsout); // Ausgabe
    iqsout = iterierteqs(x);
    System.out.println("IQS " + iqsout);
  };

  public static int iterierteqs(int zahl) {    //impelmentation der Iterierten Quersumme
    int iqs = zahl;
    while (0 != zahl) {
      iqs = quersumme(iqs);
      zahl = zahl / 10;
    }
    return iqs;
  };
  public static int quersumme(int x) {
    int qs = 0;
    while (0 != x) {                  // loop für das summierne der quersumme
        qs = qs + (x % 10);
        x = x / 10;
      };
    return qs;
  };
}
