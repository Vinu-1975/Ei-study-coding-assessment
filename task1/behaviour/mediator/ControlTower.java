package task1.behaviour.mediator;

import java.util.ArrayList;
import java.util.List;

public class ControlTower {
    private List<Flight> flightsWaiting = new ArrayList<>();
    private boolean runwayAvailable = true;

    public void requestLanding(Flight flight) {
        if (runwayAvailable) {
            flight.land();
            runwayAvailable = false;
        } else {
            System.out.println("Runway not available for Flight " + flight.getFlightNumber());
            flightsWaiting.add(flight);
        }
    }

    public void runwayCleared() {
        runwayAvailable = true;
        if (!flightsWaiting.isEmpty()) {
            Flight flight = flightsWaiting.remove(0);
            flight.land();
            runwayAvailable = false;
        }
    }
}
