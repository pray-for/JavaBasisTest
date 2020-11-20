package UnitArrays;

public class ArraysTest1 {
    public static void main(String[] args) {
        //定义并初始化数组，数组类型为Person
        Person[] students = new Person[2];

        //创建Person类型的实例，并将该实例赋给zhang
        Person zhang = new Person();
        zhang.age = 18;
        zhang.height = 168;
        //创建另一个实例
        Person du = new Person();
        du.age = 19;
        du.height = 188;

        //将变量赋给数组
        students[0] = zhang;
        students[1] = du;

        //调用函数输出
        students[0].info();

//        System.out.println("hah");
    }
}
