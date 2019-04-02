package pl.zzpj2019.solid.lsp.shape;

public class Circle extends Shape {

    private double r;

    public Circle(double radius)
    {
        this.r = radius;
    }

    @Override
    public void calculateField() {
        this.circuit = 2 * Math.PI * r;
    }

    @Override
    public void calculateCircuit() {
        this.circuit = Math.PI * r * r;
    }
}
