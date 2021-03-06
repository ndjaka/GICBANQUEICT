/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ict4d.messagerie;

//import flashsms.systemGestion.SystemGestionSms;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Enumeration;
import java.util.Formatter;
import org.smslib.helper.CommPortIdentifier;
import org.smslib.helper.SerialPort;

/**
 *
 * @author Tsafack
 */
public class TestPort {
    
    private static final String _NO_DEVICE_FOUND = "  no device found";

	private final static Formatter _formatter = new Formatter(System.out);

	static CommPortIdentifier portId;

	static Enumeration<CommPortIdentifier> portList;

	static int bauds[] = { 9600, 14400, 19200, 28800, 33600, 38400, 56000, 57600, 115200 };

	/**
	 * Wrapper around {@link CommPortIdentifier#getPortIdentifiers()} to be
	 * avoid unchecked warnings.
	 */
	private static Enumeration<CommPortIdentifier> getCleanPortIdentifiers()
	{
		return CommPortIdentifier.getPortIdentifiers();
	}
//public SystemGestionSms sgs = new SystemGestionSms();
	public String[] mainTest()
	{
            boolean okPort = true; //est vrai lorsque le port a ete detect�
            boolean okFreq = false;//est vrai lorsque le port a ete detect� pour avoir l'ens des freque valide
            String[] port_freq = new String[10];
		System.out.println("\nSearching for devices...");
		portList = getCleanPortIdentifiers();
		while (portList.hasMoreElements())
		{
			portId = portList.nextElement();
			if (portId.getPortType() == CommPortIdentifier.PORT_SERIAL)
			{
				_formatter.format("%nFound port: %-5s%n", portId.getName());
				for (int i = 0; i < bauds.length; i++)
				{
					SerialPort serialPort = null;
					_formatter.format("       Trying at %6d...", bauds[i]);
					try
					{
						InputStream inStream;
						OutputStream outStream;
						int c;
						String response;
						serialPort = portId.open("SMSLibCommTester", 1971);
						serialPort.setFlowControlMode(SerialPort.FLOWCONTROL_RTSCTS_IN);
						serialPort.setSerialPortParams(bauds[i], SerialPort.DATABITS_8, SerialPort.STOPBITS_1, SerialPort.PARITY_NONE);
						inStream = serialPort.getInputStream();
						outStream = serialPort.getOutputStream();
						serialPort.enableReceiveTimeout(1000);
						c = inStream.read();
						while (c != -1)
							c = inStream.read();
						outStream.write('A');
						outStream.write('T');
						outStream.write('\r');
						Thread.sleep(1000);
						response = "";
						StringBuilder sb = new StringBuilder();
						c = inStream.read();
						while (c != -1)
						{
							sb.append((char) c);
							c = inStream.read();
						}
						response = sb.toString();
						if (response.indexOf("OK") >= 0)
						{
                                                    if(okPort){//si le port est valide
                                                        port_freq[0] = portId.getName();//on recupere le port
                                                      //  sgs.parametres[0] = portId.getName();
                                                        okPort = false;//on met a false pour ne plus changer le port
                                                        okFreq = true;//on met a true pour pouvoir selectionner l'ens des freq valide parmis les 9
                                                    }
							try
							{
								System.out.print("  Getting Info...");
								outStream.write('A');
								outStream.write('T');
								outStream.write('+');
								outStream.write('C');
								outStream.write('G');
								outStream.write('M');
								outStream.write('M');
								outStream.write('\r');
								response = "";
								c = inStream.read();
								while (c != -1)
								{
									response += (char) c;
									c = inStream.read();
								}
								System.out.println(" Found: " + response.replaceAll("\\s+OK\\s+", "").replaceAll("\n", "").replaceAll("\r", ""));
                                                                if(okFreq){ //est vrai pour selectionner les frequences vaides du port selectionn�
                                                                    port_freq[i+1] = ""+bauds[i];//on selectionne les freqences valides
                                                                    //idem pour recuperer les frequences
                                                                    if(okPort){
                                                                       // sgs.parametres[1] = ""+bauds[i];
                                                                    }
                                                                }
							}
							catch (Exception e)
							{
								System.out.println(_NO_DEVICE_FOUND);
                                                                if(okFreq){
                                                                    port_freq[i+1] = "";//on met a null pour les frequences non valides
                                                                }
                                                                
							}
						}
						else
						{
							System.out.println(_NO_DEVICE_FOUND);
						}
					}
					catch (Exception e)
					{
						System.out.print(_NO_DEVICE_FOUND);
						Throwable cause = e;
						while (cause.getCause() != null)
						{
							cause = cause.getCause();
						}
						System.out.println(" (" + cause.getMessage() + ")");
					}
					finally
					{
						if (serialPort != null)
						{
							serialPort.close();
						}
					}
				}
                                okFreq = false;//on met a null pour ne pas modifier les parametres obtenues
			}
		}
		System.out.println("\nTest complete.");
                return port_freq;//le port est a l'indice 0 et les frequences suivent
	}
        public static void main(String args[])
	{
		//SendMessage app = new SendMessage();
            TestPort port = new TestPort();
		try
		{
                   // System.out.println( "port..."+ port.mainTest()[0]);
                    System.out.println( "frequence.."+ port.mainTest()[1]+"port..."+ port.mainTest()[0]);
                    
                   
			//app.doIt();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}
