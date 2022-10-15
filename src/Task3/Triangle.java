package Task3;

public class Triangle {
    private int sideA;
    private int sideB;
    private int sideC;

    public Triangle(int sideA, int sideB, int sideC) {
        if (sideA + sideB < sideC || sideA + sideC < sideB || sideB + sideC < sideA){
            throw new IllegalArgumentException("Нельзя построить треугольник!!!");
        }
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        System.out.println("Треугольник построен.");
    }

    public int getSideA() {
        return sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public int getSideC() {
        return sideC;
    }
}
