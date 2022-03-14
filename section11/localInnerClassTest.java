package section11;

class L_OutClass {

    int nVar = 5;
    
    class L_InnerClass { // 내부 클래스 정의
        void Print() {
            System.out.println("Out class nVar: "+ nVar);
        }
    }
    void Print() { // 내부 클래스의 메소드
        L_InnerClass Inner = new L_InnerClass(); // 내부 클래스 생성
        Inner.Print(); // 내부 클래스 호출
    }
}

public class localInnerClassTest {
    public static void main(String[] args) {
        L_OutClass L_OutTest = new L_OutClass();
        L_OutTest.Print();
    }
}
