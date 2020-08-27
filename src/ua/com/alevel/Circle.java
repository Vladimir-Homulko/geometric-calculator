package ua.com.alevel;

public class Circle {

    private int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        if (radius <= 0) {
            throw new RuntimeException("Радиус круга не может быть меньше 0.");
        }
        this.radius = radius;
    }
}
