package pl.zzpj2019.solid.ocp.usa.solution;

public abstract class State {

    protected int speedLimit;
    protected String stateCode;

    public int getSpeedLimit() {
        return speedLimit;
    }

    public String getStateCode() {
        return stateCode;
    }

    public abstract double calculateFine(double fine);
}
