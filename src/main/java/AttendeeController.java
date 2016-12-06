import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class AttendeeController implements Controller {

	private AttendeeService attendeeService;

	public AttendeeService getAttendeeService() {
		return attendeeService;
	}

	public void setAttendeeService(AttendeeService attendeeService) {
		this.attendeeService = attendeeService;
	}

	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HashMap<String, Object> map = new HashMap<String, Object>();

		map.put("attendees", attendeeService.getAttendees());

		return new ModelAndView("attendee", map);
	}
	
}
