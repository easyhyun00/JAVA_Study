package section12;

public class setStringBuffer {
    public static void main(String[] args) {
        StringBuffer str1 = new StringBuffer("abcd");
        String str2 = "123";
        str1.append(str2); // str1 문자열 끝에 str2 추가
        System.out.println(str1);

        StringBuffer str3 = new StringBuffer(100); // buffer size 100
        str3.append("hello");
        System.out.println(str3);
    }
}
