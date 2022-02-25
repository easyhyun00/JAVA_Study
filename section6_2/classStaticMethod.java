package section6_2;

public class classStaticMethod {
    public static void main(String[] args){
        StaticMethod.print(); // 객체 생성하지 않아도 호출 가능
    }
}

class StaticMethod{
    public static void print(){ // static method: 생성하지 않아도 호출
        System.out.println("Static Method Test");
    }
}
