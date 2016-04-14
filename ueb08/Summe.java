
class Summe {
    public static void main (String[] args) {
	long n = 40;
  long sum =1;
    long d = 365;
  for (int i = 0; i<n ; i++ ) {
    System.out.println("i "+i);
    System.out.println("d-i"+(d-i));
    sum = sum *(d - i);
    System.out.println(sum *(d - i));
  }
  System.out.println(sum);

}
}
