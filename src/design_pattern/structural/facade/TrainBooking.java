package design_pattern.structural.facade;

class TrainBooking implements BookingInterface{
    @Override
    public void book(BookingInfo info){
        System.out.println("Train booked");
    }
}
