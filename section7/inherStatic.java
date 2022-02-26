package section7;

public class inherStatic {
    public static void main(String[] args){
        ParentClass Test1 = new ParentClass();
        Test1.PrintB(); // public 속성은 외부에서도 사용가능, = 호출됨

        ChildClass Test2 = new ChildClass();
        Test2.PrintC(); // error
        Test2.PrintD();
        System.out.println(Test2.nVar2); // public 속성은 외부에서도 사용가능, = 호출됨
    }
}

class ParentClass {
    private int nVar1 = 7;

    private void PrintA() {
        System.out.println(nVar1);
    }

    public void PrintB() {
        PrintA(); // private 속성은 클래스 안에서만 사용가능, = 호출됨
    }
}

class ChildClass extends ParentClass { // childClass가 ParentClass에게 상속받음
    public int nVar2 = 10;

    public void PrintC() {
        // PrintA(); // 상위 클래스의 private 속성, = error 발생
        // System.out.println(nVar1); // 상위 클래스의 private 속성, = error 발생
    }
    public void PrintD() {
        PrintB(); // 상위 클래스의 public 속성, = 호출됨
    }
}
