package gateways;

import messages.DailyNewsEmailMessage;
import messages.GradesAnnouncementEmailMessage;
import messages.TaskAddedEmailMessage;

public class EmailGateway extends Gateways {

	public void sendMessage(Object message, String user) {
		String[] placeHolders = new String[] {}; // set some place holders here

		if (message instanceof DailyNewsEmailMessage) {
			DailyNewsEmailMessage dailyNewsEmailMessage = (DailyNewsEmailMessage) message;

			dailyNewsEmailMessage.prepareMessage(placeHolders);

			// some code to send message
		}

		else if (message instanceof GradesAnnouncementEmailMessage) {
			GradesAnnouncementEmailMessage announcementEmailMessage = (GradesAnnouncementEmailMessage) message;

			announcementEmailMessage.prepareMessage(placeHolders);

			// some code to send message
		}

		else if (message instanceof TaskAddedEmailMessage) {
			TaskAddedEmailMessage addedEmailMessage = (TaskAddedEmailMessage) message;

			addedEmailMessage.prepareMessage(placeHolders);

			// some code to send message by email to user
		}

	}
}
