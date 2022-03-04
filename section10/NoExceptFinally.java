package section10;

public class NoExceptFinally {
    public static void main(String[] args){
        int nVar = 15;
        int nResult;

        try {
            nResult = 5 / nVar;
        } catch (ArithmeticException e) { // 0으로 나눌 때
            System.out.println("failed");
        } finally { // 항상 실행
            System.out.println("Good Bye");
        }
    }
}
