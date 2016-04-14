/* shit made by Jakob Wedemeyer */
public class DrawFractal {
	public static void main(String[] args)
	{
		int count = StdIn.readInt();

		StdIn.readLine();
		char[] str = new char[count];
		for (int i = 0; i < count; i++)
		{
			str[i] = StdIn.readChar();
		}
		StdIn.readLine();
		for (int i = 0; i < count ; i++ ) {
			System.out.print(str[i]);
		}
		System.out.println();
		draw(count, str); // Methodenaufruf
	}

	public static void draw(char[] str) // Diese Methode macht die Arbeit der Aufgabenstellung
	{
		double dir_x = 1.0, dir_y = 0.0, xo = 0, yo = 0; //Richtungsvektor und xo/yo ist Ortsvektor
		double   axismax_x = 0, axismax_y = 0;	// Vier Vars für die Größe des Canvas
		double   axismin_x = 0, axismin_y = 0;
		double swap; //Variable zum Tauschen von werten

		for (char c : str) //Sim schleife
		{
			switch(c){ //Unterscheidung zwischen den Fällen
				case 'F':
					xo = xo + dir_x; //Erhöhung der Werte
					yo = yo + dir_y;
					axismax_x = (axismax_x < xo) ? xo : axismax_x;		//simulationsanteil um die Größe des canvas zu bestimmen
					axismin_x = (axismin_x > xo) ? xo : axismin_x;
					axismax_y = (axismax_y < yo) ? yo : axismax_y;
					axismin_y = (axismin_y > yo) ? yo : axismin_y;
					break;

				case 'R':
				swap = -dir_x;    //Rechtsdrehung um 90° durch vertauschen der Werte des Richtungsvektors und negation des Y-wertes
				dir_x    = dir_y;
				dir_y    = swap;
				break;

			case 'L':
				swap = dir_x;  //Linksdrehung um 90° durch vertauschen der Werte des Richtungsvektors und negation des x-wertes
				dir_x    = -dir_y;
				dir_y    = swap;
				break;

		}
	}

		//Jetzt wird gezeichnet
		System.out.println(axismin_x +"+"+axismax_x);
		System.out.println(axismin_y +"+"+axismax_y);
		StdDraw.setXscale(axismin_x-1.0, axismax_x+1.0);  //Größe des Canvas setzen
		StdDraw.setYscale(axismin_y-1.0, axismax_y+1.0);

		xo = 0.0; yo = 0.0; //zurück zum ursprung
		dir_x = 1.0; dir_y = 0.0; //Auf Anfangswerte setzen
		double x2 = 0.0, y2 = 0.0; // Variablen für zielpunkt der line
		StdDraw.point(0.0,0.0); //Ursprung einzeichnen
		StdDraw.text(0.0,0.1, "0,0");

		for (char c : str) //Zeichenschleife die für alle werte die Operationen von oben noch mal ausführt
		{
			System.out.println(dir_x+","+dir_y); //debug ausgabe
			switch (c) {
				case 'F':
					x2 = xo + dir_x; y2 = yo + dir_y;
					System.out.println("F :x_1= "+xo+" y_1= "+yo+" x_2= "+(xo+dir_x)+" y_2= "+(yo+dir_y)); //
					StdDraw.point(xo,yo);
					StdDraw.point(xo+dir_x,yo+dir_y);
					StdDraw.line(xo,yo,xo+dir_x,yo+dir_y);
					xo = x2; yo = y2;
					break;

					case 'R':
					System.out.println("R");
					swap = -dir_x;
					dir_x    = dir_y;
					dir_y    = swap;
					break;

					case 'L':
					System.out.println("L");
						swap = dir_x;
						dir_x    = -dir_y;
						dir_y    = swap;
						break;
			}
		}
	}
}
