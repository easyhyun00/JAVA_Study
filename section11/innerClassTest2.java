package section11;

class OutClass2 {
    int nVar1 = 3;
    
    class InnerClass2 { // 내부 클래스 정의
        void Print() {
            System.out.println("outClass : " + nVar1); // 외부 클래스 멤버 변수 사용
        }
    }
}

public class innerClassTest2 {
    public static void main(String[] args) {
        OutClass2 OutTest2 = new OutClass2();
        OutClass2.InnerClass2 InnerTest2 = OutTest2.new InnerClass2();
        InnerTest2.Print();
    }
}
