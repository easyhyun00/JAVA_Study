package section12;

public class stringBuffer {
    public static void main(String[] args) {
        StringBuffer strFileName = new StringBuffer(100); // size 100 buffer
        strFileName.append("text.txt"); // strFileName에 text.txt 넣음
        System.out.println(strFileName);

        strFileName.delete(0, strFileName.length() - 4); // 0부터 strFileName.length() - 4 까지 문자열 삭제
        strFileName.insert(0, "success"); // 0번째에 success 문자열 삽입
        System.out.println(strFileName);
    }
}
