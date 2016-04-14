// Nach: Vornberger (Osnabrueck), Skript "Algorithmen" 
public class Datum {
    /*
      ...
    */
    int tag; int monat; int jahr; 
    public Datum (int t, int m, int j){ // Konstruktor mit 3 Parametern
	tag = t; monat = m; jahr = j; 
    }
    public Datum (int j){ // Konstruktor mit einem Parameter
	tag = 1; monat = 1; jahr = j;
    }
    // Alternative: 
    /*
    public Datum (int j){ 
	this(1, 1, j); // initialisiere 1.1. Jahr   
    }
    */
    public Datum () { // parameterloser Konstruktor
	this( 1, 1, 1);
	// tag = 1; monat = 1; jahr = 1; // ist auch moeglich
    }
    public String toString(){ // Methode ohne Parameter
	return tag + "." + monat + "." + jahr; // liefert Datum als String
    }
    /*
      ...
    */
}
