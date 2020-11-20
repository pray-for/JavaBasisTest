package ObjectOriented1;

/**
 * 初始化块
 */
public class Person {
    //定义第一个初始化块
    {
        int a = 6;
        System.out.println("初始化块1");
    }
    //定义第二个初始化块
    {
        int a = 6;
        System.out.println("初始化块2");
    }
    //定义构造器
    public Person(){
        System.out.println("无参数的构造器");
    }

    public static void main(String[] args) {
        new Person();
    }
}
