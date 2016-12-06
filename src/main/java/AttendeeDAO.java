import java.util.List;

public interface AttendeeDAO {
	
	public void persistAttendee(Attendee attendee);
	public List<Attendee> getAttendees();

}
