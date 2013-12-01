package com.dkdf.cableway.oldstuff;

import com.dkdf.cableway.newstaff.CablewayMain;

public class MainProgram
{
	public void mainLoop(CablewayMain cbl1, CablewayMain cbl2)
	{
        /*
		//-------------------------------------------Main-Cycle--------------------------------------
		while (true)		
		{
			rfidReader1();
			rfidReader2();
			rfidReaderCashier();
			
			Thread::Sleep(200);
		}
	}
	
	public static void main(String[] args)
	{
        MainProgram mainProgram = new MainProgram();
		CablewayMain cableway1 = new CablewayMain();
		CablewayMain cableway2 = new CablewayMain();
		
		mainProgram.mainLoop(cableway1, cableway2); // ?
	}
	
	public void rfidReader1()
	{
		if ((RFIDReader1 != 0 && flagDelayUseCard_RFID1 == false && RFIDReader1 != codeCardPrevent1 && RFIDReader1 != codeCardPrevent2 && RFIDReader1 != codeCardPrevent3 && RFIDReader1 != codeCardPrevent4))
		{
			if (RFIDReader1 == KeyArray[ROWS + 1][0] && FlagWorkCableWay1 == false)
			{
				NumberKeyCableWay1 = ROWS + 1;
				flagDelayUseCard_RFID1 = true;
				flagStartTimerDelayCableWay1 = true;
				PortController::turnOnSiren1();
				Thread::Sleep(100);
				PortController::turnOnBuzzer1();
				Thread::Sleep(100);
				PortController::turnOnLED_RFID1();
				TimeToPlayVar1 = TimeToPlay;		
				TimeCableWay1 = TimeToPlay * 60;
			}
			else
			{
				if (!FlagWorkCableWay1)
				{
					if (NumberKeyCableWay1 == 0)		
					{		
						for (int i = 1; i <= ROWS; i++)		
						{		
							if (RFIDReader1 == KeyArray[i][0]) // If Key is in KeyArray!		
							{		
								if (KeyArray[i][3] != 0) // If there is an abonement!		
								{		
									NumberAbonementCableWay1 = KeyArray[i][3];

                                    DateController::GetSystemTimeMy();  // Get System Date and time assign to (int TimeHours, int DayConvertToInt);


									if (currentDayOfWeek == 0) // Sunday last edit! 
									{
										currentDayOfWeek = 7;
									}

									if (currentDayOfWeek >= Abonement[NumberAbonementCableWay1][0] && currentDayOfWeek <= Abonement[NumberAbonementCableWay1][1])		
									{		
										//MessageBox::Show("Day of week check");
										if (TimeHours >= Abonement[NumberAbonementCableWay1][2] && TimeHours < Abonement[NumberAbonementCableWay1][3])		
										{		
											//MessageBox::Show("Hours of week check");
											if (KeyArray[i][4] >= TimeToPlay)		
											{
												NumberKeyCableWay1 = i;
												flagStartTimerDelayCableWay1 = true;
												flagDelayUseCard_RFID1 = true;
												FlagAbonementWorkCableWay1 = true;
												PortController::turnOnSiren1();
												Thread::Sleep(100);
												PortController::turnOnBuzzer1();
												Thread::Sleep(100);
												PortController::turnOnLED_RFID1();
												TimeToPlayVar1 = TimeToPlay;
												TimeCableWay1 = TimeToPlay * 60;
												break; // !1st place; get out of WHILE		
											} 		
										}		
									}		

									if (!FlagAbonementWorkCableWay1)
									{
										if (KeyArray[i][1] >= TimeToPlay)		
										{		
											//MessageBox::Show("start timerDelay");
											NumberKeyCableWay1 = i;	
											flagDelayUseCard_RFID1 = true;
											//MessageBox::Show("Use card");
											flagStartTimerDelayCableWay1 = true;
											PortController::turnOnSiren1();
											Thread::Sleep(100);
											PortController::turnOnBuzzer1();
											Thread::Sleep(100);
											PortController::turnOnLED_RFID1();
											TimeToPlayVar1 = TimeToPlay;		
											TimeCableWay1 = TimeToPlay * 60;
											break; // !2st place; get out of WHILE		
										}
									}
								}		
								else		
								{		
									if (KeyArray[i][1] >= TimeToPlay)		
									{		
										//MessageBox::Show("start timerDelay");
										NumberKeyCableWay1 = i;	
										flagDelayUseCard_RFID1 = true;
										//MessageBox::Show("Use card");
										flagStartTimerDelayCableWay1 = true;
										PortController::turnOnSiren1();
										Thread::Sleep(100);
										PortController::turnOnBuzzer1();
										Thread::Sleep(100);
										PortController::turnOnLED_RFID1();
										TimeToPlayVar1 = TimeToPlay;		
										TimeCableWay1 = TimeToPlay * 60;
										break; // !2st place; get out of WHILE		
									}				
								}		
							}		
						}		
					}		
					else		
					{	
						if (FlagAbonementWorkCableWay1)
						{
							if (KeyArray[NumberKeyCableWay1][4] >= (2 * TimeToPlay))
							{
								TimeToPlayVar1 = 2 * TimeToPlay;		
								TimeCableWay1 = 2 * 60 * TimeToPlay;

								flagDelayUseCard_RFID1 = true;
								PortController::turnOnBuzzer1();
							}
							else
							{
								if (RFIDReader1 == KeyArray[NumberKeyCableWay1][0])		
								{		
									if (KeyArray[NumberKeyCableWay1][1] >= TimeToPlay)		
									{		
										TimeToPlayVar1 = 2 * TimeToPlay;		
										TimeCableWay1 = 2 * 60 * TimeToPlay;

										flagDelayUseCard_RFID1 = true;
										PortController::turnOnBuzzer1();
										//break; // !1st place; get out of WHILE
									}		
								}	
							}
						}
						else
						{
							if (RFIDReader1 == KeyArray[NumberKeyCableWay1][0])		
							{		
								if (KeyArray[NumberKeyCableWay1][1] >= (2 * TimeToPlay))		
								{		
									TimeToPlayVar1 = 2 * TimeToPlay;		
									TimeCableWay1 = 2 * 60 * TimeToPlay;

									flagDelayUseCard_RFID1 = true;
									PortController::turnOnBuzzer1();
									//break; // !1st place; get out of WHILE
								}		
							}		
						}
					}
				}	
			}
				
		}
		
		RFIDReader1 = 0;
	}

	public void rfidReader2()
	{
		if ((RFIDReader2 != 0 && flagDelayUseCard_RFID2 == false && RFIDReader2 != codeCardPrevent1 && RFIDReader2 != codeCardPrevent2 && RFIDReader2 != codeCardPrevent3 && RFIDReader2 != codeCardPrevent4))
		{
			if (RFIDReader2 == KeyArray[ROWS + 1][0] && FlagWorkCableWay2 == false)
			{
				NumberKeyCableWay2 = ROWS + 1;	
				flagDelayUseCard_RFID2 = true;
				flagStartTimerDelayCableWay2 = true;
				PortController::turnOnSiren2();
				Thread::Sleep(100);
				PortController::turnOnBuzzer2();
				Thread::Sleep(100);
				PortController::turnOnLED_RFID2();
				TimeToPlayVar2 = TimeToPlay;		
				TimeCableWay2 = TimeToPlay * 60;
			}
			else
			{
				if (!FlagWorkCableWay2)
				{
					if (NumberKeyCableWay2 == 0)		
					{		
						for (int i = 1; i <= ROWS; i++)		
						{		
							if (RFIDReader2 == KeyArray[i][0]) // If Key is in KeyArray!		
							{		
								if (KeyArray[i][3] != 0) // If there is an abonement!		
								{		
									NumberAbonementCableWay2 = KeyArray[i][3];
									DateController::GetSystemTimeMy();	// Get System Date and time assign to (int TimeHours, int DayConvertToInt);
									//MessageBox::Show(Convert::ToString(currentDayOfWeek) + " " + Convert::ToString(TimeHours) + " " + Convert::ToString(i));
									
									if (currentDayOfWeek == 0) // Sunday last edit! 
									{
										currentDayOfWeek = 7;
									}
									
									if (currentDayOfWeek >= Abonement[NumberAbonementCableWay2][0] && currentDayOfWeek <= Abonement[NumberAbonementCableWay2][1])		
									{		
										//MessageBox::Show("Day of week check");
										if (TimeHours >= Abonement[NumberAbonementCableWay2][2] && TimeHours < Abonement[NumberAbonementCableWay2][3])		
										{		
											//MessageBox::Show("Hours of week check");
											if (KeyArray[i][4] >= TimeToPlay)		
											{
												NumberKeyCableWay2 = i;
												flagStartTimerDelayCableWay2 = true;
												flagDelayUseCard_RFID2 = true;
												FlagAbonementWorkCableWay2 = true;
												PortController::turnOnSiren2();
												Thread::Sleep(100);
												PortController::turnOnBuzzer2();
												Thread::Sleep(100);
												PortController::turnOnLED_RFID2();
												TimeToPlayVar2 = TimeToPlay;
												TimeCableWay2 = TimeToPlay * 60;
												break; // !1st place; get out of WHILE		
											} 		
										}		
									}		

									if (!FlagAbonementWorkCableWay2)
									{
										if (KeyArray[i][1] >= TimeToPlay)		
										{		
											//MessageBox::Show("start timerDelay");
											NumberKeyCableWay2 = i;	
											flagDelayUseCard_RFID2 = true;
											//MessageBox::Show("Use card");
											flagStartTimerDelayCableWay2 = true;
											PortController::turnOnSiren2();
											Thread::Sleep(100);
											PortController::turnOnBuzzer2();
											Thread::Sleep(100);
											PortController::turnOnLED_RFID2();
											TimeToPlayVar2 = TimeToPlay;		
											TimeCableWay2 = TimeToPlay * 60;
											break; // !2st place; get out of WHILE		
										}
									}
								}		
								else		
								{		
									if (KeyArray[i][1] >= TimeToPlay)		
									{		
										//MessageBox::Show("start timerDelay");
										NumberKeyCableWay2 = i;	
										flagDelayUseCard_RFID2 = true;
										//MessageBox::Show("Use card");
										flagStartTimerDelayCableWay2 = true;
										PortController::turnOnSiren2();
										Thread::Sleep(100);
										PortController::turnOnBuzzer2();
										Thread::Sleep(100);
										PortController::turnOnLED_RFID2();
										TimeToPlayVar2 = TimeToPlay;		
										TimeCableWay2 = TimeToPlay * 60;
										break; // !2st place; get out of WHILE		
									}				
								}		
							}		
						}		
					}		
					else		
					{	
						if (FlagAbonementWorkCableWay2)
						{
							if (KeyArray[NumberKeyCableWay2][4] >= (2 * TimeToPlay))
							{
								TimeToPlayVar2 = 2 * TimeToPlay;		
								TimeCableWay2 = 2 * 60 * TimeToPlay;

								flagDelayUseCard_RFID2 = true;
								PortController::turnOnBuzzer2();
							}
							else
							{
								if (RFIDReader2 == KeyArray[NumberKeyCableWay2][0])		
								{		
									if (KeyArray[NumberKeyCableWay2][1] >= TimeToPlay)		
									{		
										TimeToPlayVar2 = 2 * TimeToPlay;		
										TimeCableWay2 = 2 * 60 * TimeToPlay;

										flagDelayUseCard_RFID2 = true;
										PortController::turnOnBuzzer2();
										//break; // !1st place; get out of WHILE
									}		
								}	
							}
						}
						else
						{
							if (RFIDReader2 == KeyArray[NumberKeyCableWay2][0])		
							{		
								if (KeyArray[NumberKeyCableWay2][1] >= (2 * TimeToPlay))		
								{		
									TimeToPlayVar2 = 2 * TimeToPlay;		
									TimeCableWay2 = 2 * 60 * TimeToPlay;

									flagDelayUseCard_RFID2 = true;
									PortController::turnOnBuzzer2();
									//break; // !1st place; get out of WHILE
								}		
							}		
						}
					}
					//
				}	
			}

		}

		RFIDReader2 = 0;
	}

	public void rfidReaderCashier()
	{
		if (RFIDReaderCashier != 0)		
		{			
			if (!FlagRFIDCashier && NumberKeyCashier == 0)		
			{		
				for (int i = 1; i <= ROWS; i++)		
				{		
					if (RFIDReaderCashier == KeyArray[i][0])		
					{		
						NumberKeyCashier = i;		
						FlagRFIDCashier = true;		
						// Invalidate(); ??			
						break; // out of for cycle!		
					}		
				}
		
				if (NumberKeyCashier == 0)		
				{		
					FlagNewKey = true;	
					FlagRFIDCashier = true;		
					
					for (int i = 1; i <= ROWS; i++)		
					{		
						if (KeyArray[i][0] == 0)		
						{		
							NumberKeyCashier = i;
							KeyArray[i][0] = RFIDReaderCashier;
							break; // out of for cycle!		
						}		
					}

					// Call new window		
				}		
			}		
		}
	
		RFIDReaderCashier = 0;	
	}
*/
    }
}