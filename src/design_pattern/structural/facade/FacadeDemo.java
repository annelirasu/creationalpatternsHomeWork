package design_pattern.structural.facade;

import java.util.ArrayList;
import java.util.List;

public class FacadeDemo {
    public static void main(String[] args) {
        TravelFacade travelFacade = new TravelFacade();
        BookingInfo bookingInfo =  new BookingInfo();
        bookingInfo.setDestination("Tallinn");
        bookingInfo.setSource("Tartu");
        PersonInfo personInfo =  new PersonInfo();
        personInfo.setName("Alex");
        personInfo.setAge(30);

        travelFacade.book(TravelFacade.BookingType.Hotel,bookingInfo);
        travelFacade.book(TravelFacade.BookingType.Train_And_Hotel,bookingInfo);
    }
}
