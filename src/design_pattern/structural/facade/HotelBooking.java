package design_pattern.structural.facade;

class HotelBooking implements BookingInterface{
    @Override
    public void book(BookingInfo info){
        System.out.println("Hotel booked");
    }
}
