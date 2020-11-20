package GenericPackage;

public class Generic<T> {
    private T t;    // Alt+Insert 生成 get,set 方法

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}
