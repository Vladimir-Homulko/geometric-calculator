package ua.com.alevel;

public class Ellipse {

    private int axisA;
    private int axisB;

    public int getAxisA() {
        return axisA;
    }

    public void setAxisA(int axisA) {
        if (axisA <= 0) {
            throw new RuntimeException("Ось эллипса не может быть меньше 0");
        }
        this.axisA = axisA;
    }

    public int getAxisB() {
        return axisB;
    }

    public void setAxisB(int axisB) {
        if (axisA <= 0) {
            throw new RuntimeException("Ось эллипса не может быть меньше 0");
        }
        this.axisB = axisB;
    }
}
