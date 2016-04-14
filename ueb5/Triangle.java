/**
 *
 *
 * nach [Sedgewick/Wayne]
 */
public class Triangle {
public static void main(String[] args) {
        //
        double s = Double.parseDouble(args[0]); // Seitenl.
        double h = hoehe(s);              // Hoehe
        StdDraw.line(0.0, 0.0,   s, 0.0);// Basis
        StdDraw.line(0.0, 0.0, s/2,   h);// linke Seite
        StdDraw.line(  s, 0.0, s/2,   h);// rechte Seite
        StdDraw.setPenRadius(0.010);
        StdDraw.point(s/2, h/3.0);  // Schwerpunkt
}
private static double hoehe(double s) {
        // Hoehe d. gleichseitigen Dreiecks mit Seite s
        return s * Math.sqrt(3.0)/2.0; // nach Pythagoras
}
}
