public  class Shape {
    public void draw(){

    };
    public int sum( int a, int b ){
         return a+b;
    }

   public String s = "小鸟";
}

class  Print extends Shape{

    public  void print(){
        System.out.println(s);
    }

}

class Redt extends Shape{
    @Override
    public void draw() {
        System.out.println("菱形");

    }


}

class Cycle extends Shape{
    @Override
    public void draw() {
        System.out.println("圆形");

    }
}

class Flower extends Shape{
    @Override
    public void draw() {
        System.out.println("花");

    }
}


class Test{

    public static void drawShapes (){
        Shape[] shapes = {new Cycle(),new Redt(),new Cycle(),new Redt(),new Flower()};
        for (Shape shape : shapes) {
            shape.draw();
        }
    }

    public static void main(String[] args) {
       // drawShapes();
       // Shape S = new Shape();
        /*Cycle cycle = new Cycle();
        Shape R = cycle;
        cycle = (Cycle)R;*/
       // System.out.println(S.sum(1,2));

        Print p = new Print();
        p.print();
    }
}
