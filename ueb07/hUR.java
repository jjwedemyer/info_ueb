class hUR {
public static void hornerUmkehrRekursiv(int z, int q) {
  if (z==0) {
      System.out.println("Zeilenumbruch");
      return;
  }
  else {
    System.out.println(z%q);
    System.out.println("Z ="+z+"/"+q);
    z= z/q;
    System.out.println("hornerUmkehrRekursiv("+z+","+q+")");
    hornerUmkehrRekursiv(z,q);
  }
}
public static void main(String[] args) {
  System.out.println("Methodenaufruf");
  hornerUmkehrRekursiv(13,2);
}
}
