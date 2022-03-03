package section9;

public class interfaceTest {
    public static void main(String[] args){
        A Test = new A();
        Test.Print();
    }
}

interface interfaceA {
    int nVar = 7; // 고정되어 상수화된 변수(final)
    void Print(); // 추상 메소드(abstract)
}

class A implements interfaceA {
    public void Print() {
        System.out.println(nVar);
    }
}
