package ObjectOriented1;

/**
 * 构造器之间的继承关系
 */

class Creature {
    public Creature(){
        System.out.println("Creature无参数的构造器");
    }
}

class Animal extends Creature{
//    public int age = 6;
    public Animal(String name){
        System.out.println("Animal带一个参数的构造器，" + "该动物的name为：" + name);
    }
    public Animal(String name, int age){
        this(name);
//        this.age = age;
        System.out.println("Animal带两个参数的构造器，" + "该动物的age为：" + age);
    }
}

public class Wolf extends Animal{
    public Wolf(){
        super("大灰狼", 8);
        System.out.println("Wolf无参数的构造器");
    }

    public static void main(String[] args) {
        Wolf w = new Wolf();
//        System.out.println(w);
    }
}
