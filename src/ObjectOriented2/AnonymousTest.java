package ObjectOriented2;

/**
 * 匿名内部类
 */

interface Product{
    public double getPrice();
    public String getName();
}

public class AnonymousTest {
    public void test(Product p){
        System.out.println(p.getName() + "---" + p.getPrice());
    }

    public static void main(String[] args) {
        AnonymousTest a = new AnonymousTest();
        //调用test()需要传入Product参数，这里用匿名 实现类的实例
        a.test(new Product() {
            @Override
            public double getPrice() {
                return 520;
            }

            @Override
            public String getName() {
                return "dd";
            }
        });
    }
}
