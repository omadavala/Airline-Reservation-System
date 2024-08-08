import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Flight {
    private String flightNumber;
    private String destination;
    private String departureTime;
    private int availableSeats;

    public Flight(String flightNumber, String destination, String departureTime, int availableSeats) {
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureTime = departureTime;
        this.availableSeats = availableSeats;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public void bookSeat() {
        if (availableSeats > 0) {
            availableSeats--;
        } else {
            System.out.println("No available seats");
        }
    }

    @Override
    public String toString() {
        return "Flight " + flightNumber + " to " + destination + " departs at " + departureTime + ". Available seats: " + availableSeats;
    }
}

class Booking {
    private String passengerName;
    private String flightNumber;
    private String seatNumber;

    public Booking(String passengerName, String flightNumber, String seatNumber) {
        this.passengerName = passengerName;
        this.flightNumber = flightNumber;
        this.seatNumber = seatNumber;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    @Override
    public String toString() {
        return "Booking: " + passengerName + " on flight " + flightNumber + " with seat " + seatNumber;
    }
}

class AirlineReservationSystem {
    private Map<String, Flight> flights = new HashMap<>();
    private List<Booking> bookings = new ArrayList<>();

    public void addFlight(Flight flight) {
        flights.put(flight.getFlightNumber(), flight);
    }

    public void bookFlight(String passengerName, String flightNumber, String seatNumber) {
        Flight flight = flights.get(flightNumber);
        if (flight != null && flight.getAvailableSeats() > 0) {
            flight.bookSeat();
            bookings.add(new Booking(passengerName, flightNumber, seatNumber));
            System.out.println("Booking successful!");
        } else {
            System.out.println("Flight not available or no seats left.");
        }
    }

    public void listFlights() {
        for (Flight flight : flights.values()) {
            System.out.println(flight);
        }
    }

    public void listBookings() {
        for (Booking booking : bookings) {
            System.out.println(booking);
        }
    }

    public static void main(String[] args) {
        AirlineReservationSystem system = new AirlineReservationSystem();
        Flight flight1 = new Flight("AA123", "New York", "2024-08-15 10:00", 100);
        Flight flight2 = new Flight("BB456", "Los Angeles", "2024-08-16 15:00", 50);

        system.addFlight(flight1);
        system.addFlight(flight2);

        system.listFlights();
        system.bookFlight("John Doe", "AA123", "12A");
        system.listBookings();
    }
}
