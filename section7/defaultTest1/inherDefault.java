package section7.defaultTest1;
import section7.defaultTest2.*;

public class inherDefault {
    public static void main(String[] args){
        B Test1 = new B();
        Test1.nVar1 = 20; // 같은 패키지, 상위 클래스 default 속성, =호출됨
        Test1.PrintB();
    }
}

class A {
    int nVar1 = 10; // 접근 지정자 작성하지 않으면 자동으로 default 
}

class B extends A { // B가 A에게 상속 받음, 같은 패키지 안
    public void PrintB() {
        System.out.println("B class: " + nVar1);
    }
}

class D extends C { // D가 C에게 상속 받음, 다른 패키지 안
    public void PrintD() {
        //nVar1 = 10; // 다른 패키지, 상위 클래스 default 속성, =error
        //D.PrintC(); // 다른 패키지, 상위 클래스 default 속성, =error
    }
}