package pl.zzpj2019.solid.ocp.usa.solution;

public class Georgia extends State {

    Georgia() {
        speedLimit = 0;
        stateCode = "GA";
    }

    @Override
    public double calculateFine(double fine) {
        return 0;
    }
}
