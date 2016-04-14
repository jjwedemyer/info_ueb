// Quelle: Skript "Algorithmen" (Prof. Vornberger, Osnabrueck)

public class StudentTest {
    public static void main(String[] args) {
	Person p;
	Student s;
	p = new Person("Lisa","Lustig",11,11,1990);
	s = new Student("Fritze","Bollmann",1,8,1972,"BWL",2010);
	System.out.print(s);
	System.out.println(" hat Matrikelnr " + s.getMat_nr());

	// Ausgabe des Jahrgangs
	// (bei Person-Objekten: Jahr der Geburt)
	System.out.println(p.getVorname() + "'s Jahrgang: " + p.jahrgang());
	// (bei Student-Objekten: Immatrikulationsjahr)
	System.out.println(s.getVorname() + "'s Jahrgang: " + s.jahrgang());

	p = s;
	// jetzt verweist p auf Student-Objekt ==>
	// jetzt wird Immatrikulationsjahr ausgegeben
	System.out.println(s.getVorname() + "'s Jahrgang: " + p.jahrgang());

	// Test, ob aktuell auf Student-Objekt verwiesen wird :
	if (p instanceof Student)
	    // (ist wegen der Zuweisung oben erfolgreich)
	    // gib in diesem Fall das Studienfach aus
	    System.out.println(((Student) p).getFach());

	// da p aktuell ein Student-Objekt ist, kann seine Adresse
	// einer Student-Referenz zugewiesen werden und dann ..
	s = (Student) p;
	// .. das Studienfach ausgegeben werden (geht jetzt ohne cast)
	System.out.println(s.getFach());
    }
}
