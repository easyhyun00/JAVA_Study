package section13;

import java.util.*;

class Person {
    String strName;
    public Person(String str){
        strName = str;
    }
}

public class linkedListClassUser {
    public static void main(String[] args) {
        // 제네릭스(generics) 사용
        LinkedList<Person> List = new LinkedList();
        List.add(new Person("이마크"));
        List.add(new Person("황런쥔"));
        List.add(new Person("이제노"));
        List.add(new Person("이동혁"));
        List.add(new Person("나재민"));
        List.add(new Person("종천러"));
        List.add(new Person("박지성"));

        // 출력
        for(int i = 0; i< List.size(); i++) {
            System.out.println(List.get(i).strName);
        }

        // 검색
        int searchIdx = -1;
        for(int i = 0; i< List.size(); i++) {
            if (List.get(i).strName.equals("나재민")) {
                System.out.println(List.get(i).strName + "의 위치는 index: " + i);
                searchIdx = i;
                break;
            }
        }

        // 삭제
        List.remove(searchIdx);
        System.out.println("삭제---------------");
        for(int i = 0; i< List.size(); i++){
            System.out.println(List.get(i).strName);
        }

        // 삽입
        List.add(searchIdx, new Person("나재민"));
        System.out.println("삽입---------------");
        for(int i = 0; i< List.size(); i++){
            System.out.println(List.get(i).strName);
        }
    }
}
