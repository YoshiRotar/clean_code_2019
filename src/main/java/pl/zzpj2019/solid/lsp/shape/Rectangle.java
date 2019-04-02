package pl.zzpj2019.solid.lsp.shape;

public class Rectangle extends Shape {

    protected double a;
    protected double b;

    public Rectangle(double firstSide, double secondSide) {
        this.a = firstSide;
        this.b = secondSide;
    }

    @Override
    public void calculateField() {
        this.field = a * b;
    }

    @Override
    public void calculateCircuit() {
        this.circuit = 2 * a + 2 * b;
    }
}
