public class GeldTest {
	public static void main(String[] args)
	{ //erstelle zwei geld Objekte
		Geld test1 = new Geld(random(10), random(1000));
		Geld test2 = new Geld(random(10), random(100));
//Ausgaben mit Test aller methoden in der class Geld
		System.out.println("test1.getEuro: " + test1.getEuro());
		System.out.println("test1.getCent: " + test1.getCent());
		System.out.println();
		System.out.println("test2.getEuro: " + test2.getEuro());
		System.out.println("test2.getCent: " + test2.getCent());
		System.out.println();
		System.out.println("Printing test1: " + test1);
		System.out.println("Printing test2: " + test2);
		System.out.println();
		Geld added = test1;
		added.add(test2);
		System.out.println("Testing add(Geld g):" + added);
		System.out.println("Testing equals: " + test1.equals(test2));
long i=0;
    do {
      test2 = new Geld(random(10), random(100));
      i++;
    } while (test1.equals(test2)==false);
    System.out.println("War mal gleich! nach "+i+" Durchläufen");
	}

	private static int random(int factor) //randomised inoput generator
	{
		return (int)(factor * Math.random());
	}
}
