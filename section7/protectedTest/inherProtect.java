package section7.protectedTest;
import section7.protectedTest2.*;

public class inherProtect {
    public static void main(String[] args){
        B Test1 =  new B();
        Test1.PrintA(); // 같은 패키지, 상위 메소드 protected 속성, =호출됨
        Test1.nVar1 = 5; // 같은 패키지, 상위 멤버 변수 protected 속성, =호출됨
        Test1.PrintB(); 
        System.out.println(Test1.nVar1);

        D Test2 = new D();
        Test2.PrintD(); 
        // Test2.nVar1 = 30; // 다른 패키지, 외부에서 protected 속성 사용, =error
        // Test2.PrintC(); // 다른 패키지, 외부에서 protected 속성 사용, =error
    }
}

class A {
    protected int nVar1 = 10;

    protected void PrintA() {
        System.out.println("A class: " + nVar1);
    }
}

class B extends A { // B가 A에게 상속 받음, 같은 패키지 안
    public void PrintB() {
        System.out.println("B class: " + nVar1); // 상위 클래스의 protected 속성, =호출됨
    }
}

class D extends C { // D가 C에게 상속 받음, 다른 패키지 안
    public void PrintD() {
        System.out.println("D class" + nVar1); // 다른 패키지, 상위 클래스의 protected 속성, =호출됨
    }
}
