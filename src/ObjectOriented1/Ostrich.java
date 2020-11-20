package ObjectOriented1;

/**
 * 方法重写
 */
class Bird {
    public void fly(){
        System.out.println("fly");
    }
}

public class Ostrich extends Bird{
    //对父类方法的重写
    public void fly(){
        System.out.println("run");
    }

    public void callOverrideMethod(){
        //在子类方法中 通过super显示调用父类被覆盖的实例方法
        super.fly();
    }

    public static void main(String[] args) {
        Ostrich os = new Ostrich();
        os.fly();   //输出run，调用了子类重写的方法
        os.callOverrideMethod();    //输出fly，通过super 调用了父类被覆盖的方法
    }

}
