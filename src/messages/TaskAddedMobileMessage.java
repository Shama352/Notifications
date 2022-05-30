package messages;

public class TaskAddedMobileMessage {

	public String prepareMessage(String[] placeHolders) {
		placeHolders[0] = "abc";
		placeHolders[1] = "xyz";

		return placeHolders[1] + " " + placeHolders[0];
	}

	public void addTeamDescription() {
		// code to add team description
	}
}
