package section13;

import java.util.*;

public class arrayListClass {
    public static void main(String[] args) {
        // 제네릭스(generics) 사용
        ArrayList<String> List1 = new ArrayList();
        List1.add("java");
        List1.add("study");
        List1.add("section");
        List1.add("13");
        System.out.println(List1);

        int nIndex = List1.indexOf("java");
        System.out.println(List1.get(nIndex));
        List1.set(nIndex, "Ptython"); // nIndex 값 변경
        System.out.println(List1);

        Collections.sort(List1); // 오름차순 정렬
        System.out.println(List1);

        System.out.println("개수: "+List1.size());
    }
}
