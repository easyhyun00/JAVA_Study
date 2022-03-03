package section7_2;

public class overRiding {
    public static void main(String[] args){

        B Test1 = new B(); // B 클래스 객체 생성
        System.out.println(Test1.Set(9)); // 10 출력
    }
}

class A {

    protected int m_nVar; // 같은 패키지에서 public 처럼 사용

    public int Set(int nVar) {
        m_nVar = nVar;
        return m_nVar;
    }
}

class B extends A { // 클래스 B가 A에게 상속받음

    public int Set(int nVar) { // 부모 클래스인 A의 메소드를 자식 클래스인 B가 재정의    
        m_nVar = nVar + 1;
        return m_nVar;
    }
}