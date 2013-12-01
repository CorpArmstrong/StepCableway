package com.dkdf.cableway.rfid;

import gnu.io.*;

import java.io.*;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.TooManyListenersException;

// 

/**
 * Created with IntelliJ IDEA.
 * User: Дмитрий
 * Date: 30.11.13
 * Time: 20:02
 * To change this template use File | Settings | File Templates.
 */
public class RxTxTest
{
    static CommPortIdentifier com1;

    final static int TIMEOUT = 2000;                    // the timeout value for connecting with the port
    //final static int NEW_LINE_ASCII = 10;

    SerialPort port1 = null;
    CommPort commPort = null;

    List<String> comList = new ArrayList<String>();

    InputStream inputStream;
    OutputStream outputStream;

    public boolean checkPorts()
    {
        boolean result = false;

        Enumeration ports = CommPortIdentifier.getPortIdentifiers();

        while(ports.hasMoreElements())
        {
            CommPortIdentifier portId = (CommPortIdentifier) ports.nextElement();

            if (portId.getPortType() == CommPortIdentifier.PORT_SERIAL)
            {
                System.out.println(portId.getName());
                comList.add(portId.getName());
            }
        }

        try
        {
            if (comList.isEmpty())
            {
                throw new Exception("No fucking ports available");
            }
            else
            {
                result = true;
                com1 = CommPortIdentifier.getPortIdentifier(comList.get(0));
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        return result;
    }

    public void createPort()
    {
        try
        {
            commPort = com1.open("MyPort1", TIMEOUT);
            port1 = (SerialPort) commPort;

            System.out.println("Initialising com1 port..");
        }
        catch (PortInUseException e)
        {
            e.printStackTrace();
        }

        //port1 = new MyOwnComPort();

        try
        {
            port1.setDTR(true);
            port1.setRTS(true);

            // utf-8 encoding is used by default!
            //port1.disableReceiveTimeout();
            port1.enableReceiveThreshold(0);
            port1.enableReceiveTimeout(5000);

            port1.setSerialPortParams(9600, SerialPort.DATABITS_8, SerialPort.STOPBITS_1, SerialPort.PARITY_NONE);
        }
        catch (UnsupportedCommOperationException e)
        {
            e.printStackTrace();
        }
    }

    public synchronized void sendData(String str)
    {
        try
        {
            outputStream = port1.getOutputStream();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));

        try
        {
            bufferedWriter.write(str);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        try
        {
            bufferedWriter.flush();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public synchronized void readData()
    {
        try
        {
            inputStream = port1.getInputStream();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        //InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        //inputStreamReader.getEncoding();

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

        try
        {
            /*
            byte[] readBuffer = new byte[400];
            int availableBytes = inputStream.available();

            while ((myStr = bufferedReader.readLine()) != null)
            {
                System.out.println(myStr);
                //System.out.println("Available bytes: " + availableBytes);
                // Read the serial port
                //inputStream.read(readBuffer, 0, availableBytes);

                // Print it out
                //System.out.println(new String(readBuffer, 0, availableBytes));
            }
            */

            byte singleData;

            boolean finished = false;

            StringBuilder stringBuilder = new StringBuilder();
            String myStr;

            while (!finished)
            {
                singleData = (byte) inputStream.read();

                if (singleData != -1)
                {
                    System.out.println("Reading " + singleData);
                    stringBuilder.append(singleData);
                }
                else
                {
                    myStr = stringBuilder.toString();
                    System.out.println("My string: " + myStr);

                    finished = true;
                }
            }

            /*
            String logText = "";

            if (singleData != NEW_LINE_ASCII)
            {
                logText = new String(new byte[] {singleData});
                System.out.println(logText);
            }
            else
            {
                System.out.println("Error reading data from com-port!");
            }
            */
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    /*
    public void DiscardBuffer()
    {
        port1.setInputBufferSize(0);
        port1.setOutputBufferSize(0);
    }
    */

    public void closePort()
    {
        port1.close();
        System.out.println("Port closed");
    }

    public static void main(String[] args)
    {
        try
        {
            RxTxTest rxTxTest = new RxTxTest();

            if (rxTxTest.checkPorts())
            {
                rxTxTest.createPort();
                rxTxTest.sendData("Hello World!");
                rxTxTest.readData();
                rxTxTest.closePort();
            }
            else
            {
                System.out.println("No ports available!");
            }

        }
        catch (Exception e)
        {
            e.getLocalizedMessage();
            e.printStackTrace();
        }
    }
}