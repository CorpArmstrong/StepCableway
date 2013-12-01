package com.dkdf.cableway.database.testSerialization;

import com.dkdf.cableway.database.testSerialization.Alien;

import java.io.*;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: corparmstrong
 * Date: 09.11.13
 * Time: 19:34
 * To change this template use File | Settings | File Templates.
 */
public class TestSerialization
{
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Alien alien = new Alien("Grey Alien", "fox", "moulder", new Date());
        alien.showInfo();

        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("xfile"));
        out.writeObject(alien);
        out.flush();
        out.close();

        try
        {
            Thread.sleep(1500);
        }
        catch (InterruptedException ex) { System.out.println("Fucking sleep exception");}

        ObjectInputStream in = new ObjectInputStream(new FileInputStream("xfile"));

        Alien tempAlien = (Alien) in.readObject();
        tempAlien.showInfo();
    }
}
