package ObjectOriented2;

/**
 * Lambda表达式
 */

interface Eatable{
    void taste();
}

interface Flyable{
    void fly(String weather);
}

interface Addable{
    int add(int a, int b);
}

public class LambdaQs {
    //调用该方法需要 Eatable 对象
    public void eat(Eatable e){
        System.out.println("eat---" + e);
        e.taste();
    }
    //调用该方法需要 Flyable 对象
    public void drive(Flyable f){
        System.out.println("fly---" + f);
        f.fly("是个晴天呢");
    }
    //调用该方法需要 Addable 对象
    public void test(Addable ad){
        System.out.println("add---" + ad.add(5,2));
    }

    public static void main(String[] args) {
        LambdaQs lq = new LambdaQs();
        lq.eat(() -> System.out.println("好吃的"));
        lq.drive(weather -> {
            System.out.println("天气：" + weather);
            System.out.println("直升机平稳飞行");
        });
        lq.test(((a, b) -> a + b));
    }
}
