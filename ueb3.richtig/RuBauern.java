public class RuBauern {
  public static void main(String[] args) {
    
    int a = Integer.parseInt(args[0]); // aufnahme der Faktoren
    int b = Integer.parseInt(args[1]);
	System.out.println("Das Ergebnis der Multiplikation ist: " +ruba(a,b)); 	// ausgabe und methodcall
	//System.out.println("Normal " + (a*b));
	
    
  }

	public static int ruba(int x, int y) {
	//initialisiere		
	int p = 0;
	boolean v;		//Vorzeichen überprüfung.
    if (x< 0^y<0){v = true;}
    else {v = false;}
    // Iteriere
    while(y != 0) {
      if (y % 2 != 0) {
        p += x; 
		}
        x += x;
        y = y/2;
    }
    //finalisiere
	if (v == true){
		p = -p;
	}
	return p;
	}
}
