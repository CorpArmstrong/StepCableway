package com.dkdf.cableway.oldstuff;

/**
 * @author Дмитрий
 *
 */
public final class CablewayData
{
    //------------------------------KeyArray------------------------------------------
    private final int idKey = 0;							// ID ключа
    private final int payedTime = 1;						// Оплаченное время
    private final int moneyOnKey = 2;						// Сумма денег на кюче в данный момент
    private final int abonementType = 3;					// Тип абонемента (0 - если его нет)
    private final int timeLeftAnAbonementCurrentDate = 4;	// Оставшееся время по абонементу на текущую дату
    private final int discount = 5;							// Скидка

    private final int sumPlayedForDay = 6;					// Суммарное время, откатанное за день
    private final int sumPlayedForWeek = 7;					// Суммарное время, откатанное за неделю
    private final int sumPlayedForMonth = 8;				// Суммарное время, откатанное за месяц

    private final int sumMoneyForAllDay = 9;				// Суммарные деньги за день
    private final int sumMoneyForAllWeek = 10;				// Суммарные деньги за неделю
    private final int sumMoneyForAllMonth = 11;				// Суммарные деньги за месяц

    private final int sumTimeForAllPeriod = 12;				// Общее время за весь период
    private final int sumMoneyForAllPeriod = 13;			// Общее деньги за весь период

    private final int abonementExpirationDate = 14;			// Дата окончания абонемента

    private final int abonementExpirationMonth = 15;		// Месяц окончания абонемента
    private final int abonementExpirationYear = 16;			// Год окончания абонемента
    //-------------------------End-Of-KeyArray----------------------------------------

    //-------------------------Definitions--------------------------------------------
    private final int oneMinutePrice = 0;						// Стоимость мин. единицы проката (деньги/время)

    private final int sumPlayedTimeCableway1ForDay = 1;			// Суммарное откатанное время по Канатке 1 за день
    private final int sumPlayedTimeCableway1ForWeek = 2;		// Суммарное откатанное время по Канатке 1 за неделю
    private final int sumPlayedTimeCableway1ForMonth = 3;		// Суммарное откатанное время по Канатке 1 за месяц
    private final int sumPlayedTimeCableway1ForAllPeriod = 4;	// Суммарное откатанное время по Канатке 1 за весь период

    private final int sumPlayedTimeCableway2ForDay = 5;			// Суммарное откатанное время по Канатке 2 за день
    private final int sumPlayedTimeCableway2ForWeek = 6;		// Суммарное откатанное время по Канатке 2 за неделю
    private final int sumPlayedTimeCableway2ForMonth = 7;		// Суммарное откатанное время по Канатке 2 за месяц
    private final int sumPlayedTimeCableway2ForAllPeriod = 8;	// Суммарное откатанное время по Канатке 2 за весь период

    private final int moneyForDay = 9;							// Деньги за день
    private final int moneyForWeek = 10;						// Деньги за неделю
    private final int moneyForMonth = 11;						// Деньги за месяц
    private final int moneyForAllTimePeriod = 12;				// Деньги за весь период

    private final int returnMoneyForDay = 13;					// Возврат денег за день
    private final int returnMoneyForWeek = 14;					// Возврат денег за неделю
    private final int returnMoneyForMonth = 15;					// Возврат денег за месяц
    private final int returnMoneyForAllTimePeriod = 16;			// Возврат денег за все время

    private final int lastDay = 17;								// День последнего запуска программы ??
    private final int lastMonth = 18;							// Месяц последнего запуска программы ??
    private final int lastYear = 19;							// Год последнего запуска программы ??
    private final int lastDayOfWeek = 20;						// Последний день недели последнего запуска программы ??
    //-----------------------End-Of-Definitions---------------------------------------

    //--------------------------Abonement---------------------------------------------
    private final int dayOfWeekStartUseAbonement = 0;			// День недели начала действия абонемента
    private final int dayOfWeekStopUseAbonement = 1;			// День недели конца действия абонемента

    private final int timeStartUseAbonement = 2;				// Время начала действия абонемента
    private final int timeStopUseAbonement = 3;					// Время окончания действия абонемента

    private final int abonementPrice = 4;						// Стоимость абонемента
    private final int timeLimitForDay = 5;						// Лимит времени на день
    //-----------------------End-Of-Abonement-----------------------------------------

    private String surname;

    // COM1 - (RFID1, RFID2)
    // DTR - управление Канаткой 1
    // RTS - управление сиреной 1

    // COM2 - (RFID_CASHIER)
    // DTR - управление Канаткой 2
    // RTS - управление сиреной 2
}