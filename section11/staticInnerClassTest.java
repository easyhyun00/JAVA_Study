package section11;

class S_OutClass {
    static class S_InnerClass { // static: 객체를 생성하지 않아도 호출 가능
        static void Print() {
            System.out.println("static inner class");
        }
    }
}

public class staticInnerClassTest {
    public static void main(String[] args) {
        S_OutClass.S_InnerClass.Print(); // static: 객체를 생성하지 않아도 호출 가능
    }
}
