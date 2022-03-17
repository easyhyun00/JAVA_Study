package section12;

public class basicString {
    public static void main(String[] args) {
        String str1 = String.valueOf(3.14f); // float => String
        System.out.println(str1);

        char[] strArray = {'a', 'b','c','d'}; // 배열
        String str2 = String.valueOf(strArray); // array => string
        System.out.println(str2);
    }
}
