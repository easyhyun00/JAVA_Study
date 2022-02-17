package section4;

public class continueControl {
    public static void main(String[] args){
        for (int i = 0; i < 5; i++){
            if ( i % 2 == 0 ) // i를 2로 나눈 나머지가 0이면
                continue; // 하위 코드를 실행하지 않고 다시 반복문 수행
            System.out.println(i+": odd number");
        }
    }
}
