interface A{

protected void m1(){

System.out.println(" default m1 in A");

}

}

class B implements A{

public void m1(){

System.out.println("Default m1 in B");

}

}

class JTC{

public static void main(String [] args){

A a1 = new B();
a1.m1();

}

}