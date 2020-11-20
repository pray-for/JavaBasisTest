package CollectionPackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/**
 * Collection 集合的操作
 */
public class CollectionTest {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add("zzz");
        c.add(6);
        c.remove(6);
        System.out.println("c集合的元素个数为：" + c.size());
        System.out.println("是否包含字符 zzz ：" + c.contains("zzz"));

        Collection books = new HashSet();
        books.add("book1");
        books.add("book2");
        System.out.println("c集合是否完全包含books集合：" + c.containsAll(books));
    }
}
