package com.dkdf.cableway.database;

/**
 * Created with IntelliJ IDEA.
 * User: Дмитрий
 * Date: 22.11.13
 * Time: 21:42
 * To change this template use File | Settings | File Templates.
 */
public class Arrays
{
    /*
    static array<String^>^ DaysOfWeek = gcnew array<String^>(8){"  ", "Пн", "Вт", "Ср", "Чт", "Пт", "Сб", "Вс"};
	static array<String^>^ Surnames = gcnew array<String^>(ROWS + 1 + EXTRA_ROW);
	static array<String^>^ HashPasswords = gcnew array<String^>(3);

	static void initHashArray()
	{
		for (int i = 0; i < 3; i++)
		{
			MD5CryptoServiceProvider^ cashier1_MD5 = gcnew MD5CryptoServiceProvider();
			array<Byte>^ cashier1Array = Encoding::ASCII->GetBytes("");
			array<Byte>^ cashier1ArrayHash = cashier1_MD5->ComputeHash(cashier1Array);

			HashPasswords[i] = BitConverter::ToString(cashier1ArrayHash);
		}
	}

	static void ArraysInitialization()
	{
		for (int i = 0; i < ABONEMENT_ROWS; i++)
		{
			for(int j = 0; j < ABONEMENT_COLLUMS; j++)
			{
				Abonement[i][j] = 0;
			}
		}

		for (int i = 0; i <= ROWS + EXTRA_ROW; i++)
		{
			for (int j = 0; j < COLLUMS; j++)
			{
				KeyArray[i][j] = 0;
			}
		}

		for (int i = 0; i < DEF_ROWS; i++)
		{
			Definitions[i] = 0;
		}

		Definitions[0] = 50;		// Check!

		Definitions[17] = 1;		// For NullStatistic prevent error!
		Definitions[18] = 1;
		Definitions[19] = 1;
		Definitions[20] = 1;

		for (int i = 0; i <= ROWS; i++)
		{
			Surnames[i] = " ";
		}
	}

	static void CheckNullKeyArray()
	{
		for(int i = 0; i <= ROWS + EXTRA_ROW; i++)
		{
			for(int j = 0; j < COLLUMS; j++)
			{
				if (KeyArray[i][j] != 0)
				{
					flagKeyArrayNotEmpty = true;
				}
			}
		}
	}
     */
}