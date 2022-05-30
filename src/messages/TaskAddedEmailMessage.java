package messages;

public class TaskAddedEmailMessage {

	public String prepareMessage(String[] placeHolders) {
		// code to replace place holders of this type
		placeHolders[0] = "abc";
		placeHolders[1] = "xyz";

		return placeHolders[1] + " " + placeHolders[0];
	}

	public void addTeamDescription() {
		// code to add team description
	}
}
