package pl.zzpj2019.solid.lsp.shape;

public abstract class Shape {

    protected double field;
    protected double circuit;

    public double getField() {
        return field;
    }

    public double getCircuit() {
        return circuit;
    }

    public abstract void calculateField();
    public abstract void calculateCircuit();
}
