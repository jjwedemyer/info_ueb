import java.util.Iterator;
public class Drache {
	Drache()
	{
	}

	public static void usage()
	{
		System.err.println("USAGE (0 < n < 20): Dragon <n>"); //ErrorPrint
	}

	public static String umkehr(String kette) //funktion zum umkehren der Zeichenkette
	{
		int l = kette.length();
		char[] array = new char[l];
		char[] umgekehrt = new char[l];

		for (int i = 0; i < l; i++)
		{
		 array[i] = kette.charAt(i);
		}

		for (int i = 0; i < l; i++)
		{
			char c = array[l - i - 1];
			switch (c)
			{
			case 'F':
				umgekehrt[i] = 'F';
				break;

			case 'R':
				umgekehrt[i] = 'L';
				break;

			case 'L':
				umgekehrt[i] = 'R';
				break;
			}
		}
		String umge = new String(umgekehrt);
		return umge;
	}

public static char[] dragoncurve(int ordnung)
	{
		String kette = "F";
		for (int i = 0; i < ordnung; i++) //Generation der Drachenkurve
		{
			String tmp = umkehr(kette);
			kette = kette+"R"+tmp;
		}

		int l = kette.length(); //conversion in einen charArray
		char[] out    = new char[l];
		out[0]    = 'F';
		int i = 0;

		out = kette.toCharArray();
		return out; //Rückgabe statement
}

public static void main(String[] args)
{
	int ordnung = 0; 		// Deklaration mit Initialisierung

	try{
		ordnung = Integer.parseInt(args[0]); // Abfangen der Exception über einen Try/Catch Block
	}
	catch (NumberFormatException error) { //Exception wiedergeben
		Drache.usage();
		return;
	}
	if ((ordnung > 20) && (ordnung < 0)) // Werte kleiner 0 und größer 20 werden auch zurück gewiesen
	{
		Drache.usage();
		return;
	}
	int laenge    = (int)Math.pow(2.0, ordnung + 1) - 1; // Berechnen der Länge des Arrays mit gegebener Formel
	char[] out = new char[laenge]; // Deklaration/Initialisierung des charArrays
	out = dragoncurve(ordnung); //zuweisung und Methodenaufruf

	System.out.println(laenge);
	for (int i = 0; i < laenge; i++)
	{
		System.out.print(out[i]); //Ausgabe in einem BLock
	}
	System.out.println();
}
}
