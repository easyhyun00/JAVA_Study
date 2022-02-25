package section6_2;

public class classConstructor {
    public static void main(String[] args){
        ConstTest Test1 = new ConstTest(); // 아래 class에서 첫 번째 생성자 호출
        System.out.println(Test1.Get()); // 9 출력

        ConstTest Test2 = new ConstTest(5); // 아래 class에서 두 번째 생성자 호출
        System.out.println(Test2.Get()); // 5 출력
    }
}

class ConstTest{
    private int m_nVar;

    public ConstTest() { // 생성자 안에서 값 초기화, 기본 생성자
        m_nVar = 9;
    }
    public ConstTest( int nVar ){ // 외부로 부터 값을 입력받아 객체 생성될 때 초기화
        m_nVar = nVar;
    }
    public int Get() { // 값 읽음
        return m_nVar;
    }
}
