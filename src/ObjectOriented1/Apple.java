package ObjectOriented1;

/**
 * 构造器重载
 */
public class Apple {
    public String name;
    public String color;
    public double weight;
    //无参数的构造器
    public Apple(){

    }
    //两个参数的构造器
    public Apple(String name, String color){
        this.name = name;
        this.color = color;
    }
    //三个参数的构造器
    public Apple(String name, String color, double weight){
        //通过 this 来调用另一个重载构造器的初始化代码
        this(name, color);  //调用该类中另一个带两个参数的构造器
        this.weight = weight;
    }

    public static void main(String[] args) {
        Apple aa = new Apple("apple", "red");
        System.out.println(aa.name + "-" + aa.color + "-" +  aa.weight);
    }
}
