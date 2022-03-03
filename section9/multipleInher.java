package section9;

public class multipleInher {
    public static void main(String[] args){
        D1 Test1 = new D1();
        Test1.PrintA1();
        Test1.PrintB1();
        Test1.PrintC1();
    }
}

interface A1 { // 인터페이스
    void PrintA1();
}

interface B1 { // 인터페이스
    void PrintB1();
}

interface C1 extends A1, B1 { // C1 인터페이스가 인터페이스를 다중 상속
    void PrintC1();
}

class D1 implements C1 { // D1이 C1을 상속 받음, 추상 메소드 모두 구현

    public void PrintA1() {
        System.out.println("interface A");
    }
    public void PrintB1() {
        System.out.println("interface B");
    }
    public void PrintC1() {
        System.out.println("interface C");
    }
}
