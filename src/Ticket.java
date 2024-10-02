public class Ticket {
    private String id; // max 4 digits and/or chars
    private String concertHall; // max 10 chars
    private int eventCode; // 3 digits
    private long time; // Unix timestamp
    private boolean isPromo; // is this event a promotion or not
    private char stadiumSector; // from 'A' to 'C'
    private double maxAllowedBackpackWeight; // in kg with grams precision

    // Default constructor (empty ticket)
    public Ticket() {
        this.id = "";
        this.concertHall = "";
        this.eventCode = 0;
        this.time = System.currentTimeMillis() / 1000; // convert to Unix timestamp
        this.isPromo = false;
        this.stadiumSector = ' ';
        this.maxAllowedBackpackWeight = 0.0;
    }

    // Constructor with all parameters (full ticket)
    public Ticket(String id, String concertHall, int eventCode, long time, boolean isPromo, char stadiumSector, double maxAllowedBackpackWeight) {
        this.id = id;
        this.concertHall = concertHall;
        this.eventCode = eventCode;
        this.time = time;
        this.isPromo = isPromo;
        this.stadiumSector = stadiumSector;
        this.maxAllowedBackpackWeight = maxAllowedBackpackWeight;
    }

    // Constructor with limited parameters (limited ticket)
    public Ticket(String concertHall, int eventCode, long time) {
        this.concertHall = concertHall;
        this.eventCode = eventCode;
        this.time = time;
        this.id = ""; // default id
        this.isPromo = false; // default isPromo
        this.stadiumSector = ' '; // default stadiumSector
        this.maxAllowedBackpackWeight = 0.0; // default maxAllowedBackpackWeight
    }

    // Getters and setters for each field
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getConcertHall() {
        return concertHall;
    }

    public void setConcertHall(String concertHall) {
        this.concertHall = concertHall;
    }

    public int getEventCode() {
        return eventCode;
    }

    public void setEventCode(int eventCode) {
        this.eventCode = eventCode;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public boolean isPromo() {
        return isPromo;
    }

    public void setPromo(boolean promo) {
        isPromo = promo;
    }

    public char getStadiumSector() {
        return stadiumSector;
    }

    public void setStadiumSector(char stadiumSector) {
        this.stadiumSector = stadiumSector;
    }

    public double getMaxAllowedBackpackWeight() {
        return maxAllowedBackpackWeight;
    }

    public void setMaxAllowedBackpackWeight(double maxAllowedBackpackWeight) {
        this.maxAllowedBackpackWeight = maxAllowedBackpackWeight;
    }


}
