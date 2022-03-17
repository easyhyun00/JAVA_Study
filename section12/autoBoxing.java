package section12;

public class autoBoxing {
    public static int Add( Integer IntVar ) { // 클래스 변수 IntVar을 매개변수로 받음
        int nVar = 10;
        IntVar = IntVar + nVar;
        return IntVar; // 객체의 값을 int형으로 반환
    }
    public static void main(String[] args) {
        Integer IntVar = 12; // new Integer(12), IntVar 객체 생성해 12 저장
        int nVar = 3;
        int nTotal = nVar + IntVar; // nVar: 변수, IntVar: 객체, autoboxing 기능으로 객체의 값으로 자동 변환
        System.out.println("autoBoxing : " + IntVar); // IntVar.intValue() 와 동일
        System.out.println("total : " + nTotal);

        IntVar++; // 객체 값에 +1 연산을 해줌
        System.out.println("++autoBoxing : " + IntVar);

        System.out.println("return : " + Add(IntVar));
    }
}
