package ObjectOriented1;

/**
 * 自定义构造器
 */
public class ConstructorTest {
    public String name;
    public int count;

    //自定义构造器
    public ConstructorTest(String name, int count){
        //构造器里的this代表它进行初始化的对象
        //将传入的参数 赋给this代表对象的 name和count 实例变量
        this.name = name;
        this.count = count;
    }

    public static void main(String[] args) {
        //使用自定义的构造器来创建对象
        ConstructorTest tc = new ConstructorTest("abc", 20);
        System.out.println(tc.name);
        System.out.println(tc.count);
    }
}
