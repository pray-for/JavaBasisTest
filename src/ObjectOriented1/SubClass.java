package ObjectOriented1;

/**
 * 多态
 */

class BaseClass{
    public int book = 6;

    public void base(){
        System.out.println("父类的普通方法");
    }

    public void test(){
        System.out.println("父类被覆盖的方法");
    }
}

public class SubClass extends BaseClass{
    //重新定义一个book实例变量 隐藏父类的book实例变量
    public String book = "ddd";

    public void test(){
        System.out.println("子类覆盖父类的方法");
    }

    public void Sub(){
        System.out.println("子类的普通方法");
    }

    public static void main(String[] args) {
        //编译和运行时类型相同，不存在多态
        BaseClass bc = new BaseClass();
        System.out.println(bc.book);
        bc.base();
        bc.test();
        System.out.println(bc instanceof BaseClass);
        System.out.println(bc instanceof SubClass);
        //编译和运行时类型相同，不存在多态
        SubClass sc = new SubClass();
        System.out.println(sc.book);
        sc.Sub();
        sc.test();
        System.out.println(sc instanceof BaseClass);
        System.out.println(sc instanceof SubClass);
        //编译和运行时类型不相同，存在多态
        BaseClass polymorphism = new SubClass();
        System.out.println(polymorphism.book);
        polymorphism.base();
        polymorphism.test();
        //没有Sub()方法
        System.out.println(polymorphism instanceof BaseClass);
        System.out.println(polymorphism instanceof SubClass);
    }
}
