package com.dkdf.cableway.oldstuff;

public final class Definitions
{
    private final int TIME_TO_PLAY = 5;								// Единица прокатного времени
    private final int TIME_BEFORE_STOP_BEEP_WARNING = 5;			// -

	/* msec! Время звучания сирены, когда ключ первый раз поднесен и прошел проверку.*/

    private final int TIME_ALARM_BEEP_WHEN_PRESENTATION_RFID = 300;
    private final int TIME_DURATION_BEEP_START_STOP = 1000;			// msec!

	/* sec! Время от поднесения ключа до старта дороги */

    private final int CABLEWAY_START_DELAY = 10;

    public static final int PORT_1 = 1;
    public static final int PORT_2 = 2;

    //---------------------------------------------------------------------------------------------

    private int rfidReader1 = 0;						// Ответ (номер ключа) от Reader1
    private int rfidReader2 = 0;						// Ответ (номер ключа) от Reader2
    private int rfidReaderCashier = 0;					// Ответ (номер ключа) от Reader кассира

    private int numberAbonementCableway1 = 0;			// Номер абонемента на ключе, который катается на Канатке 1
    private int numberAbonementCableway2 = 0;			// Номер абонемента на ключе, который катается на Канатке 2

    private int numberKeyCashier = 0;					// Номер ключа, который поднесен к кассиру

    private int numberKeyCableway1 = 0;					// Номер ключа, который катается на Канатке 1
    private int numberKeyCableway2 = 0;					// Номер ключа, который катается на Канатке 2

    private int timeCableway1 = 0;						// (Сек.) Время, оставшееся до конца катания Канатки 1
    private int timeCableway2 = 0;						// (Сек.) Время, оставшееся до конца катания Канатки 2

    private int timeToPlayVar1 = 0;						// (Мин.) Время, за которое будет кататься на Канатке 1
    private int timeToPlayVar2 = 0;						// (Мин.) Время, за которое будет кататься на Канатке 2

    private boolean flagWorkCableway1 = false;			// Флаг, показывающий, что Канатка 1 - работает
    private boolean flagWorkCableway2 = false;			// Флаг, показывающий, что Канатка 2 - работает

    private boolean flagRFIDCashier = false;			// Флаг, показывающий, что сейчас работаем с поднесенным ключем
    private boolean flagNewKey = false;					// Флаг, показывающий, что ключа нет в базе
	
	/*
	 * 
//-------------------------Global-Variables-----------------------------------
bool flagGluk = false; // Last Edit!
int errorCounter = 0;

int myCounter = 1;
int myCounter2 = 1;

int codeCardPrevent1 = -1;
int codeCardPrevent2 = -1;
int codeCardPrevent3 = -1;
int codeCardPrevent4 = -1;

int timePrevent1 = 0;
int timePrevent2 = 0;
int timePrevent3 = 0;
int timePrevent4 = 0;

int numberKeyTable = 0;

bool flagDelayUseCard_RFID1 = false;
bool flagDelayUseCard_RFID2 = false;

bool FlagAbonementWorkCableWay1 = false;
bool FlagAbonementWorkCableWay2 = false;

bool flagStartTimerDelayCableWay1 = false;
bool flagStartTimerDelayCableWay2 = false;

bool FlagWorkCableWay1 = false;
bool FlagWorkCableWay2 = false;

bool successLogin = false;
bool flagAdmin = false;

bool flagInvalidate = false;
bool flagInvalidateTable = false;

bool flagReturnMoney = false;
bool flagEnterMoney = false;
bool flagEnterSurname = false;

bool flagKeyArrayNotEmpty = false;

//-------------------------------------------
bool flagReadTimeoutPort1 = false;
bool flagReadTimeoutPort2 = false;

bool Port1Enabled = false;
bool Port2Enabled = false;

bool Port1Ready = false;
bool Port2Ready = false;

bool flagPort1Using = false;
bool flagPort2Using = false;
//-------------------------------------------

int TimeHours = 0; // Current time in HOURS!
int TimeMinutes = 0;
int TimeSeconds = 0;
int currentDayOfWeek = 0;

int currentDay = 0;
int currentMonth = 0;
int currentYear = 0;

int lastDay = 0;
int lastDayOfWeek = 0;
int lastMonth = 0;
int lastYear = 0;

//-------------------------------------------
System::Byte accesssTypePort1;
System::Byte cardCode0Port1;
System::Byte cardCode1Port1;
System::Byte cardCode2Port1;

System::Byte codeCommandPort1;
//-------------------------------------------
System::Byte accesssTypePort2;
System::Byte cardCode0Port2;
System::Byte cardCode1Port2;
System::Byte cardCode2Port2;

System::Byte codeCommandPort2;
//-------------------------------------------
//-----------------------End-Of-Global-Variables------------------------------
	 */
}