package ObjectOriented2;

/**
 * 接口的继承
 */

interface interface1{
    int a = 5;
    void test1();
}

interface interface2{
    int b = 6;
    void test2();
}

interface interface3 extends interface1, interface2{
    int c = 7;
    void test3();
}

public class InterfaceExtendsTest {
    public static void main(String[] args) {
        System.out.println(interface3.a);
        System.out.println(interface3.b);
        System.out.println(interface3.c);
    }
}
