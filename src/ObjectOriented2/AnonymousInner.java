package ObjectOriented2;

/**
 * 匿名内部类
 */

abstract class Device{
    private String name;
    public abstract double getPrice();
    public Device(){

    }
    public Device(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}

public class AnonymousInner {
    public void test(Device d){
        System.out.println(d.getName() + "---" + d.getPrice());
    }

    public static void main(String[] args) {
        AnonymousInner ai = new AnonymousInner();
        ai.test(new Device("dd") {
            @Override
            public double getPrice() {
                return 520;
            }
        });

        Device d = new Device() {
            {
                System.out.println("匿名内部类的初始化块");
            }
            @Override
            public double getPrice() {
                return 725;
            }

            public String getName(){
                return "zz";
            }
        };
        ai.test(d);
    }
}
