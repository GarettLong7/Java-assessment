
/**
 * Write a description of class Booking here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Booking
{
    private String bookingId;
    private double hours;
    private Caregiver assignedCaregiver;
    
    public Booking (String bookingId, double hours, Caregiver assignedCaregiver) {
        this.bookingId = bookingId;
        this.hours = hours;
        this.assignedCaregiver = assignedCaregiver;
    }
    
    public Caregiver getAssignedCaregiver() {
        return assignedCaregiver;
    }
    
    public String getBookingId() {
        return bookingId;
    }
    
    public double getHours() {
        return hours;
    }
    
    public double calculateTotalFee() {
        return hours * assignedCaregiver.getHourlyRate();
    }
}