package section13;

import java.util.*;

public class linkedListClass {
    public static void main(String[] args) {
        // 제네릭스(generics) 사용
        LinkedList<Integer> List1 = new LinkedList();

        List1.add(5);
        List1.add(1);
        List1.add(2);
        List1.add(7);
        List1.add(6);
        List1.add(3);
        List1.add(4);
        System.out.println(List1);

        System.out.println("첫 노드: "+List1.getFirst());
        System.out.println("끝 노드: "+List1.getLast());
        System.out.println("개수: "+List1.size());

        List1.remove(5); // index 5번 삭제
        System.out.println(List1);
        List1.set(0, 8); // index 0번 값을 8로
        System.out.println(List1);

        Collections.sort(List1); // 오름차순 정렬
        System.out.println(List1);
    }
}
