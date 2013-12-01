package com.dkdf.cableway.core;

/**
 * Created with IntelliJ IDEA.
 * User: Дмитрий
 * Date: 22.11.13
 * Time: 21:49
 * To change this template use File | Settings | File Templates.
 */
public class DateController
{
    /*
    static void GetSystemTimeMy()
	{
		SYSTEMTIME st, lt;
		GetSystemTime(&st);
		GetLocalTime(&lt);

		TimeHours = lt.wHour;
		TimeMinutes = lt.wMinute;
		TimeSeconds = lt.wSecond;
		currentDayOfWeek = st.wDayOfWeek;

		currentDay = st.wDay;
		currentMonth = st.wMonth;
		currentYear = st.wYear;
	}

	//------------------------------
	static int ProcessDate()
	{
		DateTime secretDate = DateTime(2010, 8, 15);
		DateTime currentDate = DateTime::Now;

		// Difference between CurrentDate and SecretDate !
		TimeSpan diff = currentDate.Subtract(secretDate);
		int diffDate = Convert::ToInt32(diff.TotalDays);

		return diffDate;
	}
	//------------------------------

	static int DateInit(int Year1, int Month1, int Day1, int Year2, int Month2, int Day2)
	{
		DateTime Date1 = DateTime(Year1, Month1, Day1);
		DateTime Date2 = DateTime(Year2, Month2, Day2);

		TimeSpan diff = Date2.Subtract(Date1);
		int diffDate = Convert::ToInt32(diff.TotalDays);
		return diffDate;
	}

	static void CheckDateAbonement()		//  Compare Last date of abonement with current date and NULL an abonement if date expired!
	{
		int checkDate = 0;

		for (int i = 1; i <= ROWS; i++)
		{
			if (KeyArray[i][14] == -1)
			{
				KeyArray[i][14] = 0;
			}

			if (KeyArray[i][15] == -1)
			{
				KeyArray[i][15] = 0;
			}

			if (KeyArray[i][16] == -1)
			{
				KeyArray[i][16] = 0;
			}
			if (KeyArray[i][14] != 0 && KeyArray[i][15] != 0 && KeyArray[i][16] != 0)
			{

				checkDate = DateInit(currentYear, currentMonth, currentDay, KeyArray[i][16], KeyArray[i][15], KeyArray[i][14]);

				if (checkDate < 0)
				{
					KeyArray[i][3] = 0;
					KeyArray[i][16] = 0;
					KeyArray[i][15] = 0;
					KeyArray[i][14] = 0;
				}
			}
		}

		FileController::SaveKeyArrayToFileBack();
	}

	static void NullStatistic()		// NULL the statistics for day, week or month if necessary!
	{
		//System::Windows::Forms::MessageBox::Show(Convert::ToString(Definitions[17]) + " " + Convert::ToString(Definitions[18]) + " " + Convert::ToString(Definitions[19]) + " " + Convert::ToString(Definitions[20]));
		lastDay = Definitions[17];
		lastMonth = Definitions[18];
		lastYear = Definitions[19];
		lastDayOfWeek = Definitions[20];

		int checkDate = 0;

		if (currentDay != lastDay)	// Add in if(): Compare month! (or TimeSpan)
		{   // NULL for day
			Definitions[1] = 0;
            Definitions[5] = 0;
            Definitions[9] = 0;
            Definitions[13] = 0;

    for (int i = 1; i <= ROWS + EXTRA_ROW; i++)
    {
        KeyArray[i][6] = 0;
        KeyArray[i][9] = 0;
        KeyArray[i][4] = Abonement[KeyArray[i][3]][5];
    }

    checkDate = DateInit(lastYear, lastMonth, lastDay, currentYear, currentMonth, currentDay);

    if (lastDayOfWeek > currentDayOfWeek ||  checkDate >= 7)
    {
        // NULL for week
        Definitions[2] = 0;
        Definitions[6] = 0;
        Definitions[10] = 0;
        Definitions[14] = 0;

        for (int i = 1; i <= ROWS + EXTRA_ROW; i++)
        {
            KeyArray[i][7] = 0;
            KeyArray[i][10] = 0;
        }
    }

    if (currentMonth > lastMonth)
    {
        // NULL for month
        Definitions[3] = 0;
        Definitions[7] = 0;
        Definitions[11] = 0;
        Definitions[15] = 0;

        for (int i = 1; i <= ROWS + EXTRA_ROW; i++)
        {
            KeyArray[i][8] = 0;
            KeyArray[i][11] = 0;
        }
    }
}

Definitions[17] = currentDay;
Definitions[18] = currentMonth;
Definitions[19] = currentYear;
Definitions[20] = currentDayOfWeek;

//System::Windows::Forms::MessageBox::Show(Convert::ToString(Definitions[17]) + " " + Convert::ToString(Definitions[18]) + " " + Convert::ToString(Definitions[19]) + " " + Convert::ToString(Definitions[20]));

FileController::SaveDefinitionsToFileBack();
}
     */
}