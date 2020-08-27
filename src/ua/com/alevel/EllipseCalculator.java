package ua.com.alevel;

import ua.com.alevel.Ellipse;

public class EllipseCalculator implements Figure {

    private Ellipse ellipse;

    public EllipseCalculator(Ellipse ellipse) {
        this.ellipse = ellipse;
    }

    @Override
    public void calculatePerimeter() {
        double x = ellipse.getAxisA() * ellipse.getAxisB();
        double y = ellipse.getAxisA() + ellipse.getAxisB();
        double z = ellipse.getAxisA() - ellipse.getAxisB();

        double perimeter = 4 * (((3.14 * x) + z) / y);
        System.out.println("Периметр элипса равен: " + perimeter);
    }

    @Override
    public void calculateArea() {
        double area = 3.14 * ellipse.getAxisA() * ellipse.getAxisB();
        System.out.println("Площадь элипса равна: " + area);
    }
}
