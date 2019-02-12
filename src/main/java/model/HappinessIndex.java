package model;

public class HappinessIndex {

	private Participant participant;
	private int happyScore;
	private int sadScore;
	private Event eventName;

	public String showHappinessIndex() {
		return "Participant " + participant.getPseudoName() + " has marked Happy as " + happyScore + " and Sad as "
				+ sadScore + " for Event " + eventName.getEventName();
	}

	public void setHappyScore(int happyScore) {
		this.happyScore = happyScore;
	}

	public void setSadScore(int sadScore) {
		this.sadScore = sadScore;
	}

	public void setParticipant(Participant participant1) {
		this.participant = participant1;
	}

	public void setEventName(Event eventName) {
		this.eventName = eventName;
	}

}
