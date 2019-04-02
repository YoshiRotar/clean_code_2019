package pl.zzpj2019.solid.ocp.usa.solution;

public class SouthCarolina extends State {

    public SouthCarolina() {
        speedLimit = 0;
        stateCode = "SU";
    }

    @Override
    public double calculateFine(double fine) {
        return 0;
    }
}
