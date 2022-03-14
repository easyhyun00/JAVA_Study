package section11;

interface Testable {
    public void Print();
}

class InterfaceClass implements Testable {
    public void Print() {
        System.out.println("interface!");
    }
}

class ClassA {
    public void Print() {
        System.out.println("class!");
    } 
}

public class anonyClassTest {
    public static void main(String[] args) {
        InterfaceClass Test1 = new InterfaceClass();
        Test1.Print(); // 일반적인 클래스 호출

        ClassA Test2 = new ClassA();
        Test2.Print(); // 일반적인 클래스 호출

        InterfaceClass Test3 = new InterfaceClass() { // 익명 클래스, 일회성
            public void Print() { // 재정의
                System.out.println("anonymous interface");
            }
        };
        Test3.Print(); // 익명 클래스 호출

        ClassA Test4 = new ClassA() { // 익명 클래스, 일회성
            public void Print() {
                System.out.println("anonymous classA");
            }
        };
        Test4.Print();

        Testable Test6 = new Testable() { // 익명 클래스, 일회성
            public void Print() {
                System.out.println("anonymous interface");
            }
        };
        Test6.Print();
    }
}
