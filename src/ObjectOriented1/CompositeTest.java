package ObjectOriented1;

/**
 * 组合
 */
class AnimalTest{
    private void beat(){
        System.out.println("心脏跳动");
    }
    public void breath(){
        beat();
        System.out.println("呼吸");
    }
}

class BirdTest{
    private AnimalTest a;
    public BirdTest(AnimalTest a){
        this.a = a;
    }
    //重新定义一个breath()方法
    public void breath(){
        //直接复用AnimalTest提供的breath()方法 来实现BirdTest的breath()方法
        a.breath();
    }
    public void fly(){
        System.out.println("飞翔");
    }
}

class WolfTest{
    private AnimalTest a;
    public WolfTest(AnimalTest a){
        this.a = a;
    }
    public void breath(){
        //直接复用AnimalTest提供的breath()方法 来实现WolfTest的breath()方法
        a.breath();
    }
    public void run(){
        System.out.println("奔跑");
    }
}

public class CompositeTest {
    public static void main(String[] args) {
        AnimalTest at1 = new AnimalTest();
        BirdTest bt = new BirdTest(at1);
        bt.breath();
        bt.fly();

        AnimalTest at2 = new AnimalTest();
        WolfTest wt = new WolfTest(at2);
        wt.breath();
        wt.run();
    }
}
