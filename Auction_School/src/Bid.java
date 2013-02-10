/**
 * A class that models an auction bid.
 * It contains a reference to the Person bidding and the amount bid.
 * 
 * @author David J. Barnes and Michael Kölling.
 * @version 2011.07.31
 */
public class Bid
{
    // The person making the bid.
    private final Person bidder;
    // The value of the bid. This could be a large number so
    // the long type has been used.
    private final long value;

    /**
     * Byder på et lot
     * @param bidder
     * @param value 
     */
    public Bid(Person bidder, long value)
    {
        this.bidder = bidder;
        this.value = value;
    }

    /**
     * Returnere personen
     * @return 
     */
    public Person getBidder()
    {
        return bidder;
    }

    /**
     * Returnere det højest budte
     * @return 
     */
    public long getValue()
    {
        return value;
    }
}
