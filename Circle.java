package oop2;


public class Circle implements Shape {
    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {

        double area = 2 * Math.PI * radius;
        System.out.println("半径が" + radius + "の円の面積は" + area + "です。");
        return area;

    }
}
