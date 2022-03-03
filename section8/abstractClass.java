package section8;

public class abstractClass {
    public static void main(String[] args){
        B1 Test1 = new B1();
        Test1.Print();
        Test1.Print1();

        C1 Test2 = new C1();
        Test2.Print();
        Test2.Print1();
    }
}

abstract class A1 {
    public int nVar = 5;
    public void Print() {
        System.out.println("A class");
    }
    abstract void Print1(); // 추상 클래스: 하위 클래스에서 구현해야 함
}

class B1 extends A1 {
    void Print1() {
        System.out.println("B class");
    }
}

class C1 extends A1 {
    void Print1() {
        System.out.println("C class");
    }
}