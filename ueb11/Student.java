// Quelle: Skript "Algorithmen" (Prof. Vornberger, Osnabrueck)

public class Student extends Person {    // Student erbt direkt von Person
	// Klassenvariable:
	private static int next_mat_nr = 100000;
	private int        mat_nr;             // Matrikelnr
	private String     fach;               // Studienfach
	private int        jsb;                // Jahr des Studienbeginns

	// Konstruktor
	public Student(String vn, String nn,   // Name, Vorname
	               int t, int m, int j,    // Geburtstag (Tag, Monat, Jahr)
	               String f,               // Studienfach
	               int jsb)                // Jahr des Studienbeginns
	{
		super(vn, nn, t, m, j);              // Konstruktor der Basisklasse
		fach     = f;                        // initialisiere nun noch ..
		this.jsb = jsb;                      // .. die anderen ..
		mat_nr   = next_mat_nr++;            // .. Instanzattribute.
	}

	// ...
	public int jahrgang()                  // studiert seit welchem Jahr
	{
		return jsb;
	}

	/**
	* Returns value of next_mat_nr
	* @return
	*/
	public static int getNext_mat_nr() {
		return next_mat_nr;
	}

	/**
	* Sets new value of next_mat_nr
	* @param
	*/
	public static void setNext_mat_nr(int next_mat_nr) {
		Student.next_mat_nr = next_mat_nr;
	}

	/**
	* Returns value of mat_nr
	* @return
	*/
	public int getMat_nr() {
		return mat_nr;
	}

	/**
	* Sets new value of mat_nr
	* @param
	*/
	public void setMat_nr(int mat_nr) {
		this.mat_nr = mat_nr;
	}

	/**
	* Returns value of fach
	* @return
	*/
	public String getFach() {
		return fach;
	}

	/**
	* Sets new value of fach
	* @param
	*/
	public void setFach(String fach) {
		this.fach = fach;
	}

	/**
	* Returns value of jsb
	* @return
	*/
	public int getJsb() {
		return jsb;
	}

	/**
	* Sets new value of jsb
	* @param
	*/
	public void setJsb(int jsb) {
		this.jsb = jsb;
	}
}
