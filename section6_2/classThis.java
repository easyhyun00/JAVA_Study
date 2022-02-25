package section6_2;

public class classThis {
    public static void main(String[] args){
        ThisTest Test1 = new ThisTest();
        System.out.println(Test1.Get()); // 3.14 출력
    }
}

class ThisTest {
    public float m_fVar;

    public ThisTest(){
        this(3.14f); // 또 다른 생성자 호출(아래에 있는 생성자 호출)
    }
    public ThisTest( float fVar ){
        m_fVar = fVar;
    }
    public float Get() { // 값 읽음
        return m_fVar;
    }
}