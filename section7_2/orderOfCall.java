package section7_2;

public class orderOfCall {
    public static void main(String[] args){
        C1 Test = new C1();
    }
}

// 매개변수가 없어 자동으로 호출
class A1 {
    public A1() {
        System.out.println("A clsss");
    }
}

class B1 extends A1 { // 클래스 B가 클래스 A에게 상속 받음
    public B1() {
        System.out.println("B class");
    }
}

class C1 extends B1 { // 클래스 C가 클래스 B에게 상속 받음
    public C1() {
        System.out.println("C class");
    }
}