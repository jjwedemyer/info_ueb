public class Geld {
	private int euro, cent;
// Konstruktor
	public Geld(int e, int c)
	{
		euro = e;
		cent = c;
		this.über();
	}
//gettermethoden
	public int getEuro()
	{
		return this.euro;
	}

	public int getCent()
	{
		return this.cent;
	}

//übertragsberechnung
	private void über()
	{
		if (this.cent > 99)
		{
			euro += cent / 100;
			cent -= (cent / 100) * 100;
		}
	}
//Vergleiche Elemente für Gleichheit der Objekte
	public boolean equals(Geld g)
	{ 
		if ((this.euro == g.euro) && (this.cent == g.cent))
		{
			return true;
		}
		return false;
	}
//zusammenaddieren der Objekte
	public void add(Geld g)
	{ //addieren der Einzelnen beträge und dann wird übertrag normalisieren
		this.euro += g.euro;
		this.cent += g.cent;
		this.über();
	}
//toString für korrekte Ausgabe des Betrags
	public String toString()
	{
		if (cent == 0) { return this.euro + "Euro"; } //Schönheitsanfang
		if (euro == 0) { return this.cent + " Cent"; }//Schönheitsanfang
		if (cent < 10) { return this.euro + ",0" + this.cent + " Euro"; } //Fangeab damit für 1stellige Centbeträge *,0* ausgegeben wird
		return this.euro + "," + this.cent + " Euro"; //normale Ausgabe
	}
}
