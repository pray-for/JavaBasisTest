package UnitArrays;

import java.util.Arrays;
import java.util.function.IntBinaryOperator;
import java.util.function.IntUnaryOperator;

public class ArraysTest2 {
    public static void main(String[] args){
        int[] array1 = new int[]{3, -4, 25, 16, 30, 18};
        //并发排序
        Arrays.parallelSort(array1);
        System.out.println(Arrays.toString(array1));

        int[] array2 = new int[]{3, -4, 25, 16, 30, 18};
        Arrays.parallelPrefix(array2, new IntBinaryOperator() {
            @Override
            public int applyAsInt(int left, int right) {
                return left * right;
            }
        });
        System.out.println(Arrays.toString(array2));

        int[] array3 = new int[5];  //全0
        Arrays.parallelSetAll(array3, new IntUnaryOperator() {
            @Override
            //operand表示当前元素的索引
            public int applyAsInt(int operand) {
                return operand*5;
            }
        });
        System.out.println(Arrays.toString(array3));

    }
}
