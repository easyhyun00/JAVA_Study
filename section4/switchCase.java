package section4;

public class switchCase {
    public static void main(String[] args){
        int nVar = 2;

        switch ( nVar ){
            case 1: // nVar = 1
                System.out.println("nVar 1");
                break;
            case 2: // nVar = 2
                System.out.println("nVar 2");
                break;
            case 3: // nVar = 3
                System.out.println("nVar 3");
                break;
            default: // 그 외의 값
                System.out.println("Not satisfied");
                break;           
        }
    }
}
