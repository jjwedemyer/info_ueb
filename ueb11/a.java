class A {
public void foo (int x, int y) {
System.out.println(x+y); }
public void foo (String str) { System.out.println(str);
} }
class B extends A {
private String x = "foo";
public void foo (int x, int y) {
foo(this.x); }
public static void main (String[] args) { B objB = new B();
objB.foo(1,1);
} }
