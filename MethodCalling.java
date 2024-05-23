class MethodCalling{

/**
 *
 *@author Anuhya B
 *
*/

public static void main(String args[]){

// calling static method from static method
staticMethod();

// calling non static method from static method
MethodCalling o1 = new MethodCalling();
o1.nonStaticMethod1();
o1.nonStaticMethod2();

}

public void nonStaticMethod1(){
System.out.println("In non-static Method1");
// calling non-static method from non-static method
nonStaticMethod2();
}

public void nonStaticMethod2(){
System.out.println("In non-static Method2");
// calling static method from a non-static method
staticMethod();
}

public static void staticMethod(){
System.out.println("Static Method1");
}
} 