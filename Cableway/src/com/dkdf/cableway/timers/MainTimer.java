package com.dkdf.cableway.timers;

/**
 * Created with IntelliJ IDEA.
 * User: Дмитрий
 * Date: 22.11.13
 * Time: 21:31
 * To change this template use File | Settings | File Templates.
 */
public class MainTimer
{
    /*
    com.dkdf.cableway.timers.MainTimer::TimerOneSecMain();
    com.dkdf.cableway.timers.MainTimer::TimerRFIDMain();
    com.dkdf.cableway.timers.MainTimer::TimerFtpUploadMain();
    com.dkdf.cableway.timers.MainTimer::EventProcedure();
    */

    //int RFIDCounter = 1; // Switch reader!
    //int RFIDBuffer = 1;

    /*
    static int ftpSecCounter = 0;

	static System::Windows::Forms::Timer^ TimerOneSec							= gcnew System::Windows::Forms::Timer; // Timer 1 SEC!
	static System::Windows::Forms::Timer^ TimerRFID								= gcnew System::Windows::Forms::Timer; // Main Timer!
	static System::Windows::Forms::Timer^ TimerFtpUpload						= gcnew System::Windows::Forms::Timer; // Ftp timer!

	static System::Windows::Forms::Timer^ StartTimerDelayCableWay1				= gcnew System::Windows::Forms::Timer; // Delay 10 sec Timer!
	static System::Windows::Forms::Timer^ TimerBeepBeforeStopCableWay1			= gcnew System::Windows::Forms::Timer; //
	static System::Windows::Forms::Timer^ StartTimer1TurnOffSiren_CableWay1		= gcnew System::Windows::Forms::Timer; //
	static System::Windows::Forms::Timer^ StartTimer2TurnOffSiren_CableWay1		= gcnew System::Windows::Forms::Timer; //
	static System::Windows::Forms::Timer^ StartTimerDelayUseCard_RFID1			= gcnew System::Windows::Forms::Timer;
	//--------------------------------------------------------------------------------------------------------------------
	static System::Windows::Forms::Timer^ StartTimerDelayCableWay2				= gcnew System::Windows::Forms::Timer; // Delay 10 sec Timer!
	static System::Windows::Forms::Timer^ TimerBeepBeforeStopCableWay2			= gcnew System::Windows::Forms::Timer; //
	static System::Windows::Forms::Timer^ StartTimer1TurnOffSiren_CableWay2		= gcnew System::Windows::Forms::Timer; //
	static System::Windows::Forms::Timer^ StartTimer2TurnOffSiren_CableWay2		= gcnew System::Windows::Forms::Timer; //
	static System::Windows::Forms::Timer^ StartTimerDelayUseCard_RFID2			= gcnew System::Windows::Forms::Timer;
	//--------------------------------------------------------------------------------------------------------------------
	static System::Windows::Forms::Timer^ TimerPrevent1							= gcnew System::Windows::Forms::Timer; //
	static System::Windows::Forms::Timer^ TimerPrevent2							= gcnew System::Windows::Forms::Timer; //
	static System::Windows::Forms::Timer^ TimerPrevent3							= gcnew System::Windows::Forms::Timer; //
	static System::Windows::Forms::Timer^ TimerPrevent4							= gcnew System::Windows::Forms::Timer; //
	//-----------------------------------------------------------------------------------------------------------------------

	static void EventProcedure()
	{
		StartTimerDelayCableWay1->Tick += gcnew EventHandler(StartTimerDelayCableWay1Procedure);
		TimerBeepBeforeStopCableWay1->Tick += gcnew EventHandler(TimerBeepBeforeStopCableWay1Procedure);
		StartTimer1TurnOffSiren_CableWay1->Tick += gcnew EventHandler(StartTimer1TurnOffSiren_CableWay1Procedure);
		StartTimer2TurnOffSiren_CableWay1->Tick += gcnew EventHandler(StartTimer2TurnOffSiren_CableWay1Procedure);
		StartTimerDelayUseCard_RFID1->Tick += gcnew EventHandler(StartTimerDelayUseCard_RFID1Procedure);

		StartTimerDelayCableWay2->Tick += gcnew EventHandler(StartTimerDelayCableWay2Procedure);
		TimerBeepBeforeStopCableWay2->Tick += gcnew EventHandler(TimerBeepBeforeStopCableWay2Procedure);
		StartTimer1TurnOffSiren_CableWay2->Tick += gcnew EventHandler(StartTimer1TurnOffSiren_CableWay2Procedure);
		StartTimer2TurnOffSiren_CableWay2->Tick += gcnew EventHandler(StartTimer2TurnOffSiren_CableWay2Procedure);
		StartTimerDelayUseCard_RFID2->Tick += gcnew EventHandler(StartTimerDelayUseCard_RFID2Procedure);

		TimerPrevent1->Tick += gcnew EventHandler(TimerPrevent1Procedure);
		TimerPrevent2->Tick += gcnew EventHandler(TimerPrevent2Procedure);
		TimerPrevent3->Tick += gcnew EventHandler(TimerPrevent3Procedure);
		TimerPrevent4->Tick += gcnew EventHandler(TimerPrevent4Procedure);
	}
     */

