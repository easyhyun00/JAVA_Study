package section5;

public class dimenArray {
    public static void main(String[] args){
        int nVar = 1;
        int[][] nArray; // 2차원 배열 선언
        nArray = new int[3][]; // 2차원 배열 생성
        nArray[0] = new int[2]; // 열을 다룰 수 있도록 메모리 생성 
        nArray[1] = new int[3];
        nArray[2] = new int[5];

        for( int i = 0; i < nArray.length; i++){ // 행의 길이 만큼
            for( int j = 0; j < nArray[i].length; j++){ // i행의 열 길이 만큼
                nArray[i][j] = nVar++; // 초기화
                System.out.printf("%1$d ", nArray[i][j]);
            }
            System.out.println(); // 행이 바뀔 때 한 줄 띄기
        }
    }
}
