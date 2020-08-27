package ua.com.alevel;

import ua.com.alevel.Figure;
import ua.com.alevel.Rectangle;

public class RectangleCalculator implements Figure {

    private Rectangle rectangle;

    public RectangleCalculator(Rectangle rectangle) {
        this.rectangle = rectangle;
    }

    @Override
    public void calculatePerimeter() {
        int perimeter = 2 * (rectangle.getSideA() + rectangle.getSideB());
        System.out.println("Периметр прямоугольника равен: " + perimeter);
    }

    @Override
    public void calculateArea() {
        int area = rectangle.getSideA() * rectangle.getSideB();
        System.out.println("Площадь прямоугольника равна: " + area);
    }
}
