package section10;

public class ExceptionTest {
    public static void main(String[] args){
        int nVar = 0;
        int nResult;

        try {
            nResult = 5 / nVar;
        } catch(ArithmeticException e) { // 0으로 나눌 때 예외 처리
            System.out.println("failed");
        }
    }
}
