package Gateways;

import Messages.DailyNewsEmailMessage;

public abstract class Gateways 
{
	public abstract void sendMessage(Object message, String user);
	

}
