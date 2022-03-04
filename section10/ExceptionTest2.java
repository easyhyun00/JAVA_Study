package section10;

public class ExceptionTest2 {
    public static void main(String[] args){
        int nVar[] = {0, 1, 2, 3, 4, 5};

        try {
            for (int i = 0; i < 7; i++) {
                System.out.println(nVar[i]);
            }
        } catch (ArithmeticException e) { // 0으로 나눌 때
            System.out.println("Arithmetic Exception");
        } catch (ArrayIndexOutOfBoundsException e) { // 배열의 인덱스가 범위를 벗어났을 때
            System.out.println("Array Index Out Of Bounds Exception");
        }
    }
}
