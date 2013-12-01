package com.dkdf.cableway.timers.myTimers;

/**
 * Created with IntelliJ IDEA.
 * User: Дмитрий
 * Date: 23.11.13
 * Time: 19:13
 * To change this template use File | Settings | File Templates.
 */

import java.util.Calendar;
import java.util.TimerTask;

import com.dkdf.cableway.newstaff.Cableway;

public class TimerOneSecondSchedule extends TimerTask
{
    private Cableway[] devices;
    private Calendar dateNow;

    public final static long timerOneSecondStartTime = 1;
    public final static long timerOneSecondPeriod = 1000;

    public TimerOneSecondSchedule() {}

    public TimerOneSecondSchedule(Cableway[] devices)
    {
        this.devices = devices;
        dateNow = Calendar.getInstance();
    }

    @Override
    public void run()
    {
        if (dateNow.get(Calendar.MINUTE) == 0 && dateNow.get(Calendar.SECOND) == 0)
        {
            //FileController::CopyFilesToArchive();
        }

        /*
        myCounter++;                                // display timer counter in MainWindow title
		flagInvalidate = true;                      // check in MainWindow to invalidate it
         */

        for (Cableway cableway : devices)
        {
            if (cableway.isWorking())                // FlagWorkCableWay
            {
                cableway.checkTimeLeft();
            }
        }
    }
}