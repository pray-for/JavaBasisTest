package ExceptionPackage;

public class ThrowsTest2 {
    public static void main(String[] args) {
        try {
            //调用声明抛出的 Checked 异常方法，要么显式捕获该异常，要么在 main 中再次声明
            throwCheckedTest(-3);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        //调用声明抛出的 Runtime 异常方法，既可以显式捕获该异常，也可以不理会
        throwRuntimeTest(3);
    }

    public static void throwCheckedTest(int a) throws Exception{
        if (a > 0){
            //自行抛出 Exception 异常
            //该代码必须处于 try...catch 块，或者处于 throws 声明的方法中
            throw new Exception("a大于0，不符合");
        }
    }

    public static void throwRuntimeTest(int a){
        if (a > 0){
            //自行抛出 RuntimeException 异常
            throw new RuntimeException("a大于0，不符合");
        }
    }
}
