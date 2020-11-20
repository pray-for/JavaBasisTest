package GenericPackage;

public class GenericDemo<T> {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("dd");
        System.out.println(s.getName());

        Teacher t = new Teacher();
        t.setAge(20);
        System.out.println(t.getAge());
        System.out.println("------------");

        //下面使用泛型
        Generic<String> g1 = new Generic<String>();
        g1.setT("dd");
        System.out.println(g1.getT());

        Generic<Integer> g2 = new Generic<Integer>();
        g2.setT(20);
        System.out.println(g2.getT());

    }
}
