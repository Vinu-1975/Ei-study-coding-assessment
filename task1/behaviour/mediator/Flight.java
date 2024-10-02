package task1.behaviour.mediator;

public class Flight {
    private ControlTower controlTower;
    private String flightNumber;

    public Flight(ControlTower controlTower, String flightNumber) {
        this.controlTower = controlTower;
        this.flightNumber = flightNumber;
    }

    public void requestLanding() {
        controlTower.requestLanding(this);
    }

    public void land() {
        System.out.println("Flight " + flightNumber + " landing.");
    }

    public String getFlightNumber() {
        return flightNumber;
    }
}
