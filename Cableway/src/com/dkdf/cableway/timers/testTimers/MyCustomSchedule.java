package com.dkdf.cableway.timers.testTimers;

import java.util.TimerTask;

public class MyCustomSchedule extends TimerTask		// 5000 msec
{
	@Override
	public void run()
	{
		System.out.println("timer5000 working 5000ms");
	}
}