package CollectionPackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Iterator 遍历集合元素
 */
public class IteratorTest {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add("dd");
        c.add("520");
        c.add("zz");
        c.add("725");

        //获取集合对应的迭代器
        Iterator it = c.iterator();
        while (it.hasNext()){
            //it.next() 返回值为为 Object 类型，需要强制类型转换
            String s = (String) it.next();
            System.out.println(s);

            //删除 Iterator 中的元素
//            if (s.equals("725")){
//                it.remove();
//            }

            s = "haha";
        }
        System.out.println(c);
    }
}
