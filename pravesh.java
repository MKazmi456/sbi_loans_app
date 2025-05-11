abstract class A{

abstract void m1();
static{
System.out.println("Static in A");

}

{

System.out.println("Instance in A");

}

}

class B extends A{

static int a;
int b;
static{
System.out.println("Static in B");

}

public B(int a, int b){

//this.a=a;
//this.b=b;



}

void m1(){
System.out.println("m1 in B");
System.out.println(a);
System.out.println(b);
}

public static void main(String[] args){

A a1 = new B(10,20);
a1.m1();

}

}