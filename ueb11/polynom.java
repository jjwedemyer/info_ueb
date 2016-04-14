class Polynom {
private static long pow (long x, long y) {
  long ret = x;
  for (int i = 0; i<y ;i++ ) {
    ret *= x;
  }
  return ret;
}
private static long pow (int x, int y) {
  int ret = x;
  for (int i = 0; i<y ;i++ ) {
    ret *= x;
  }
  return ret;
}
public static void main(String[] args) {
  long x = Long.parseLong(args[0]);
  long out = 2*pow(x,8)+11*pow(x,6)+8*pow(x,5)+12*pow(x,2);
  System.out.println(out);
  System.out.println(pow(7,2));
}
}
