package com.dkdf.cableway.core;

import com.dkdf.cableway.newstaff.Cableway;
import com.dkdf.cableway.newstaff.CablewayMain;

import com.dkdf.cableway.oldstuff.Definitions;
import com.dkdf.cableway.timers.myTimers.TimerOneSecondSchedule;

import java.util.Timer;
import java.util.TimerTask;

public class DeviceManager
{
	private Cableway[] devices;

    Timer timerOneSecond;
    TimerTask timerOneSecondTask;

    public final static long timerOneSecondStartTime = 1;
    public final static long timerOneSecondPeriod = 1000;

	DeviceManager()
	{
		devices[Definitions.PORT_1] = new CablewayMain();
		devices[Definitions.PORT_2] = new CablewayMain();
	}

    public void timerEventProcedure()
    {
        timerOneSecond = new Timer();
        timerOneSecondTask = new TimerOneSecondSchedule(devices);
        timerOneSecond.schedule(timerOneSecondTask, timerOneSecondStartTime, timerOneSecondPeriod);
    }
}