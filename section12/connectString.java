package section12;

public class connectString {
    public static void main(String[] args) {
        String str1 = "Apple";
        String str2 = "Banana";

        String str3 = str1 + str2; // 문자열 합치기(객체, 객체)
        System.out.println(str3);

        str3 = str1 + "12345"; // 문자열 합치기(객체, 문자열)
        System.out.println(str3);

        str3 = str1.concat(str2); // 문자열 합치기
        System.out.println(str3);
    }
}
