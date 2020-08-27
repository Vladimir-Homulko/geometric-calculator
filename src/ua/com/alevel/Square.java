package ua.com.alevel;

public class Square {

    private int sideA;
    private int sideB;
    private int sideC;
    private int sideD;

    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        if (sideA <= 0) {
            throw new RuntimeException("Строна квадрата не может быть меньше 0.");
        }
        this.sideA = sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        if (sideA <= 0) {
            throw new RuntimeException("Строна квадрата не может быть меньше 0.");
        }
        this.sideB = sideB;
    }

    public int getSideC() {
        return sideC;
    }

    public void setSideC(int sideC) {
        if (sideA <= 0) {
            throw new RuntimeException("Строна квадрата не может быть меньше 0.");
        }
        this.sideC = sideC;
    }

    public int getSideD() {
        return sideD;
    }

    public void setSideD(int sideD) {
        if (sideA <= 0) {
            throw new RuntimeException("Строна квадрата не может быть меньше 0.");
        }
        this.sideD = sideD;
    }
}
