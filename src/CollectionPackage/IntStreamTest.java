package CollectionPackage;

import java.util.stream.IntStream;

/**
 * 通用流接口
 */
public class IntStreamTest {
    public static void main(String[] args) {
        IntStream s = IntStream.builder()
                .add(5)
                .add(2)
                .add(0)
                .add(7)
                .build();
        //下面调用聚集方法的代码 每次只能执行一次
//        System.out.println("max = " + s.max().getAsInt());
        System.out.println("min = " + s.min().getAsInt());
//        System.out.println("sum = " + s.sum());
//        System.out.println("average = " + s.average());
    }
}
