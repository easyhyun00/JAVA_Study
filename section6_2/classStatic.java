package section6_2;

public class classStatic {
    public static void main(String[] args){

        StaticTest.nVar = 10; // static은 객체 생성하지 않아도 호출 가능
    
        StaticTest Test1 = new StaticTest();
        StaticTest Test2 = new StaticTest();
        StaticTest Test3 = new StaticTest();

        System.out.printf("%1$d %2$d %3$d\n", Test1.nVar, Test2.nVar, Test3.nVar); // 10 10 10출력

        Test1.nVar = 2;
        System.out.printf("%1$d %2$d %3$d\n", Test1.nVar, Test2.nVar, Test3.nVar); // 2 2 2출력

        StaticTest.nVar = 5;
        System.out.printf("%1$d %2$d %3$d", Test1.nVar, Test2.nVar, Test3.nVar); // 5 5 5출력
    }
}

class StaticTest {
    public static int nVar; // static 멤버변수
}

