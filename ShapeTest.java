package oop2;

public class ShapeTest {

    public static void main(String[] args) {
        // TriangleとRectangleのインスタンス作成し、
        // Shape型の配列変数に格納。
        Shape[] shapes = new Shape[3];

        shapes[0] = new Rectangle(4,5);
        shapes[1] = new Triangle(4,5);
        shapes[2] = new Circle(4);

        // getTotalAreaメソッドを使用して面積の合計を求めて出力。
        getTotalArea(shapes);

        var a = new User("田中","神奈川","2000-05-05");
        System.out.println(a.toString());

        var b = new User("田中b","神奈川","2000-05-05");
        System.out.println(a.equals(b));


    }

    public static double getTotalArea(Shape[] shapes) {
        // Shape型の配列を引数にとり、
        // 配列の各要素の合計値を返すメソッド
        double area1 = shapes[0].calculateArea();
        double area2 = shapes[1].calculateArea();
        double area3 = shapes[2].calculateArea();

        double sum = area1 + area2 + area3;
        System.out.println();
        System.out.println("合計の面積は" + sum + "です。");
        return sum;

    }

}
