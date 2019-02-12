package model;

public class Event {

	private String eventName;
	
	

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}



	public String getEventName() {

		if (eventName != null)
			return eventName;
		else
			return "Event is not setup";
	}

}
