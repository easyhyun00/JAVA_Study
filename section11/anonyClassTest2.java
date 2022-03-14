package section11;

interface Testable2 {
    public void Print();
}

class ClassA implements Testable2 {
    public void Print() {
        System.out.println("interface classA");
    }
}

class ClassB {
    void SetClass( ClassA ObjectA ) { // ClassA를 Object로 받음
        ObjectA.Print(); // Object의 메소드 호출
    }
}

public class anonyClassTest2 {
    public static void main(String[] args) {
        ClassB Test1 = new ClassB();
        Test1.SetClass(new ClassA()); // 바로 매개변수로 넘겨 호출

        Test1.SetClass(new ClassA(){ // 익명클래스
            public void Print() {
                System.out.println("main class");
            }
        });
    }
}
