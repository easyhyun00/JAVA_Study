package section5;

public class arrayInit {
    public static void main(String[] args){
        int[] nArray = new int[3]; // 배열 생성
        boolean bArray[]; // 배열 선언
        bArray = new boolean[3]; // 배열 생성
        float[] fArray = { 1.0f, 1.5f, 2.0f }; // 선언과 동시에 초기화

        for( int i = 0; i < nArray.length; i++){
            System.out.println(nArray[i]);
        }
        for( int i = 0; i < bArray.length; i++){
            System.out.println(bArray[i]);
        }
        for( int i = 0; i < fArray.length; i++){
            System.out.println(fArray[i]);
        }
    }
}
