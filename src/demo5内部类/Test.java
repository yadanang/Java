package demo5内部类;


class OutClass{

}

interface A{
    void show();
}
public class Test {
    public static void main(String[] args) {
       //以下代码可以认为：有一个类 实现了A接口并且 重写了A接口中的方法
        A a = new A(){
            @Override
            public void show() {
                System.out.println("hahahahhah");
            }
        }/*.show()*/;
        a.show();
    }
}
