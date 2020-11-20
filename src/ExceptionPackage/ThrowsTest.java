package ExceptionPackage;

import java.io.FileInputStream;
import java.io.IOException;

public class ThrowsTest {
    public static void main(String[] args) throws Exception{
        test();
    }
    public static void test() throws IOException{
        FileInputStream fis = new FileInputStream("D:\\a.txt");
//        System.out.println(fis.read());
    }
}
