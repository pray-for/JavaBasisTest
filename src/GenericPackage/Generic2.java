package GenericPackage;

//public class Generic2 {
//    //方法重载
//    public void show(String s){
//        System.out.println(s);
//    }
//
//    public void show(Integer i){
//        System.out.println(i);
//    }
//
//    public void show(Boolean b){
//        System.out.println(b);
//    }
//}


//用泛型类改进

//public class Generic2<T>{
//    public void show(T t){
//        System.out.println(t);
//    }
//}


//用泛型方法改进
public class Generic2{
    public <T> void show(T t){
        System.out.println(t);
    }
}