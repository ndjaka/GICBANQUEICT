// SendMessage.java - Sample application.
//
// This application shows you the basic procedure for sending messages.
// You will find how to send synchronous and asynchronous messages.
//
// For asynchronous dispatch, the example application sets a callback
// notification, to see what's happened with messages.

package com.ict4d.messagerie;

import org.smslib.AGateway;
import org.smslib.IOutboundMessageNotification;
import org.smslib.Library;
import org.smslib.OutboundMessage;
import org.smslib.Service;
import org.smslib.modem.SerialModemGateway;

public class SendMessage
{
	public void doIt(String numcom,int baud,String message,String number,String numSinm) throws Exception
	{
		OutboundNotification outboundNotification = new OutboundNotification();
		System.out.println("Envoie du message.");
		//System.out.println(Library.getLibraryDescription());
		//System.out.println("Version: " + Library.getLibraryVersion());
		SerialModemGateway gateway = new SerialModemGateway("modem."+numcom.toLowerCase().trim(), numcom.trim(), baud, "", "");
		gateway.setInbound(true);
		gateway.setOutbound(true);
		gateway.setSimPin("0000");
		
		gateway.setSmscNumber(numSinm.trim());
		Service.getInstance().setOutboundMessageNotification(outboundNotification);
		Service.getInstance().addGateway(gateway);
		Service.getInstance().startService();
		System.out.println();
//	
		
		// Send a message synchronously.
		OutboundMessage msg = new OutboundMessage(number.trim(), message);
		Service.getInstance().sendMessage(msg);
		System.out.println(msg);
		
		System.out.println("Now Sleeping - Hit <enter> to terminate.");
		System.in.read();
		Service.getInstance().stopService();
                System.err.println(".....................service fermee.....................................");
	}

	public class OutboundNotification implements IOutboundMessageNotification
	{
		public void process(AGateway gateway, OutboundMessage msg)
		{
			System.out.println("Outbound handler called from Gateway: " + gateway.getGatewayId());
			System.out.println(msg);
		}
	}

	public static void main(String args[])
	{
		SendMessage app = new SendMessage();
		try
		{
			//app.doIt();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}
