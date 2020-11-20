package ObjectOriented2;

/**
 * toString方法
 */
class Apple{
    private String color;
    private double weight;
    public Apple(){

    }
    public Apple(String color, double weight){
        this.color = color;
        this.weight = weight;
    }
    //重写 toString() 方法
    public String toString(){
        return "颜色：" + color + "，重量：" + weight;
    }
}

public class ToStringTest {
    public static void main(String[] args) {
        Apple a = new Apple("red", 6.7);
        System.out.println(a);
    }
}
