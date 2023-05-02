package oop2;

public class Rectangle implements Shape {

    int width;
    int height;

    public Rectangle(int width,int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {

        double area = width * height;
        System.out.println("底辺が" + width + "、高さが" + height + "の長方形の面積は" + area + "です。");
        return area;

    }

}
