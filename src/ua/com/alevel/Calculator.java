package ua.com.alevel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculator {

    private SquareCalculator squareCalculator;
    private EllipseCalculator ellipseCalculator;
    private RectangleCalculator rectangleCalculator;
    private CircleCalculator circleCalculator;

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public void selectFigure() throws IOException {
        System.out.println("С какой фигурой вы хотите работать?");
        System.out.println("1 -> Квадрат");
        System.out.println("2 -> Элипс");
        System.out.println("3 -> Прямоугольник");
        System.out.println("4 -> Круг");
        System.out.println("0 -> Выйти из программы");

        String line = reader.readLine();

        while (line != null) {
            if (line.equals("1")) {
                workWithSquare();
                selectFigure();
            }
            if (line.equals("2")) {
                workWithEllipse();
                selectFigure();
            }
            if (line.equals("3")) {
                workWithRectangle();
                selectFigure();
            }
            if (line.equals("4")) {
                workWithCircle();
                selectFigure();
            }
            if (line.equals("0")) {
                System.exit(0);
            }
        }
    }

    private Square initSquare() throws IOException {
        System.out.println("Введите длинну сторон: ");
        int a = Integer.parseInt(reader.readLine());
        Square square = new Square();
        square.setSideA(a);
        square.setSideB(a);
        square.setSideC(a);
        square.setSideD(a);
        return square;
    }

    private void workWithSquare() throws IOException {
        System.out.println("Выберите действие: ");
        System.out.println("1 -> Найти периметр");
        System.out.println("2 -> Найти площадь");
        System.out.println("0 -> Вернуться назад");

        String line = reader.readLine();

        while (line != null) {
            if (line.equals("1")) {
                squareCalculator = new SquareCalculator(initSquare());
                squareCalculator.calculatePerimeter();
                selectFigure();
            }
            if (line.equals("2")) {
                squareCalculator = new SquareCalculator(initSquare());
                squareCalculator.calculateArea();
                selectFigure();
            }
            if (line.equals("0")) {
                selectFigure();
            }
        }
    }

    private Ellipse initEllipse() throws IOException {
        System.out.println("Введите ось 1: ");
        int a = Integer.parseInt(reader.readLine());
        System.out.println("Введите ось 2: ");
        int b = Integer.parseInt(reader.readLine());
        Ellipse ellipse = new Ellipse();
        ellipse.setAxisA(a);
        ellipse.setAxisB(b);
        return ellipse;
    }

    private void workWithEllipse() throws IOException {
        System.out.println("Выберите действие: ");
        System.out.println("1 -> Найти периметр");
        System.out.println("2 -> Найти площадь");
        System.out.println("0 -> Вернуться назад");

        String line = reader.readLine();

        while (line != null) {
            if (line.equals("1")) {
                ellipseCalculator = new EllipseCalculator(initEllipse());
                ellipseCalculator.calculatePerimeter();
                selectFigure();
            }
            if (line.equals("2")) {
                ellipseCalculator = new EllipseCalculator(initEllipse());
                ellipseCalculator.calculateArea();
                selectFigure();
            }
            if (line.equals("0")) {
                selectFigure();
            }
        }
    }

    private Rectangle initRectangle() throws IOException {
        System.out.println("Введите первую сторону прямоугольника: ");
        int a = Integer.parseInt(reader.readLine());
        System.out.println("Введите вторую сторону прямоугольника: ");
        int b = Integer.parseInt(reader.readLine());

        if (a == b) {
            throw new RuntimeException("Прямоугольник не существует повторите");
        }

        Rectangle rectangle = new Rectangle();
        rectangle.setSideA(a);
        rectangle.setSideB(b);
        rectangle.setSideC(a);
        rectangle.setSideD(b);
        return rectangle;
    }

    private void workWithRectangle() throws IOException {
        System.out.println("Выберите действие: ");
        System.out.println("1 -> Найти периметр");
        System.out.println("2 -> Найти площадь");
        System.out.println("0 -> Вернуться назад");

        String line = reader.readLine();

        while (line != null) {
            if (line.equals("1")) {
                rectangleCalculator = new RectangleCalculator(initRectangle());
                rectangleCalculator.calculatePerimeter();
                selectFigure();
            }
            if (line.equals("2")) {
                rectangleCalculator = new RectangleCalculator(initRectangle());
                rectangleCalculator.calculateArea();
                selectFigure();
            }
            if (line.equals("0")) {
                selectFigure();
            }
        }
    }

    private Circle initCircle() throws IOException {
        System.out.println("Введите радиус круга: ");
        int r = Integer.parseInt(reader.readLine());
        Circle circle = new Circle();
        circle.setRadius(r);
        return circle;
    }

    private void workWithCircle() throws IOException {
        System.out.println("Выберите действие: ");
        System.out.println("1 -> Найти периметр");
        System.out.println("2 -> Найти площадь");
        System.out.println("0 -> Вернуться назад");

        String line = reader.readLine();

        while (line != null) {
            if (line.equals("1")) {
                circleCalculator = new CircleCalculator(initCircle());
                circleCalculator.calculatePerimeter();
                selectFigure();
            }
            if (line.equals("2")) {
                circleCalculator = new CircleCalculator(initCircle());
                circleCalculator.calculateArea();
                selectFigure();
            }
            if (line.equals("0")) {
                selectFigure();
            }
        }
    }


}
