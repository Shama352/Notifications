package messages;

public class DailyNewsMobileMessage {

	public String prepareMessage(String[] placeHolders) {
		placeHolders[0] = "abc";
		placeHolders[1] = "xyz";

		return placeHolders[1] + " " + placeHolders[0];
	}
}
