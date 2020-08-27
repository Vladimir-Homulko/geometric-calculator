package ua.com.alevel;

import ua.com.alevel.Figure;
import ua.com.alevel.Square;

public class SquareCalculator implements Figure {

    private Square square;

    public SquareCalculator(Square square) {
        this.square = square;
    }

    @Override
    public void calculatePerimeter() {
        double perimeter = square.getSideA() + square.getSideB() + square.getSideC() + square.getSideD();
        System.out.println("Периметр квадрата равен: " + perimeter);
    }

    @Override
    public void calculateArea() {
        double area = square.getSideA() * square.getSideB();
        System.out.println("Площадь квадрата равна: " + area);
    }
}
