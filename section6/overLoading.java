package section6;

public class overLoading {
    public static void main(String[] args){
        OverLoadTest OL_Operator = new OverLoadTest();
        int result1 = OL_Operator.Add(3,5);
        float result2 = OL_Operator.Add(3.2f, 5.1f);
        int result3 = OL_Operator.Add(4, 3.1f);

        System.out.println("3 + 5 = "+ result1);
        System.out.println("3.2 + 5.1 = "+ result2);
        System.out.println("4 + (int)3.1 = "+ result3);

    }
}

class OverLoadTest{
    public int Add(int nVar1, int nVar2){
        return nVar1 + nVar2;
    }
    public float Add(float fVar1, float fVar2){
        return fVar1 + fVar2;
    }
    public int Add(int nVar1, float fVar2){
        return nVar1 + (int)fVar2;
    }
}
