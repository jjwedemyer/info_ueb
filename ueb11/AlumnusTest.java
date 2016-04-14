class AlumnusTest extends StudentTest {
  public static void main(String[] nixx) {
    Alumnus test1 = new Alumnus("Fritze","Bollmann",1,8,1972,"BWL",2010,2015);
    Alumnus test2 = new Alumnus(test1);

    System.out.println(test1.dauer()+" "+test1.getJsb()+" "+ test1.getAbschlussjahr()+" "+test1.getFach());
    System.out.println(test2.dauer()+" "+test2.getJsb()+" "+ test2.getAbschlussjahr()+" "+test2.getFach());
System.out.println();
System.out.println(test1.jahrgang(1)+" "+ test1.jahrgang(2)+ " "+ test1.jahrgang(0));
  }
public void foo(){return;};
}
