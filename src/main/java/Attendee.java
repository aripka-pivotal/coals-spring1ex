import java.io.Serializable;

public class Attendee implements Serializable{

	private String name;
	
	private long id;
	
	public Attendee(){
		
	}
	
	public Attendee(String name){
		this.name=name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	
	
}
