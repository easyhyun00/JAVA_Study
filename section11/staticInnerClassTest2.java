package section11;

class S_OutClass2 {

    static int nVar = 3; // out class가 생성되기 전 메모리에 생성 
                         // => static inner class에서 사용 가능
    static class S_InnerClass2 {
        static void Print() {
            System.out.println("static inner class");
            System.out.println("out class static nVar: " + nVar);
        }
    }
}

public class staticInnerClassTest2 {
    public static void main(String[] args) {
        S_OutClass2.S_InnerClass2.Print();
    }
}
