package pl.zzpj2019.solid.ocp.usa.solution;

public class SpeedLimitFines {

    private State state;
    private double fine;

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public double calculateFineForState()
    {
        return state.calculateFine(fine);
    }
}
