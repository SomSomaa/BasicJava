package be03.som_soma.Model;

import java.time.LocalDate;

public class Flight extends Booking {
    private String flightNumber;
    private String destination;
    private String fromWhere;

    public Flight(int bookingId, LocalDate startDate, LocalDate endDate, String flightNumber, String destination,
            String fromWhere) {
        super(bookingId, startDate, endDate);
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.fromWhere = fromWhere;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getFromWhere() {
        return fromWhere;
    }

    public void setFromWhere(String fromWhere) {
        this.fromWhere = fromWhere;
    }

    @Override
    public void reserve() {
        System.out.println("Az utazás sikeresen lefoglalva, innen: " + fromWhere + " \n     ide: " + destination);

    }

}
