package pl.zzpj2019.solid.ocp.usa.solution;

public class Alabama extends State {
    Alabama() {

        speedLimit = 0;
        stateCode = "AL";
    }

    @Override
    public double calculateFine(double fine) {
        return 0;
    }
}
