package design_pattern.structural.facade;

class FlightBooking implements BookingInterface{

    @Override
    public void book(BookingInfo info){
        System.out.println("Flight booked");
    }
}
