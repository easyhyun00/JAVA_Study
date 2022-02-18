package section5;

public class dimenArrayInit {
    public static void main(String[] args){
        int[][] nArray = { { 1, 2 }, { 3, 4, 5} }; // 선언과 동시에 초기화
        for( int i = 0; i < nArray.length; i++){ // 행 길이 만큼
            for( int j = 0; j < nArray[i].length; j++){ // 열 길이 만큼
                System.out.printf("%1$d ", nArray[i][j]);
            }
            System.out.println();
        }
    }
}