    /*
    //----------------------------------------------Procedures---------------------------------------------------------------
	static void TimerOneSecProcedure(Object^ , EventArgs^ )
	{
		DateController::GetSystemTimeMy();

		if (TimeMinutes == 0 && TimeSeconds == 0)
		{
			FileController::CopyFilesToArchive();
		}

		myCounter++;
		flagInvalidate = true;

		if (FlagWorkCableWay1)
		{
			if (TimeCableWay1 > 0)
			{
				TimeCableWay1--;

				if (TimeCableWay1 == 5)
				{
					PortController::turnOnSiren1();			// Siren on!
					StartTimer2TurnOffSiren_CableWay1Main();
				}
			}
			else
			{
				PortController::StopCableway1();				// Turn off cableway1
				Threading::Thread::Sleep(100);
				if (FlagAbonementWorkCableWay1)
				{
					FlagAbonementWorkCableWay1 = false;

				if (codeCardPrevent1 == -1)
				{
					timePrevent1 = TimeToPlayVar1 * 60 * 1000;
					codeCardPrevent1 = KeyArray[NumberKeyCableWay1][0];
					TimerPrevent1Main();
				}
				else
				{
					if (codeCardPrevent2 == -1)
					{
						timePrevent2 = TimeToPlayVar1 * 60 * 1000;
						codeCardPrevent2 = KeyArray[NumberKeyCableWay1][0];
						TimerPrevent2Main();
					}
					else
					{
						if (codeCardPrevent3 == -1)
						{
							timePrevent3 = TimeToPlayVar1 * 60 * 1000;
							codeCardPrevent3 = KeyArray[NumberKeyCableWay1][0];
							TimerPrevent3Main();
						}
						else
						{
							if (codeCardPrevent4 == -1)
							{
								timePrevent4 = TimeToPlayVar1 * 60 * 1000;
								codeCardPrevent4 = KeyArray[NumberKeyCableWay1][0];
								TimerPrevent4Main();
							}
						}

					}
				}

				}
				// Clear text form for CableWay1 !
				FlagWorkCableWay1 = false;

				PortController::turnOffLED_RFID1();

				Threading::Thread::Sleep(100);
				PortController::turnOffRedGreenLAMPS_Cableway1();

				NumberKeyCableWay1 = 0;
				NumberAbonementCableWay1 = 0;
				//MessageBox::Show("Stop Cableway!");
			}
		}

		//--------------------------------Cableway 2------------------------------------------------------------------------

		if (FlagWorkCableWay2)
		{
			if (TimeCableWay2 > 0)
			{
				TimeCableWay2--;

				if (TimeCableWay2 == 5)
				{
					PortController::turnOnSiren2();			// Siren on!
					StartTimer2TurnOffSiren_CableWay2Main();
				}
			}
			else
			{
				PortController::StopCableway2();				// Turn off cableway1
				Threading::Thread::Sleep(100);
				if (FlagAbonementWorkCableWay2)
				{
					FlagAbonementWorkCableWay2 = false;

					if (codeCardPrevent1 == -1)
					{
						timePrevent1 = TimeToPlayVar2 * 60 * 1000;
						codeCardPrevent1 = KeyArray[NumberKeyCableWay2][0];
						TimerPrevent1Main();
					}
					else
					{
						if (codeCardPrevent2 == -1)
						{
							timePrevent2 = TimeToPlayVar2 * 60 * 1000;
							codeCardPrevent2 = KeyArray[NumberKeyCableWay2][0];
							TimerPrevent2Main();
						}
						else
						{
							if (codeCardPrevent3 == -1)
							{
								timePrevent3 = TimeToPlayVar2 * 60 * 1000;
								codeCardPrevent3 = KeyArray[NumberKeyCableWay2][0];
								TimerPrevent3Main();
							}
							else
							{
								if (codeCardPrevent4 == -1)
								{
									timePrevent4 = TimeToPlayVar2 * 60 * 1000;
									codeCardPrevent4 = KeyArray[NumberKeyCableWay2][0];
									TimerPrevent4Main();
								}
							}

						}
					}

				}
				// Clear text form for CableWay2 !
				FlagWorkCableWay2 = false;

				PortController::turnOffLED_RFID2();

				Threading::Thread::Sleep(100);
				PortController::turnOffRedGreenLAMPS_Cableway2();

				NumberKeyCableWay2 = 0;
				NumberAbonementCableWay2 = 0;
				//MessageBox::Show("Stop Cableway!2");
			}
		}
}
	//-----------------------------------------------------------------------------------------------------------------------
	static void TimerRFIDProcedure(Object^ , EventArgs^ )
	{
		myCounter2++;

		if (RFIDCounter == 1)
		{
			// Send a command to COM-PORT and read an answer from RFID1 and assign to RFIDBuffer(Function)
			//RFIDReader1 = RFIDBuffer; // check!

			if (Port1Enabled)
			{
				PortController::ReadCardPort1();

				if (accesssTypePort1 == 0x00 || accesssTypePort1 == 0x80)
				{
					RFIDReader1 = PortController::codeResultPort1;
				}
				if (accesssTypePort1 == 0x01 || accesssTypePort1 == 0x81)
				{
					RFIDReaderCashier = PortController::codeResultPort1;
				}
				accesssTypePort1 = 0;
				cardCode0Port1 = 0;
				cardCode1Port1 = 0;
				cardCode2Port1 = 0;

			}

			RFIDCounter = 0;
		}
		else
		{
			if (Port2Enabled)
			{
				PortController::ReadCardPort2();

				if (accesssTypePort2 == 0x00 || accesssTypePort2 == 0x80)
				{
					RFIDReader2 = PortController::codeResultPort2;
				}

				accesssTypePort2 = 0;
				cardCode0Port2 = 0;
				cardCode1Port2 = 0;
				cardCode2Port2 = 0;
			}

			RFIDCounter = 1;
		}

	}
	//-----------------------------------------------------------------------------------------------------------------------
	static void TimerFtpUploadProcedure(Object^ , EventArgs^ )
	{
		flagFtp = true;
		//FileController::SaveFtpInfoFile();
		//FtpController::FtpUploader();
	}
	//-----------------------------------------------------------------------------------------------------------------------
	static void StartTimerDelayCableWay1Procedure(Object^ , EventArgs^ )
	{
		StartTimerDelayCableWay1->Stop();

		PortController::turnOnSiren1();		// Siren on!
		StartTimer2TurnOffSiren_CableWay1Main();

		Threading::Thread::Sleep(100);		// ? delete

		PortController::StartCableway1();				// Start CableWay 1 !

		//TimerBeepBeforeStopCableWay1Main();

		if (NumberKeyCableWay1 == ROWS + 1)
		{
			FlagWorkCableWay1 = true;
		}
		else
		{
			if (KeyArray[NumberKeyCableWay1][3] != 0 && FlagAbonementWorkCableWay1 == true) // If there is an abonement!
			{
				Threading::Thread::Sleep(100);
				PortController::turnOnRedLAMP_Cableway1();

				NumberAbonementCableWay1 = KeyArray[NumberKeyCableWay1][3];
				DateController::GetSystemTimeMy();		// Get System Date and time assign to (int TimeHours, int DayConvertToInt);

				if (currentDayOfWeek >= Abonement[NumberAbonementCableWay1][0] && currentDayOfWeek < Abonement[NumberAbonementCableWay1][1])
				{
					if (TimeHours >= Abonement[NumberAbonementCableWay1][2] && TimeHours < Abonement[NumberAbonementCableWay1][3])
					{
						if (KeyArray[NumberKeyCableWay1][4] >= TimeToPlayVar1)
						{
							KeyArray[NumberKeyCableWay1][4] -= TimeToPlayVar1; // Sub full Time from abonement!
						}
						else
						{
							if (KeyArray[NumberKeyCableWay1][4] >= TimeToPlay)
							{
								//MessageBox::Show("Divide1");

								KeyArray[NumberKeyCableWay1][4] -= TimeToPlay; // Sub part 1 of Time from abonement!
								KeyArray[NumberKeyCableWay1][2] -= ((TimeToPlay * KeyArray[NumberKeyCableWay1][2]) / KeyArray[NumberKeyCableWay1][1]); // Sub money!
								KeyArray[NumberKeyCableWay1][1] -= TimeToPlay; // Sub part 2 of time from pro-ordered time!

							}
						}
					}
				}
			}
			else
			{
				Threading::Thread::Sleep(100);
				PortController::turnOnGreenLAMP_Cableway1();

				//MessageBox::Show("Divide2 " + Convert::ToString(KeyArray[NumberKeyCableWay1][1]));
				//System::Threading::Thread::Sleep(5000);
				KeyArray[NumberKeyCableWay1][2] -= ((TimeToPlayVar1 * KeyArray[NumberKeyCableWay1][2]) / (KeyArray[NumberKeyCableWay1][1])); // Sub money! // Exception: Divide by Zero!
				KeyArray[NumberKeyCableWay1][1] -= TimeToPlayVar1;
			}

			KeyArray[NumberKeyCableWay1][6] += TimeToPlayVar1;
			KeyArray[NumberKeyCableWay1][7] += TimeToPlayVar1;
			KeyArray[NumberKeyCableWay1][8] += TimeToPlayVar1;
			KeyArray[NumberKeyCableWay1][12] += TimeToPlayVar1;

			Definitions[1] += TimeToPlayVar1;
			Definitions[2] += TimeToPlayVar1;
			Definitions[3] += TimeToPlayVar1;
			Definitions[4] += TimeToPlayVar1;
			FlagWorkCableWay1 = true;
			numberKeyTable = NumberKeyCableWay1; // Edit!         я закоментировал (что здесь не понятно)

			if (FlagAbonementWorkCableWay1)
			{
				FileController::LogNormal(DateTime::Now + " Ключ " + KeyArray[NumberKeyCableWay1][0] + " катается " + TimeToPlayVar1 + " минут  на канатке 1   ПО АБОНЕМЕНТУ!");
			}
			else
			{
				FileController::LogNormal(DateTime::Now + " Ключ " + KeyArray[NumberKeyCableWay1][0] + " катается " + TimeToPlayVar1 + " минут  на канатке 1");
			}

			FileController::SaveKeyArrayToFileBack();		// Unload KeyArray and Definitions to back file!
			FileController::SaveDefinitionsToFileBack();
		}
		// KILL ME!
	}
	//-----------------------------------------------------------------------------------------------------------------------
	static void TimerBeepBeforeStopCableWay1Procedure(Object^ , EventArgs^ )
	{
		TimerBeepBeforeStopCableWay1->Stop();
		PortController::turnOnSiren1();			// Siren on!
		StartTimer2TurnOffSiren_CableWay1Main();
		// KILL ME!
	}
	//-----------------------------------------------------------------------------------------------------------------------
	static void StartTimer1TurnOffSiren_CableWay1Procedure(Object^ , EventArgs^ )
	{
		StartTimer1TurnOffSiren_CableWay1->Stop();
		PortController::turnOffSiren1();		// Siren off!
		// KILL ME!
	}
	//-----------------------------------------------------------------------------------------------------------------------
	static void StartTimer2TurnOffSiren_CableWay1Procedure(Object^ , EventArgs^ )
	{
		StartTimer2TurnOffSiren_CableWay1->Stop();
		Threading::Thread::Sleep(100);
		PortController::turnOffSiren1();		// Siren off!
		// KILL ME!
	}
	//-----------------------------------------------------------------------------------------------------------------------
	static void StartTimerDelayUseCard_RFID1Procedure(Object^ , EventArgs^ )
	{
		StartTimerDelayUseCard_RFID1->Stop();
		flagDelayUseCard_RFID1 = false;
		PortController::turnOffBuzzer1();
	}

	//---------------------Cableway 2----------------------------------------------------------------------------

	static void StartTimerDelayCableWay2Procedure(Object^ , EventArgs^ )
	{
		StartTimerDelayCableWay2->Stop();

		PortController::turnOnSiren2();		// Siren on!
		StartTimer2TurnOffSiren_CableWay2Main();

		Threading::Thread::Sleep(100);		// ? delete

		PortController::StartCableway2();				// Start CableWay 1 !

		//TimerBeepBeforeStopCableWay2Main();

		if (NumberKeyCableWay2 == ROWS + 1)
		{
			FlagWorkCableWay2 = true;
		}
		else
		{
			if (KeyArray[NumberKeyCableWay2][3] != 0 && FlagAbonementWorkCableWay2 == true) // If there is an abonement!
			{
				Threading::Thread::Sleep(100);
				PortController::turnOnRedLAMP_Cableway2();

				NumberAbonementCableWay2 = KeyArray[NumberKeyCableWay2][3];
				DateController::GetSystemTimeMy();		// Get System Date and time assign to (int TimeHours, int DayConvertToInt);

				if (currentDayOfWeek >= Abonement[NumberAbonementCableWay2][0] && currentDayOfWeek < Abonement[NumberAbonementCableWay2][1])
				{
					if (TimeHours >= Abonement[NumberAbonementCableWay2][2] && TimeHours < Abonement[NumberAbonementCableWay2][3])
					{
						if (KeyArray[NumberKeyCableWay2][4] >= TimeToPlayVar2)
						{
							KeyArray[NumberKeyCableWay2][4] -= TimeToPlayVar2; // Sub full Time from abonement!
						}
						else
						{
							if (KeyArray[NumberKeyCableWay2][4] >= TimeToPlay)
							{
								//MessageBox::Show("Divide1");

								KeyArray[NumberKeyCableWay2][4] -= TimeToPlay; // Sub part 1 of Time from abonement!
								KeyArray[NumberKeyCableWay2][2] -= ((TimeToPlay * KeyArray[NumberKeyCableWay2][2]) / KeyArray[NumberKeyCableWay2][1]); // Sub money!
								KeyArray[NumberKeyCableWay2][1] -= TimeToPlay; // Sub part 2 of time from pro-ordered time!

							}
						}
					}
				}
			}
			else
			{
				Threading::Thread::Sleep(100);
				PortController::turnOnGreenLAMP_Cableway2();

				//MessageBox::Show("Divide2 " + Convert::ToString(KeyArray[NumberKeyCableWay1][1]));
				//System::Threading::Thread::Sleep(5000);
				KeyArray[NumberKeyCableWay2][2] -= ((TimeToPlayVar2 * KeyArray[NumberKeyCableWay2][2]) / (KeyArray[NumberKeyCableWay2][1])); // Sub money! // Exception: Divide by Zero!
				KeyArray[NumberKeyCableWay2][1] -= TimeToPlayVar2;
			}

			KeyArray[NumberKeyCableWay2][6] += TimeToPlayVar2;
			KeyArray[NumberKeyCableWay2][7] += TimeToPlayVar2;
			KeyArray[NumberKeyCableWay2][8] += TimeToPlayVar2;
			KeyArray[NumberKeyCableWay2][12] += TimeToPlayVar2;

			Definitions[5] += TimeToPlayVar2;
			Definitions[6] += TimeToPlayVar2;
			Definitions[7] += TimeToPlayVar2;
			Definitions[8] += TimeToPlayVar2;
			FlagWorkCableWay2 = true;
			numberKeyTable = NumberKeyCableWay2; // Edit!         я закоментировал (что здесь не понятно)

			if (FlagAbonementWorkCableWay2)
			{
				FileController::LogNormal(DateTime::Now + " Ключ " + KeyArray[NumberKeyCableWay2][0] + " катается " + TimeToPlayVar2 + " минут  на канатке 1   ПО АБОНЕМЕНТУ!");
			}
			else
			{
				FileController::LogNormal(DateTime::Now + " Ключ " + KeyArray[NumberKeyCableWay2][0] + " катается " + TimeToPlayVar2 + " минут  на канатке 1");
			}

			FileController::SaveKeyArrayToFileBack();		// Unload KeyArray and Definitions to back file!
			FileController::SaveDefinitionsToFileBack();
		}
		// KILL ME!
	}
	//-----------------------------------------------------------------------------------------------------------------------
	static void TimerBeepBeforeStopCableWay2Procedure(Object^ , EventArgs^ )
	{
		TimerBeepBeforeStopCableWay2->Stop();
		PortController::turnOnSiren2();			// Siren on!
		StartTimer2TurnOffSiren_CableWay2Main();
		// KILL ME!
	}
	//-----------------------------------------------------------------------------------------------------------------------
	static void StartTimer1TurnOffSiren_CableWay2Procedure(Object^ , EventArgs^ )
	{
		StartTimer1TurnOffSiren_CableWay2->Stop();
		PortController::turnOffSiren2();		// Siren off!
		// KILL ME!
	}
	//-----------------------------------------------------------------------------------------------------------------------
	static void StartTimer2TurnOffSiren_CableWay2Procedure(Object^ , EventArgs^ )
	{
		StartTimer2TurnOffSiren_CableWay2->Stop();
		Threading::Thread::Sleep(100);
		PortController::turnOffSiren2();		// Siren off!
		// KILL ME!
	}
	//-----------------------------------------------------------------------------------------------------------------------
	static void StartTimerDelayUseCard_RFID2Procedure(Object^ , EventArgs^ )
	{
		StartTimerDelayUseCard_RFID2->Stop();
		flagDelayUseCard_RFID2 = false;
		PortController::turnOffBuzzer2();
	}
	//-----------------------------------------------------------------------------------------------------------------------
	static void TimerPrevent1Procedure(Object^ , EventArgs^ )
	{
		TimerPrevent1->Stop();
		codeCardPrevent1 = -1;
	}
	//-----------------------------------------------------------------------------------------------------------------------
	static void TimerPrevent2Procedure(Object^ , EventArgs^ )
	{
		TimerPrevent2->Stop();
		codeCardPrevent2 = -1;
	}
	//-----------------------------------------------------------------------------------------------------------------------
	static void TimerPrevent3Procedure(Object^ , EventArgs^ )
	{
		TimerPrevent3->Stop();
		codeCardPrevent3 = -1;
	}
	//-----------------------------------------------------------------------------------------------------------------------
	static void TimerPrevent4Procedure(Object^ , EventArgs^ )
	{
		TimerPrevent4->Stop();
		codeCardPrevent4 = -1;
	}
	//--------------------------------------------End-Of-Procedures----------------------------------------------------------
public:
	//-----------------------------------------------------------------------------------------------------------------------
	static void TimerOneSecMain()
	{
		TimerOneSec->Tick += gcnew EventHandler(TimerOneSecProcedure);
		TimerOneSec->Interval = 985;//1000;
		TimerOneSec->Start();
	}
	//-----------------------------------------------------------------------------------------------------------------------
	static void TimerRFIDMain()
	{
		TimerRFID->Tick += gcnew EventHandler(TimerRFIDProcedure);
		TimerRFID->Interval = 200;
		TimerRFID->Start();
	}
	//-----------------------------------------------------------------------------------------------------------------------
	static void TimerFtpUploadMain()
	{
		TimerFtpUpload->Tick += gcnew EventHandler(TimerFtpUploadProcedure);
		TimerFtpUpload->Interval = 10000;
		TimerFtpUpload->Start();
	}
	//-----------------------------------------------------------------------------------------------------------------------
	static void StartTimerDelayCableWay1Main()
	{
		StartTimerDelayCableWay1->Interval = CableWayStartDelay * 1000;
		StartTimerDelayCableWay1->Start();
	}
	//-----------------------------------------------------------------------------------------------------------------------
	static void TimerBeepBeforeStopCableWay1Main()
	{
		TimerBeepBeforeStopCableWay1->Interval = ((TimeToPlayVar1 * 60) - TimeBeforeStopBeepWarning) * 1000;
    TimerBeepBeforeStopCableWay1->Start();
}
    //-----------------------------------------------------------------------------------------------------------------------
    static void StartTimer1TurnOffSiren_CableWay1Main()
    {
        StartTimer1TurnOffSiren_CableWay1->Interval = TimeAlarmBeepWhenPresentationRFID;
        StartTimer1TurnOffSiren_CableWay1->Start();
    }
    //-----------------------------------------------------------------------------------------------------------------------
    static void StartTimer2TurnOffSiren_CableWay1Main()
    {
        StartTimer2TurnOffSiren_CableWay1->Interval = TimeDurationBeepStartStop;
        StartTimer2TurnOffSiren_CableWay1->Start();
    }
    //-----------------------------------------------------------------------------------------------------------------------
    static void StartTimerDelayUseCard_RFID1Main()
    {
        StartTimerDelayUseCard_RFID1->Interval = 3000;
        StartTimerDelayUseCard_RFID1->Start();
    }

    //-----------------Cableway 2----------------------------------------------------------------------------------

    static void StartTimerDelayCableWay2Main()
    {
        StartTimerDelayCableWay2->Interval = CableWayStartDelay * 1000;
        StartTimerDelayCableWay2->Start();
    }
    //-----------------------------------------------------------------------------------------------------------------------
    static void TimerBeepBeforeStopCableWay2Main()
    {
        TimerBeepBeforeStopCableWay2->Interval = ((TimeToPlayVar2 * 60) - TimeBeforeStopBeepWarning) * 1000;
        TimerBeepBeforeStopCableWay2->Start();
    }
    //-----------------------------------------------------------------------------------------------------------------------
    static void StartTimer1TurnOffSiren_CableWay2Main()
    {
        StartTimer1TurnOffSiren_CableWay2->Interval = TimeAlarmBeepWhenPresentationRFID;
        StartTimer1TurnOffSiren_CableWay2->Start();
    }
    //-----------------------------------------------------------------------------------------------------------------------
    static void StartTimer2TurnOffSiren_CableWay2Main()
    {
        StartTimer2TurnOffSiren_CableWay2->Interval = TimeDurationBeepStartStop;
        StartTimer2TurnOffSiren_CableWay2->Start();
    }
    //-----------------------------------------------------------------------------------------------------------------------
    static void StartTimerDelayUseCard_RFID2Main()
    {
        StartTimerDelayUseCard_RFID2->Interval = 3000;
        StartTimerDelayUseCard_RFID2->Start();
    }
    //-----------------------------------------------------------------------------------------------------------------------
    static void TimerPrevent1Main()
    {
        TimerPrevent1->Interval = timePrevent1;
        TimerPrevent1->Start();
    }
    //-----------------------------------------------------------------------------------------------------------------------
    static void TimerPrevent2Main()
    {
        TimerPrevent2->Interval = timePrevent2;
        TimerPrevent2->Start();
    }
    //-----------------------------------------------------------------------------------------------------------------------
    static void TimerPrevent3Main()
    {
        TimerPrevent3->Interval = timePrevent3;
        TimerPrevent3->Start();
    }
    //-----------------------------------------------------------------------------------------------------------------------
    static void TimerPrevent4Main()
    {
        TimerPrevent4->Interval = timePrevent4;
        TimerPrevent4->Start();
    }
//-----------------------------------------------------------------------------------------------------------------------
     */
}
