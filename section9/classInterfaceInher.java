package section9;

public class classInterfaceInher {
    public static void main(String[] args){
        D2 Test = new D2();
        Test.PrintA2();
        Test.PrintB2();
        Test.PrintC2();
    }
}

interface A2 {
    void PrintA2(); // 추상 메소드
}

interface B2 {
    void PrintB2(); // 추상 메소드
}

class C2 {
    public void PrintC2() {
        System.out.println("class C");
    }
}

class D2 extends C2 implements A2, B2{ // class D가 class C 상속, interface A, B 다중 상속 받음

    public void PrintA2() {
        System.out.println("interface A");
    }
    public void PrintB2() {
        System.out.println("interface B");
    }
}
