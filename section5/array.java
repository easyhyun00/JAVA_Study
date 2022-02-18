package section5;

public class array {
    public static void main(String[] args){
        int[] nArray; // 배열 선언
        nArray = new int[5]; // 배열 생성
        for( int i = 0; i < nArray.length; i++){
            nArray[i] = i + 1;
            System.out.println(nArray[i]);
        }
    }
}
