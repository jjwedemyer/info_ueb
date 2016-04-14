class Alumnus extends Student {
	private int abschlussjahr;
	public Alumnus(String vn, String nn, // Name, Vorname
	               int t, int m, int j,  // Geburtstag (Tag, Monat, Jahr)
	               String f,             // Studienfach
	               int jsb,
	               int abschlussjahr)
	{
		super(vn, nn, t, m, j, f, jsb);
		this.abschlussjahr = abschlussjahr;
	}

	public Alumnus(Alumnus ex)
	{
		super(ex.getVorname(),ex.getNachname(),
					ex.getTag(),ex.getMonat(),ex.jahrgang(),
					ex.getFach(), ex.getJsb());
		this.abschlussjahr = ex.abschlussjahr;
	}

	public final static int GEBURT = 0;
	public final static int BEGINN = 1;
	public final static int ABSCHLUSS = 2;


	/**
	 * Returns value of abschlussjahr
	 * @return
	 */
	public int getAbschlussjahr()
	{
		return this.abschlussjahr;
	}

	/**
	 * Sets new value of abschlussjahr
	 * @param
	 */
	public void setAbschlussjahr(int abschlussjahr)
	{
		this.abschlussjahr = abschlussjahr;
	}

	public int jahrgang(int param) //integer parameter
	{
    switch (param) {
      case GEBURT: return this.getJahr();
      case BEGINN: return this.getJsb();
      case ABSCHLUSS: return this.abschlussjahr;
      default: throw new RuntimeException ("Falscher Parameter: nimm 0,1 oder 2");
    }
	}

	public int dauer()
	{
		return this.abschlussjahr - this.getJsb();
	}
}
