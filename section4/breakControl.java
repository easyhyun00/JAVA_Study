package section4;

public class breakControl {
    public static void main(String[] args){
        int i = 0;
        
        A : while(true)
        {
            while(true){
                System.out.println(i);
                if ( i == 3 ){
                    System.out.println("break loop");
                    break A; // A 라벨의 반복문 빠져나옴
                }
                i++;
            }
        }
    }
}