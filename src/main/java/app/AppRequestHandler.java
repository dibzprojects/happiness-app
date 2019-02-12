package app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import model.Event;
import model.HappinessIndex;
import model.Participant;

public class AppRequestHandler {

	public static void main(String args[]) {

		System.out.println("Initializing the Spring Context...");

		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-context.xml");
		
		Participant participant = (Participant) ctx.getBean(Participant.class);
		participant.setPseudoName("Dibyendu");
		
		Event event = (Event) ctx.getBean(Event.class);
		event.setEventName("Sprint 74");

		HappinessIndex happinessIndex = (HappinessIndex) ctx.getBean(HappinessIndex.class);
		happinessIndex.setHappyScore(8);
		happinessIndex.setSadScore(9);
		
		System.out.println(happinessIndex.showHappinessIndex());
		

	}

}
