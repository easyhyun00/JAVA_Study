package section12;

public class integerClass {
    public static void main(String[] args) {
        Integer IntVar1 = new Integer(123); // Integer을 생성해 IntVar1 객체에 123저장
        int nVar = IntVar1.intValue(); // IntVar1 객체의 값을 정수값으로
        System.out.println(nVar);

        String str = IntVar1.toString(); // 객체 값을 문자열로
        System.out.println(str);

        nVar = Integer.parseInt("300"); // 문자열을 정수값으로
        System.out.println(nVar);

        str = Integer.toString(nVar); // 정수값을 문자열로
        System.out.println(str);

        Integer IntVar3 = Integer.valueOf("100"); // 문자열을 Interger 객체로
        System.out.println(IntVar3.intValue()); // 객체의 값을 정수값으로
    }
}
