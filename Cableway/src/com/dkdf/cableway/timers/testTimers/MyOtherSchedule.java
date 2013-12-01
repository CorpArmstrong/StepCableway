package com.dkdf.cableway.timers.testTimers;

import java.util.TimerTask;

public class MyOtherSchedule extends TimerTask		// 3000 msec
{
	@Override
	public void run()
	{
		System.out.println("timer3000 working 3000ms");
	}
}