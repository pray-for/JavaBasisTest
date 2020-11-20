package ObjectOriented1;

/**
 * 方法重载
 */
public class Overload {
    //无参数的方法
    public void test(){
        System.out.println("无参数方法");
    }
    public void test(String msg){
        System.out.println("重载方法" + msg);
    }

    public static void main(String[] args) {
        Overload ol = new Overload();
        ol.test();
        ol.test("hello");
    }
}
