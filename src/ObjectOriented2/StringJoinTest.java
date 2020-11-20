package ObjectOriented2;

/**
 * 常量池
 */
public class StringJoinTest {
    public static void main(String[] args) {
        String s1 = "ddzz";
        String s2 = "dd" + "zz";
        System.out.println(s1 == s2);

        String str1 = "dd";
        String str2 = "zz";
        String s3 = str1 + str2;
        System.out.println(s1 == s3);
    }
}
