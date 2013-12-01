package com.dkdf.cableway.database.testSerialization;

import java.util.Date;
import java.io.*;
/**
 * Created with IntelliJ IDEA.
 * User: corparmstrong
 * Date: 09.11.13
 * Time: 19:35
 * To change this template use File | Settings | File Templates.
 */
public class Alien implements Serializable
{
    private String name;
    private String login;
    private transient String password;
    private Date date;

    public Alien(String name, String login, String password, Date date)
    {
        this.name = name;
        this.login = login;
        this.password = password;
        this.date = date;
    }

    public void showInfo()
    {
        System.out.println("I'm " + name);
        System.out.println("Login: " + login);
        System.out.println("Password: " + password);
        System.out.println("Date: " + date);
    }
}