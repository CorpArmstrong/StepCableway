package com.dkdf.cableway.database;

/**
 * @author Дмитрий
 *
 */
public class Customer
{
    private int idKey;									// ID ключа
    private int payedTime;								// Оплаченное время
    private int moneyOnKey;								// Сумма денег на кюче в данный момент
    private int abonementType;							// Тип абонемента (0 - если его нет)
    private int timeLeftAnAbonementCurrentDate;			// Оставшееся время по абонементу на текущую дату
    private int discount;								// Скидка

    private int sumPlayedForDay;						// Суммарное время, откатанное за день
    private int sumPlayedForWeek;						// Суммарное время, откатанное за неделю
    private int sumPlayedForMonth;						// Суммарное время, откатанное за месяц

    private int sumMoneyForAllDay;						// Суммарные деньги за день
    private int sumMoneyForAllWeek;						// Суммарные деньги за неделю
    private int sumMoneyForAllMonth;					// Суммарные деньги за месяц

    private int sumTimeForAllPeriod;					// Общее время за весь период
    private int sumMoneyForAllPeriod;					// Общее деньги за весь период

    private int abonementExpirationDate;				// Дата окончания абонемента

    private int abonementExpirationMonth;				// Месяц окончания абонемента
    private int abonementExpirationYear;				// Год окончания абонемента

    private String surname;
}