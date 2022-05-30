package messages;

public class GradesAnnouncementEmailMessage {

	public String prepareMessage(String[] placeHolders) {
		placeHolders[0] = "abc";
		placeHolders[1] = "xyz";

		return placeHolders[1] + " " + placeHolders[0];
	}

	public boolean verifyGrades() {
		// code to verify Grades before announcement

		return true;
	}
}
