package oop2;

public class Triangle implements Shape {

    int width;
    int height;

    public Triangle(int width,int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {

        double area = (width * height) / 2;
        System.out.println("底辺が" + width + "、高さが" + height + "の三角形の面積は" + area + "です。");
        return area;

    }
}
