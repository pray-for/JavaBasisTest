package ObjectOriented1;

/**
 * 调用父类构造器
 */

//父类
class Base {
    public double size;
    public String name;
    //自定义的父类构造器
    public Base(double size, String name){
        this.size = size;
        this.name = name;
    }
}

//子类
public class Sub extends Base {
    public String color;
    //自定义的子类构造器
    public Sub(double size, String name, String color){
        //用super 在子类构造器中调用父类构造器
        super(size, name);
        this.color = color;
    }

    public static void main(String[] args) {
        Sub s = new Sub(1.2, "dd", "red");
        System.out.println(s.size + "-" + s.name + "-" + s.color);
    }
}
