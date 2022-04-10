package section13;

import java.util.Vector;

public class vectorClass {
    public static void main(String[] args) {
        // 제네릭스(generics) 사용
        Vector<String> MyVector = new Vector();
        MyVector.add("java");
        MyVector.add("study");
        MyVector.add("section");
        MyVector.add("13");
        System.out.println(MyVector);

        String str2 = MyVector.get(2); // index 2번의 문자열 가져옴
        System.out.println(str2);

        int nIndex = MyVector.indexOf("study"); // study가 있는 index 반환
        System.out.println(MyVector.get(nIndex)); // nIndex의 문자열 가져옴
    }
}
