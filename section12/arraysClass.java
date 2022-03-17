package section12;

import java.util.Arrays;

public class arraysClass {
    public static void main(String[] args) {
        int[] intArray = {1, 5, 3, 7, 11, 13, 9};
        System.out.println("정렬 전: " + Arrays.toString(intArray));

        Arrays.sort(intArray); // 오름차순 정렬
        System.out.println("정렬 후: " + Arrays.toString(intArray));

        // 해당 숫자가 있으면 해당 숫자의 index 반환, 없으면 음수 반환
        System.out.println(Arrays.binarySearch(intArray, 5));
        System.out.println(Arrays.binarySearch(intArray, 4));

        Arrays.fill(intArray, 1, 5, 0); // index 1부터 5까지 0으로 치환
        System.out.println("치환 후: " + Arrays.toString(intArray));
    }
}
