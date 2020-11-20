package ObjectOriented2;

/**
 * 非静态内部类
 */

class Out{
    //非静态内部类
    class In{
        public In(String msg){
            System.out.println(msg);
        }
    }
}

public class CreateInnerInstance {
    public static void main(String[] args) {
//        Out.In in = new Out().new In("测试信息...");
        /**
         * 上面一行代码可用如下代码替换
         * Out.In in;
         * Out out = new Out();
         * in = out.new In("测试信息...");
         */
    }
}
