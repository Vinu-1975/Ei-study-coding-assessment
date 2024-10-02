package task1.behaviour.mediator;

public class AirportTrafficControl {
    public static void main(String[] args) {
        ControlTower controlTower = new ControlTower();
        Flight flight1 = new Flight(controlTower, "AA123");
        Flight flight2 = new Flight(controlTower, "BB456");

        flight1.requestLanding();
        flight2.requestLanding();
        controlTower.runwayCleared();
        controlTower.runwayCleared();
    }
}
