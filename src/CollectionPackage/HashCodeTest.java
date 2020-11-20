package CollectionPackage;

import java.util.HashSet;
import java.util.Iterator;

/**
 * HashCode中 重写 equals()、hashCode() 方法
 */
class R{
    int count;
    public R(int count){
        this.count = count;
    }
    public String toString(){
        return "R[count: " + count + "]";
    }
    public boolean equals(Object obj){
        if (this == obj){
            return true;
        }
        if (obj != null && obj.getClass() == R.class){
            R r = (R) obj;
            return this.count == r.count;
        }
        return false;
    }
    public int hashCode(){
        return this.count;
    }
}

public class HashCodeTest {
    public static void main(String[] args) {
        HashSet hs = new HashSet();
        hs.add(new R(5));
        hs.add(new R(-3));
        hs.add(new R(9));
        hs.add(new R(-2));
        System.out.println(hs);

        //取出第一个元素
        Iterator it = hs.iterator();
        R first = (R) it.next();

        //为第一个元素的 count 实例变量赋值
        first.count = -3;
        System.out.println(hs);

        //删除 count 值为-3 的R对象
        hs.remove(new R(-3));
        System.out.println(hs);

        //判断是否包含
        System.out.println("是否包含-3：" + hs.contains(new R(-3)));
        System.out.println("是否包含-2：" + hs.contains(new R(-2)));
        System.out.println("是否包含5：" + hs.contains(new R(5)));
    }
}
