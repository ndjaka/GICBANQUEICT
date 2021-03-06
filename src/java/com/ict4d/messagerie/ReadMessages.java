// ReadMessages.java - Sample application.
//
// This application shows you the basic procedure needed for reading
// SMS messages from your GSM modem, in synchronous mode.
//
// Operation description:
// The application setup the necessary objects and connects to the phone.
// As a first step, it reads all messages found in the phone.
// Then, it goes to sleep, allowing the asynchronous callback handlers to
// be called. Furthermore, for callback demonstration purposes, it responds
// to each received message with a "Got It!" reply.
//
// Tasks:
// 1) Setup Service object.
// 2) Setup one or more Gateway objects.
// 3) Attach Gateway objects to Service object.
// 4) Setup callback notifications.
// 5) Run

package com.ict4d.messagerie;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import javax.crypto.spec.SecretKeySpec;
import org.smslib.AGateway;
import org.smslib.AGateway.GatewayStatuses;
import org.smslib.AGateway.Protocols;
import org.smslib.ICallNotification;
import org.smslib.IGatewayStatusNotification;
import org.smslib.IInboundMessageNotification;
import org.smslib.IOrphanedMessageNotification;
import org.smslib.InboundMessage;
import org.smslib.InboundMessage.MessageClasses;
import org.smslib.Library;
import org.smslib.Message.MessageTypes;
import org.smslib.Service;
import org.smslib.crypto.AESKey;
import org.smslib.modem.SerialModemGateway;

public class ReadMessages
{
    
    String lastMessage=null;
        public String doIt(String numcom,int baud,String numSim) throws Exception
        {
                // Define a list which will hold the read messages.
                List<InboundMessage> msgList;
                // Create the notification callback method for inbound & status report
                // messages.
                InboundNotification inboundNotification = new InboundNotification();
                // Create the notification callback method for inbound voice calls.
                CallNotification callNotification = new CallNotification();
                //Create the notification callback method for gateway statuses.
                GatewayStatusNotification statusNotification = new GatewayStatusNotification();
                OrphanedMessageNotification orphanedMessageNotification = new OrphanedMessageNotification();
                try
                {
                        System.out.println("Example: Read messages from a serial gsm modem.");
                       
                      
                        // Create the Gateway representing the serial GSM modem.
                        SerialModemGateway gateway = new SerialModemGateway("modem."+numcom.toLowerCase().trim(), numcom.trim(),baud, "", "");
                        // Set the modem protocol to PDU (alternative is TEXT). PDU is the default, anyway...
                        gateway.setProtocol(Protocols.PDU);
                        // Do we want the Gateway to be used for Inbound messages?
                        gateway.setInbound(true);
                        // Do we want the Gateway to be used for Outbound messages?
                        gateway.setOutbound(true);
                        // Let SMSLib know which is the SIM PIN.
                        gateway.setSimPin("0000");
                        // Set up the notification methods.
                        Service.getInstance().setInboundMessageNotification(inboundNotification);
                        Service.getInstance().setCallNotification(callNotification);
                        Service.getInstance().setGatewayStatusNotification(statusNotification);
                        Service.getInstance().setOrphanedMessageNotification(orphanedMessageNotification);
                        // Add the Gateway to the Service object.
                        Service.getInstance().addGateway(gateway);
                       
                        Service.getInstance().startService();
                   
                        Service.getInstance().getKeyManager().registerKey(numSim.trim(), new AESKey(new SecretKeySpec("0011223344556677".getBytes(), "AES")));
                       
                        msgList = new ArrayList<InboundMessage>();
                        Service.getInstance().readMessages(msgList, MessageClasses.ALL);
                        for(int i=0;i<msgList.size();i++){
                                if(i==msgList.size()){
                                    System.out.println(msgList.get(msgList.size()).toString());
                                    lastMessage = msgList.get(msgList.size()).toString();
                                    break;
                                }
                        }
//                        for (InboundMessage msg : msgList)
//                                System.out.println(msg);
                       
                        System.out.println("Now Sleeping - Hit <enter> to stop service.");
                        System.in.read();
                       
                }
               
                catch (Exception e)
                {
                        e.printStackTrace();
                }
                finally
                {
                        Service.getInstance().stopService();
                }
                return lastMessage;
        }

        public class InboundNotification implements IInboundMessageNotification
        {
                public void process(AGateway gateway, MessageTypes msgType, InboundMessage msg)
                {
                        if (msgType == MessageTypes.INBOUND) {
                            
                            System.out.println(">>> New Inbound message detected from Gateway: " + gateway.getGatewayId());
                        System.out.println("samyan Qayyum Wahla "+ msg.getOriginator());
                        }
                        else if (msgType == MessageTypes.STATUSREPORT) System.out.println(">>> New Inbound Status Report message detected from Gateway: " + gateway.getGatewayId());
                        System.out.println(msg);
                }
        }

        public class CallNotification implements ICallNotification
        {
                public void process(AGateway gateway, String callerId)
                {
                        System.out.println(">>> New call detected from Gateway: " + gateway.getGatewayId() + " : " + callerId);
                }
        }

        public class GatewayStatusNotification implements IGatewayStatusNotification
        {
                public void process(AGateway gateway, GatewayStatuses oldStatus, GatewayStatuses newStatus)
                {
                        System.out.println(">>> Gateway Status change for " + gateway.getGatewayId() + ", OLD: " + oldStatus + " -> NEW: " + newStatus);
                }
        }

        public class OrphanedMessageNotification implements IOrphanedMessageNotification
        {
                public boolean process(AGateway gateway, InboundMessage msg)
                {
                        System.out.println(">>> Orphaned message part detected from " + gateway.getGatewayId());
                        System.out.println(msg);
                        // Since we are just testing, return FALSE and keep the orphaned message part.
                        return false;
                }
        }

        public static void main(String args[])
        {
                ReadMessages app = new ReadMessages();
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