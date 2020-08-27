package ua.com.alevel;

import ua.com.alevel.Circle;

public class CircleCalculator implements Figure {

    private Circle circle;

    public CircleCalculator(Circle circle) {
        this.circle = circle;
    }

    @Override
    public void calculatePerimeter() {
        double perimeter = 2 * 3.14 * circle.getRadius();
        System.out.println("Периметр круга равен: " + perimeter);
    }

    @Override
    public void calculateArea() {
        double area = 2 * 3.14 * Math.pow(circle.getRadius(), 2);
        System.out.println("Площадь круга равна: " + area);
    }
}
