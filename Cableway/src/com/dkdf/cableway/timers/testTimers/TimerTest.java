package com.dkdf.cableway.timers.testTimers;

import java.util.TimerTask;
import java.util.Timer;

public class TimerTest
{
	public final static long startTimer = 1;						// time before start
	public final static long delayTimer = 5000;						// timer delay tick
	
	public final static long startTimer2 = 5;
	public final static long delayTimer2 = 3000;
	
	public static void main(String[] args)
	{
		Timer timer = new Timer();
		Timer timer2 = new Timer();
		
		TimerTask timer1schedule = new MyCustomSchedule();
		TimerTask timer2schedule = new MyOtherSchedule();
		
		//timer.schedule(timer1schedule, startTimer, delayTimer);
		timer.schedule(timer1schedule, startTimer);					// Starts only once!
		timer2.schedule(timer2schedule, startTimer2, delayTimer2);
	}
}