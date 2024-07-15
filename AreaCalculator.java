import java.io.*;
import java.util.Scanner;
public class AreaCalculator {
    public interface Shape {
        double area();
    }
    public static class Circle implements Shape {
        public double radius;

        public Circle(double radius) {
            this.radius = radius;
        }
        public double area() {
            return Math.PI * radius * radius;
        }
    }

    public static class Triangle implements Shape {
        public double base;
        public double height;

        public Triangle(double base, double height) {
            this.base = base;
            this.height = height;
        }
        public double area() {
            return 0.5 * base * height;
        }
    }
    public static class Rectangle implements Shape {
        public double length;
        public double width;

        public Rectangle(double length, double width) {
            this.length = length;
            this.width = width;
        }
        public double area() {
            return length * width;
        }
    }

    public static void main(String[] args) {
       
        Shape circle = new Circle(5);
        System.out.println("Area of Circle: " + circle.area());

        
        Shape triangle = new Triangle( 2, 5);
        System.out.println("Area of Triangle: " + triangle.area());

        
        Shape rectangle = new Rectangle( 4,6);
        System.out.println("Area of Rectangle: " + rectangle.area());

    }
}
