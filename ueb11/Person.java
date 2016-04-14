// Quelle: Skript "Algorithmen" (Prof. Vornberger, Osnabrueck)

import java.util.GregorianCalendar;
public class Person {
    private String vorname, nachname;
    private Datum geb_datum;
    public Person (String vn, String nn,  // Name
		   int t, int m, int j) { // Geburtsdatum
	vorname = vn; nachname = nn;
	geb_datum = new Datum(t,m,j); // initialisiere Geburtsdatum
    }
    // anwendbare Methoden
    /*
      ...
    */

    public int jahrgang () {    // Methode
	return geb_datum.jahr;  // liefert Geburtsjahrgang
    }
    public int alter(){ // Methode
	int jetzt = new GregorianCalendar().get(GregorianCalendar.YEAR);
	return jetzt - geb_datum.jahr; // liefert das Lebensalter
    }
    public String toString() { // Methode
	return vorname + " " + nachname; // liefert Vor- und Nachname
    }

    /*
      ...
    */

    public static void main(String[] args) { // Test-Unit
	Person p = new Person("Georg Christoph", "Lichtenberg", 1, 7, 1742);
	System.out.println(p);
	System.out.println(p.geb_datum.jahr); // <---
    }

	/**
	* Returns value of vorname
	* @return
	*/
	public String getVorname() {
		return vorname;
	}

	/**
	* Sets new value of vorname
	* @param
	*/
	public void setVorname(String vorname) {
		this.vorname = vorname;
	}
  /**
  * Returns value of vorname
  * @return
  */
  public String getNachname() {
    return nachname;
  }

  /**
  * Sets new value of vorname
  * @param
  */
  public void setNachname(String nachname) {
    this.nachname = nachname;
  }

	/**
	* Returns value of geb_datum
	* @return
	*/
	public Datum getGeb_datum() {
		return geb_datum;
	}

	/**
	* Sets new value of geb_datum
	* @param
	*/
	public void setGeb_datum(Datum geb_datum) {
		this.geb_datum = geb_datum;
	}

  public int getTag(){return geb_datum.tag;}
  public int getMonat(){return geb_datum.monat;}
  public int getJahr(){return geb_datum.jahr;}

}
