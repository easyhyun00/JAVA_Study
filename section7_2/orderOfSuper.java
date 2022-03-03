package section7_2;

public class orderOfSuper {
    public static void main(String[] args){
        B2 Test = new B2();
        Test.Print();
    }
}

class A2 {

    protected void Print() {
        System.out.println("class A");
    }
}

class B2 extends A2 { // 클래스 B에서 클래스 A를 상속 받음

    public void Print() {
        super.Print(); // 상위(A) 클래스의 Print 메소드 호출
        System.out.println("class B");
    }
}
