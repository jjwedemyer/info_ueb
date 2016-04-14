/* IEEE 754 Implementation im Verlauf der Info I Übung by Jakob Wedemeyer*/
class StringToFloat {
public static void main( String args[] ) {
//Triviashit anfang
  String str = args [0];    //Einlesen des Strings aus den CLI-Argumenten.

// Hier wird überprüft ob der gelesene String die Länge 32 hat, andernfalls wird eine entsprechende Fehlermeldung ausgegeben.
  if (str.length() != 32) {
    if (str.length() < 32) {
      System.out.println("Dein Input hat zu wenige Stellen! Gif me "+ (32-str.length())+ " moar...");
     }
    else {
    	System.out.println("Dein Input hat zu viele Stellen! This is " + (str.length()-32)+ " too much");
    }
    return;
  }

// Überprüfung der einzelnen Stellenwerte nach 0 und 1, falls nicht gegeben, wirft der Code eine Fehlermeldung. Dann gibt der Code noch die ganze Zahl aus.
  for (int i = 0; i < str.length(); i++) {
  	if (str.charAt(i) != '1' && str.charAt(i) != '0') {
			System.out.println("Du N00B! Ich kann damit nichts anfangen! Gib mir nur 0 oder 1. Fehler ist an Position: "+ i );
    }
    //System.out.print(str.charAt(i));
  }
        //System.out.println();
        bintofloat(str);
       /* String strf = str + "b";
        float hex = Float.parseFloat(str);
        System.out.println(Float.toHexString(hex));*/
//Triviashit ende
}


public static void bintofloat (String bin) {
//Ich arbeite ganz unkonventionell von vorne nach hinten, nicht wie andere von hinten nach vorne!
//initialisierung von variablen...
  int s = 0, e = 0, m = 0;
  float zweim = 0.0f, zweismalm = 0.0f;
  String exponent = "", mantisse = "";
  double zweihoch;

//Sign bit auslesen
  /*if (bin.charAt(0) == '0') { //S=(s==0) ? 1 : -1;
  	s = 1;
  }
  else {
  	s = -1;
  }*/
  s=(bin.charAt(0)== '0') ? 1:-1;
  System.out.println("S= "+s);

//Exponenten bestimmen
  for(int i = 1; i <=8; i++) {
  	int zählens = 0;
  	zählens= Integer.parseInt(Character.toString(bin.charAt(i)));
  	e = e*2 + zählens;
  }
  System.out.println("E= "+e);

// Mantissebestimmen mittels Hornerschema
  for(int j=9; j<32; j++) {
  	int zählens = 0;
  	zählens= Integer.parseInt(Character.toString(bin.charAt(j)));
  	m = m*2 + zählens;
  }
  System.out.println("M= "+m);

//Zusammenführen der Teile von zweim: m * 2 ^ -23
  zweim = (float) m * Float.MIN_VALUE;
  System.out.println("m * 2^-23 = "+zweim);

//Überprüfen auf NaN,  +-0, NEGATIVE_INFINITY, POSITVE_INFINITY

	if ( s == -1 && e == 255 && m == 0 ) {
		System.out.println("NEGATIVE_INFINITY");
	}
	else if ( s == 1 && e == 255 && m == 0 ) {
		System.out.println("POSITIVE_INFINITY");
	}
	else if ( e == 255 && m != 0 ) {
		System.out.println("NaN");
	}
	else if ( s == 1 && e == 0 && m == 0 ) {
		System.out.println("+0");
	}
	else if ( s == -1 && e == 0 && m == 0 ) {
		System.out.println("-0");
	}
  //Zusammenführen der Teile von s*m*2^e-150
  else {
    if(e == 0 && m > 0) {
      zweihoch = Math.pow(2, 1-127) * s * m * Float.MIN_VALUE;
      System.out.println("Denormalisiertes : s*m*2^" + (float)zweihoch);
    }
    else{
      zweihoch = Math.pow(2.00, ((double)e -150));
      zweismalm = (float) s * (float) m * (float) zweihoch;
      System.out.println("s*m*2^e-150 = "+zweismalm);
    }
  }
}
}
