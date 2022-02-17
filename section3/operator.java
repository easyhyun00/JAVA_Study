package section3;

public class operator {
    public static void main(String[] args){
        int nVar1 = 4; 
        int nVar2, nResult;
        nVar1 ++;
        nVar2 = 6;
        nResult = nVar1 + nVar2;

        System.out.println(nResult);
        System.out.println(12 > 4); // true
        System.out.println(12 == 4); // false
        System.out.println((12 > 4) && (12 == 4)); // false
    }
}
