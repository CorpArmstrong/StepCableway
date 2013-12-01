package com.dkdf.cableway.newstaff;

public class CablewayMain implements Cableway
{
    private boolean flagWorkCableWay;
    private int timeCableway;                           // Время текущего катания
    private final int timeToPlay = 5;                   // Время одного катания
    private boolean flagAbonementWorkCableway;          //

    private int codeCardPrevent1;
    private int codeCardPrevent2;
    private int codeCardPrevent3;
    private int codeCardPrevent4;

    private int timePrevent1;
    private int timePrevent2;
    private int timePrevent3;
    private int timePrevent4;


    //-----------------------------------------------------------------------------------------------------------
    private int oneMinutePrice;							// Стоимость мин. единицы проката (деньги/время)

    private int sumPlayedTimeCableway1ForDay;			// Суммарное откатанное время по Канатке 1 за день
    private int sumPlayedTimeCableway1ForWeek;			// Суммарное откатанное время по Канатке 1 за неделю
    private int sumPlayedTimeCableway1ForMonth;			// Суммарное откатанное время по Канатке 1 за месяц
    private int sumPlayedTimeCableway1ForAllPeriod;		// Суммарное откатанное время по Канатке 1 за весь период

    private int moneyForDay;							// Деньги за день
    private int moneyForWeek;							// Деньги за неделю
    private int moneyForMonth;							// Деньги за месяц
    private int moneyForAllTimePeriod;					// Деньги за весь период

    private int returnMoneyForDay;						// Возврат денег за день
    private int returnMoneyForWeek;						// Возврат денег за неделю
    private int returnMoneyForMonth;					// Возврат денег за месяц
    private int returnMoneyForAllTimePeriod;			// Возврат денег за все время

    private int lastDay;								// День последнего запуска программы ??
    private int lastMonth;								// Месяц последнего запуска программы ??
    private int lastYear;								// Год последнего запуска программы ??
    private int lastDayOfWeek;							// Последний день недели последнего запуска программы ??

    public CablewayMain()
    {
        flagWorkCableWay = false;
        flagAbonementWorkCableway = false;

        timeCableway = 0;

        codeCardPrevent1 = 0;
        codeCardPrevent2 = 0;
        codeCardPrevent3 = 0;
        codeCardPrevent4 = 0;

        timePrevent1 = 0;
        timePrevent2 = 0;
        timePrevent3 = 0;
        timePrevent4 = 0;
    }

    @Override
    public synchronized boolean isWorking()
    {
        boolean result = false;
        return result;
    }

    @Override
    public synchronized void checkTimeLeft()
    {
        if (timeCableway > 0)
        {
            timeCableway--;

            if (timeCableway == timeToPlay)
            {
                //PortController::turnOnSiren1();			// Siren on!
                //StartTimer2TurnOffSiren_CableWay1Main();
            }
        }
        else
        {
            //PortController::StopCableway1();				// Turn off cableway1
            //Threading::Thread::Sleep(100);

            if (flagAbonementWorkCableway)
            {
                flagAbonementWorkCableway = false;

                if (codeCardPrevent1 == -1)
                {
                    /*
                    timePrevent1 = TimeToPlayVar1 * 60 * 1000;
                    codeCardPrevent1 = KeyArray[NumberKeyCableWay1][0];
                    TimerPrevent1Main();
                    */
                }
                else
                {
                    if (codeCardPrevent2 == -1)
                    {
                        /*
                        timePrevent2 = TimeToPlayVar1 * 60 * 1000;
                        codeCardPrevent2 = KeyArray[NumberKeyCableWay1][0];
                        TimerPrevent2Main();
                        */
                    }
                    else
                    {
                        if (codeCardPrevent3 == -1)
                        {
                            /*
                            timePrevent3 = TimeToPlayVar1 * 60 * 1000;
                            codeCardPrevent3 = KeyArray[NumberKeyCableWay1][0];
                            TimerPrevent3Main();
                            */
                        }
                        else
                        {
                            if (codeCardPrevent4 == -1)
                            {
                                /*
                                timePrevent4 = TimeToPlayVar1 * 60 * 1000;
                                codeCardPrevent4 = KeyArray[NumberKeyCableWay1][0];
                                TimerPrevent4Main();
                                */
                            }
                        }

                    }
                }

            }

            flagWorkCableWay = false;                   // Clear text form for CableWay!

            /*
				PortController::turnOffLED_RFID1();

				Threading::Thread::Sleep(100);
				PortController::turnOffRedGreenLAMPS_Cableway1();

				NumberKeyCableWay1 = 0;
				NumberAbonementCableWay1 = 0;
				//MessageBox::Show("Stop Cableway!");
                 */
        }
    }
}