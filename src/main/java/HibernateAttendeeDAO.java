

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;


public class HibernateAttendeeDAO implements AttendeeDAO {

	HibernateTemplate hibernateTemplate;
	
	public HibernateAttendeeDAO(SessionFactory sessionFactory) {
		hibernateTemplate = new HibernateTemplate(sessionFactory) {
		};
	}
	
	public List<Attendee> getAttendees() {
		// TODO Auto-generated method stub
		//return null;
		return hibernateTemplate.find("from Attendee");
	}
	
	public void persistAttendee(Attendee attendee) {
		// TODO Auto-generated method stub
		
	}
	
	
	//populate with data
	public void populate(){
		hibernateTemplate.save(new Attendee("Andrew"));
	}
	
}
