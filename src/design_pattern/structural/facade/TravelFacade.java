package design_pattern.structural.facade;

public class TravelFacade{

    private BookingInterface flightBooking;
    private BookingInterface trainBooking;
    private BookingInterface hotelBooking;

    enum BookingType {
        Flight,Train,Hotel,Flight_And_Hotel,Train_And_Hotel
    }

    public TravelFacade(){
        flightBooking = new FlightBooking();
        trainBooking = new TrainBooking();
        hotelBooking = new HotelBooking();        
    }

    public void book(BookingType type, BookingInfo info){
        switch(type){
            case Flight:
                // book flight;
                flightBooking.book(info);
                break;
            case Hotel:
                // book hotel;
                hotelBooking.book(info);
                break;
            case Train:
                // book Train;
                trainBooking.book(info);
                break;
            case Flight_And_Hotel:
                // book Flight and Hotel
                flightBooking.book(info);
                hotelBooking.book(info);
                break;
             case Train_And_Hotel:
                // book Train and Hotel
                trainBooking.book(info);
                hotelBooking.book(info);
                 break;
        }
    }
}