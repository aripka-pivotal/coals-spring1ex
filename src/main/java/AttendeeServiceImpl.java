import java.util.ArrayList;
import java.util.List;

public class AttendeeServiceImpl implements AttendeeService {

	private AttendeeDAO attendeeDAO;
	
	public List<Attendee> getAttendees() {
		//ArrayList<Attendee> attendees = new ArrayList<Attendee>();
		//attendees.add(new Attendee("andrew"));
		
		return attendeeDAO.getAttendees();
		//return attendees;
		
		
	}

	public AttendeeDAO getAttendeeDAO() {
		return attendeeDAO;
	}

	public void setAttendeeDAO(AttendeeDAO attendeeDAO) {
		this.attendeeDAO = attendeeDAO;
	}
	

}
