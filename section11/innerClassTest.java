package section11;

class OutClass {
    int nVar1 = 3;
    
    class InnerClass { // 내부 클래스 정의
        void Print() {
            System.out.println("outClass : " + nVar1); // 외부 클래스 멤버 변수 사용
        }
    }
    InnerClass Inner = new InnerClass(); 
}

public class innerClassTest {
    public static void main(String[] args) {
        OutClass OutTest = new OutClass();
        OutTest.Inner.Print();
    }  
}
