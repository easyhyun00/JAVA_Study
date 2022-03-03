package section7_2;

public class constructSuper {
    public static void main(String[] args){
        B3 Test1 = new B3();
        Test1.Print();

        D3 Test2 = new D3();
        Test2.Print();
    }
}

class A3 {
    int m_nVar;
    public A3(int nVar){
        m_nVar = nVar;
        System.out.println("A class");
    }
}

class B3 extends A3 { // B 클래스가 A 클래스에게 상속 받음
    public B3() {
        super(7); // 상위 클래스 생성자 호출
    }

    public void Print() {
        System.out.println("B class " + m_nVar);
    }
}

class C3 {
    int m_nVar;
    public C3() {
        m_nVar = 11;
        System.out.println("C class");
    }
}

class D3 extends C3 { // D 클래스가 C 클래스에게 상속 받음
    public D3() {
        super(); // 상위 클래스 생성자 호출, 호출하지 않아도 자동으로 호출됨
    }

    public void Print() {
        System.out.println("D class " + m_nVar);
    }
}