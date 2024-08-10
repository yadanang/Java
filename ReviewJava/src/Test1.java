interface A{

    void show();
}



public class Test1 {

    public static void main(String[] args) {
        new A(){

            @Override
            public void show() {
                System.out.println("123");
            }
        }.show();
    }
}
