package EventSubsystem;

import CustomerSubsystem.Driver;
import RideSubsystem.Offer;

public class MakeOfferEvent extends Event {
    public MakeOfferEvent(Driver driver, Offer offer) {
        setName(EventName.addedPrice);
        addAttribute("Time", IDateTime.getInstance().getDateTime());
        addAttribute("Driver Name", driver.getUsername());
        addAttribute("Offered Price", Double.toString(offer.getPrice()));
    }
}
