package com.dkdf.cableway.rfid;

/**
 * Created with IntelliJ IDEA.
 * User: Дмитрий
 * Date: 22.11.13
 * Time: 21:52
 * To change this template use File | Settings | File Templates.
 */
public class OldPortController
{
    /*
    //-------------------------------------------------------------------
// ТАБЛИЦЫ для 4-х битного РАСЧЕТА CRC
unsigned char CRC_Table_High [16] = {
	0x00, 0x10, 0x20, 0x30, 0x40, 0x50, 0x60, 0x70,
	0x81, 0x91, 0xA1, 0xB1, 0xC1, 0xD1, 0xE1, 0xF1
};

unsigned char CRC_Table_Low [16] = {
	0x00, 0x21, 0x42, 0x63, 0x84, 0xA5, 0xC6, 0xE7,
	0x08, 0x29, 0x4A, 0x6B, 0x8C, 0xAD, 0xCE, 0xEF
};

//-------------------------------------------------------------------
unsigned char CRC_High = 0xFF;
unsigned char CRC_Low = 0xFF;

// ТАБЛИЧНЫЙ РАСЧЕТ
void CRC_Update (unsigned char Byte)
{
	unsigned char n = CRC_High >> 4;
	n ^= Byte;
	CRC_High = (CRC_High << 4) | (CRC_Low >> 4);
	CRC_Low <<= 4;
	CRC_High ^= CRC_Table_High [n];
	CRC_Low ^= CRC_Table_Low [n];
}

// РАСЧЕТ CRC ТЕКУЩЕГО БАЙТА
void Calc_CRC (unsigned char Byte)
{
	CRC_Update (Byte >> 4);
	CRC_Update (Byte & 0x0F);
}
//-------------------------------------------------------------------
unsigned char CRC_High2 = 0xFF;
unsigned char CRC_Low2 = 0xFF;

// ТАБЛИЧНЫЙ РАСЧЕТ
void CRC_Update2 (unsigned char Byte)
{
	unsigned char n = CRC_High2 >> 4;
	n ^= Byte;
	CRC_High2 = (CRC_High2 << 4) | (CRC_Low2 >> 4);
	CRC_Low2 <<= 4;
	CRC_High2 ^= CRC_Table_High [n];
	CRC_Low2 ^= CRC_Table_Low [n];
}

// РАСЧЕТ CRC ТЕКУЩЕГО БАЙТА
void Calc_CRC2 (unsigned char Byte)
{
	CRC_Update2 (Byte >> 4);
	CRC_Update2 (Byte & 0x0F);
}
//-------------------------------------------------------------------
public ref class PortController
{
public:
	static int codeResultPort1;
	static int codeResultPort2;

	static String^ PORT1; //= "COM4";
	static String^ PORT2; //= "COM3";

	static SerialPort^ serialPort1; //= gcnew SerialPort(PORT1, 115200, Parity::None, 8, StopBits::One);
	static SerialPort^ serialPort2; //= gcnew SerialPort(PORT2, 115200, Parity::None, 8, StopBits::One);

	static void CreatePort1()
	{
		serialPort1 = gcnew SerialPort(PORT1, 9600, Parity::None, 8, StopBits::One);

		serialPort1->DtrEnable = true;
		serialPort1->RtsEnable = true;

		serialPort1->ReadTimeout = 500;
		serialPort1->WriteTimeout = 500;

		serialPort1->Encoding = Encoding::GetEncoding("utf-8");
	}

	static void CreatePort2()
	{
		serialPort2 = gcnew SerialPort(PORT2, 9600, Parity::None, 8, StopBits::One);

		serialPort2->DtrEnable = true;
		serialPort2->RtsEnable = true;

		serialPort2->ReadTimeout = 500;
		serialPort2->WriteTimeout = 500;


		serialPort2->Encoding = Encoding::GetEncoding("utf-8");
	}

	static void Main()
	{
		if (Port1Enabled)
		{
			//CreatePort1();

			serialPort1 = gcnew SerialPort(PORT1, 115200, Parity::None, 8, StopBits::One);

			serialPort1->DtrEnable = true;
			serialPort1->RtsEnable = true;

			serialPort1->ReadTimeout = 500;
			serialPort1->WriteTimeout = 500;

			serialPort1->Encoding = Encoding::GetEncoding("utf-8");

		}

		if (Port2Enabled)
		{
			//CreatePort2();

			serialPort2 = gcnew SerialPort(PORT2, 115200, Parity::None, 8, StopBits::One);

			serialPort2->DtrEnable = true;
			serialPort2->RtsEnable = true;

			serialPort2->ReadTimeout = 500;
			serialPort2->WriteTimeout = 500;


			serialPort2->Encoding = Encoding::GetEncoding("utf-8");

		}

		//serialPort->Encoding = Encoding::GetEncoding("utf-16");		// Unicode encoding
		//serialPort->Encoding = Encoding::GetEncoding("utf-32");

}

    static void CheckPort()
    {
        array<String^>^ serialPorts = nullptr;

        try
        {
            serialPorts = SerialPort::GetPortNames();
            //MessageBox::Show("Lenght = " + serialPorts->Length);
        }
        catch (Win32Exception^ ex)
        {
            MessageBox::Show(ex->Message);
        }
        //-------------------------------------------------------------------------------------------------------------------
        Port1Enabled = false;
        Port2Enabled = false;

        if (serialPorts->Length >= 2)
        {
            int arrayLenght = serialPorts->Length;

            PORT1 = serialPorts[arrayLenght - 2];
            PORT2 = serialPorts[arrayLenght - 1];

            Port1Enabled = true;
            Port2Enabled = true;
        }
        else
        {
            MessageBox::Show("Ошибка! Не определяются порты!\nПроверьте подключения и драйвера! Программа работает в автономном режиме.");
        }
    }
    //-------------------------------------------------------------------------------------------------------------------
    static void CheckPort1Ready()
    {
        while (flagPort1Using)
        {

        }

        flagPort1Using = true;

        CleanBufferPort1();

        WritePort1(0x01, 0x01, 0x00);
        ReadPort1();

        if (!flagReadTimeoutPort1)
        {
            Port1Ready = true;
        }

        flagPort1Using = false;
    }
    //-------------------------------------------------------------------------------------------------------------------
    static void CheckPort2Ready()
    {
        while (flagPort2Using)
        {

        }

        flagPort2Using = true;

        CleanBufferPort2();

        WritePort2(0x01, 0x01, 0x00);
        ReadPort2();

        if (!flagReadTimeoutPort2)
        {
            Port2Ready = true;
        }

        flagPort2Using = false;
    }
    //-------------------------------------------------------------------------------------------------------------------
    static void ReadCardPort1()		// readcard1 ?
    {
        while (flagPort1Using)
        {

        }


        flagPort1Using = true;
        Thread::Sleep(10);
        //serialPort1->DiscardInBuffer();
        CleanBufferPort1();
        Thread::Sleep(20);
        PortController::WritePort1(0x01, 0x04, 0x00);
        Thread::Sleep(30);
        PortController::ReadPort1();

        String^ s1 = Convert::ToString(cardCode0Port1);
        String^ s2 = Convert::ToString(cardCode1Port1);
        String^ s3 = Convert::ToString(cardCode2Port1);
        codeResultPort1 = (Convert::ToInt32(cardCode0Port1))* 65536 + (Convert::ToInt32(cardCode1Port1))* 256 +(Convert::ToInt32(cardCode2Port1));
        String^ sAll = s3 + s2 + s1;

        flagPort1Using = false;
    }
    //-------------------------------------------------------------------------------------------------------------------
    static void ReadCardPort2()		// readcard2 ?
    {
        while (flagPort2Using)
        {

        }


        flagPort2Using = true;
        Thread::Sleep(10);
        //serialPort2->DiscardInBuffer();
        CleanBufferPort2();
        Thread::Sleep(20);
        PortController::WritePort2(0x01, 0x04, 0x00);
        Thread::Sleep(30);
        PortController::ReadPort2();

        String^ s1 = Convert::ToString(cardCode0Port2);
        String^ s2 = Convert::ToString(cardCode1Port2);
        String^ s3 = Convert::ToString(cardCode2Port2);
        codeResultPort2 = (Convert::ToInt32(cardCode0Port2))* 65536 + (Convert::ToInt32(cardCode1Port2))* 256 +(Convert::ToInt32(cardCode2Port2));
        String^ sAll = s3 + s2 + s1;

        flagPort2Using = false;
    }
    //-------------------------------------------------------------------------------------------------------------------
    static void CleanBufferPort1()
    {
        if (Port1Enabled)
        {

            if (PortController::serialPort1->IsOpen == false)
            {

                try
                {
                    errorCounter++;
                    Thread::Sleep(500);
                    serialPort1->Open();
                }
                catch (UnauthorizedAccessException^)
                {
                    //MessageBox::Show("PFX Запустите программу с правами администратора!");
                }
                catch (IOException^)
                {
                    //MessageBox::Show("Ошибка при открытии 1-го порта!");
                }
            }

            try
            {
                serialPort1->DiscardInBuffer();
            }
            catch (IOException^)
            {
                //MessageBox::Show("Discard in buffer io error!");
            }
            //----------------------------------------------------
            try
            {
                serialPort1->DiscardOutBuffer();
            }
            catch (IOException^)
            {
                //MessageBox::Show("Discard in buffer io error!");
            }
        }
    }
    //-------------------------------------------------------------------------------------------------------------------
    static void CleanBufferPort2()
    {
        if (Port2Enabled)
        {

            if (PortController::serialPort2->IsOpen == false)
            {
                try
                {
                    errorCounter++;
                    Thread::Sleep(500);
                    serialPort2->Open();
                }
                catch (UnauthorizedAccessException^)
                {
                    //MessageBox::Show("PFX Запустите программу с правами администратора!");
                }
                catch (IOException^)
                {
                    //MessageBox::Show("Ошибка при открытии 2-го порта!");
                }

            }


            try
            {
                serialPort2->DiscardInBuffer();
            }
            catch (IOException^)
            {
                MessageBox::Show("Discard in buffer io error!");
            }
            //----------------------------------------------------
            try
            {
                serialPort2->DiscardOutBuffer();
            }
            catch (IOException^)
            {
                MessageBox::Show("Discard in buffer io error!");
            }
        }
    }
    //---------------------------Cableway1 Commands---------------------------------------------------------------------
    static void StartCableway1()
    {
        while (flagPort1Using)
        {

        }

        flagPort1Using = true;
        CleanBufferPort1();
        WritePort1(0x02, 0x05, 0x01);
        flagPort1Using = false;
    }

    static void StopCableway1()
    {
        while (flagPort1Using)
        {

        }

        flagPort1Using = true;
        CleanBufferPort1();
        WritePort1(0x02, 0x05, 0x00);
        flagPort1Using = false;
    }

    static void turnOnSiren1()
    {
        while (flagPort1Using)
        {

        }

        flagPort1Using = true;
        CleanBufferPort1();
        WritePort1(0x02, 0x05, 0x11);
        flagPort1Using = false;
    }

    static void turnOffSiren1()
    {
        while (flagPort1Using)
        {

        }

        flagPort1Using = true;
        CleanBufferPort1();

        WritePort1(0x02, 0x05, 0x10);
        flagPort1Using = false;
    }

    static void turnOnBuzzer1()
    {
        while (flagPort1Using)
        {

        }

        flagPort1Using = true;
        CleanBufferPort1();
        WritePort1(0x02, 0x81, 0x00);
        flagPort1Using = false;
    }

    static void turnOffBuzzer1()
    {
        while (flagPort1Using)
        {

        }

        flagPort1Using = true;
        CleanBufferPort1();
        WritePort1(0x02, 0x80, 0x00);
        flagPort1Using = false;
    }

    static void turnOnLED_RFID1()
    {
        while (flagPort1Using)
        {

        }

        flagPort1Using = true;
        CleanBufferPort1();
        WritePort1(0x02, 0x20, 0x0E);
        flagPort1Using = false;
    }

    static void turnOffLED_RFID1()
    {
        while (flagPort1Using)
        {

        }

        flagPort1Using = true;
        CleanBufferPort1();
        WritePort1(0x02, 0x20, 0x0A);
        flagPort1Using = false;
    }
    //--------------------------------------------------------------------------------------------
    static void turnOnRedLAMP_Cableway1()			// command turn on Hold 1
    {
        while (flagPort1Using)
        {

        }

        flagPort1Using = true;
        CleanBufferPort1();
        WritePort1(0x02, 0x54, 0x03);
        flagPort1Using = false;
    }

    static void turnOnGreenLAMP_Cableway1()			// command turn on Hold 2
    {
        while (flagPort1Using)
        {

        }

        flagPort1Using = true;
        CleanBufferPort1();
        WritePort1(0x02, 0x54, 0x30);
        flagPort1Using = false;
    }

    static void turnOffRedGreenLAMPS_Cableway1()
    {
        while (flagPort1Using)
        {

        }

        flagPort1Using = true;
        CleanBufferPort1();
        WritePort1(0x02, 0x54, 0x00);
        flagPort1Using = false;
    }

    //--------------------------------Cableway2 Commands-------------------------------------------------------------------
    static void StartCableway2()
    {
        while (flagPort2Using)
        {

        }

        flagPort2Using = true;
        CleanBufferPort2();
        WritePort2(0x02, 0x05, 0x01);
        flagPort2Using = false;
    }

    static void StopCableway2()
    {
        while (flagPort2Using)
        {

        }

        flagPort2Using = true;
        CleanBufferPort2();
        WritePort2(0x02, 0x05, 0x00);
        flagPort2Using = false;
    }

    static void turnOnSiren2()
    {
        while (flagPort2Using)
        {

        }

        flagPort2Using = true;
        CleanBufferPort2();
        WritePort2(0x02, 0x05, 0x11);
        flagPort2Using = false;
    }

    static void turnOffSiren2()
    {
        while (flagPort2Using)
        {

        }

        flagPort2Using = true;
        CleanBufferPort2();
        WritePort2(0x02, 0x05, 0x10);
        flagPort2Using = false;
    }

    static void turnOnBuzzer2()
    {
        while (flagPort2Using)
        {

        }

        flagPort2Using = true;
        CleanBufferPort2();
        WritePort2(0x02, 0x81, 0x00);
        flagPort2Using = false;
    }

    static void turnOffBuzzer2()
    {
        while (flagPort2Using)
        {

        }

        flagPort2Using = true;
        CleanBufferPort2();
        WritePort2(0x02, 0x80, 0x00);
        flagPort2Using = false;
    }

    static void turnOnLED_RFID2()
    {
        while (flagPort2Using)
        {

        }

        flagPort2Using = true;
        CleanBufferPort2();
        WritePort2(0x02, 0x20, 0x0E);
        flagPort2Using = false;
    }

    static void turnOffLED_RFID2()
    {
        while (flagPort2Using)
        {

        }

        flagPort2Using = true;
        CleanBufferPort2();
        WritePort2(0x02, 0x20, 0x0A);
        flagPort2Using = false;
    }
    //----------------------------------------------------------------
    static void turnOnRedLAMP_Cableway2()
    {
        while (flagPort2Using)
        {

        }

        flagPort2Using = true;
        CleanBufferPort2();
        WritePort2(0x02, 0x54, 0x03);
        flagPort2Using = false;
    }

    static void turnOnGreenLAMP_Cableway2()
    {
        while (flagPort2Using)
        {

        }

        flagPort2Using = true;
        CleanBufferPort2();
        WritePort2(0x02, 0x54, 0x30);
        flagPort2Using = false;
    }

    static void turnOffRedGreenLAMPS_Cableway2()
    {
        while (flagPort2Using)
        {

        }

        flagPort2Using = true;
        CleanBufferPort2();
        WritePort2(0x02, 0x54, 0x00);
        flagPort2Using = false;
    }
    //-------------------------------------------------------------------------------------------------------------------
    static void WritePort1(System::Byte packetByteCount, System::Byte command, System::Byte data)	 // packetByteCount = N in WBUS protocol
    {


        if (Port1Enabled)
        {
            if (serialPort1->IsOpen == false)
            {
                errorCounter++;
                Thread::Sleep(500);
                serialPort1->Open();
            }

            array<Byte>^ writeBuffer = gcnew array<Byte>(Convert::ToInt32(packetByteCount) + 8){0x3A, 0x00, 0x00, 0x00, packetByteCount, command, data, 0x00, 0x00};
            //array<Byte>^ readBuffer = gcnew array<Byte>(8);		// 8 ?

            for (int i = 0; i < (5 + writeBuffer[4]); i++)
            {
                Calc_CRC(writeBuffer[i]);
            }

            writeBuffer[5 + writeBuffer[4]] = CRC_Low;
            writeBuffer[(5 + writeBuffer[4]) + 1] = CRC_High;

            CRC_High = 0xFF;
            CRC_Low = 0xFF;

            serialPort1->Write(writeBuffer, 0, (7 + writeBuffer[4]));
        }
    }
    //-------------------------------------------------------------------------------------------------------------------
    static void WritePort2(System::Byte packetByteCount, System::Byte command, System::Byte data)	 // packetByteCount = N in WBUS protocol
    {
        if (Port2Enabled)
        {
            if (serialPort2->IsOpen == false)
            {
                errorCounter++;
                Thread::Sleep(500);
                serialPort2->Open();
            }
            array<Byte>^ writeBuffer = gcnew array<Byte>(Convert::ToInt32(packetByteCount) + 8){0x3A, 0x00, 0x00, 0x00, packetByteCount, command, data, 0x00, 0x00};
            //array<Byte>^ readBuffer = gcnew array<Byte>(8);		// 8 ?

            for (int i = 0; i < (5 + writeBuffer[4]); i++)
            {
                Calc_CRC2(writeBuffer[i]);
            }

            writeBuffer[5 + writeBuffer[4]] = CRC_Low2;
            writeBuffer[(5 + writeBuffer[4]) + 1] = CRC_High2;

            CRC_High2 = 0xFF;
            CRC_Low2 = 0xFF;

            serialPort2->Write(writeBuffer, 0, (7 + writeBuffer[4]));
        }
    }
    //-------------------------------------------------------------------------------------------------------------------
    static int ReadPort1()
    {
        if (Port1Enabled)
        {
            if (serialPort1->IsOpen == false)
            {
                errorCounter++;
                Thread::Sleep(500);
                serialPort1->Open();
            }

            int packetByteCount = 25;
            array<Byte>^ readBuffer = gcnew array<Byte>(packetByteCount);

            try
            {
                for (int i = 0; i < packetByteCount; i++)
                {
                    if (serialPort1->IsOpen == false)
                    {
                        errorCounter++;
                        Thread::Sleep(500);
                        serialPort1->Open();

                        codeCommandPort1 = 0;
                        accesssTypePort1 = 0;
                        cardCode0Port1 = 0;
                        cardCode1Port1 = 0;
                        cardCode2Port1 = 0;

                        return 1;
                    }

                    readBuffer[i] = serialPort1->ReadByte();

                    if (i == 3)
                    {
                        packetByteCount = 6 + readBuffer[i];
                    }
                }

            }

            catch (IOException^)
            {

            }

            catch (TimeoutException ^)
            {
                //	MessageBox::Show("\nRead port. Timeout Exception!\n");
            }

            //byteCountPort1 = readBuffer[3];
            codeCommandPort1 = readBuffer[4];
            //errorCodePort1 = readBuffer[5];

            if (codeCommandPort1 == 0x04)
            {
                accesssTypePort1 = readBuffer[7];
                cardCode0Port1 = readBuffer[8];
                cardCode1Port1 = readBuffer[9];
                cardCode2Port1 = readBuffer[10];
            }
        }
        return 0;
    }
    //-------------------------------------------------------------------------------------------------------------------
    static int ReadPort2()
    {
        if (Port2Enabled)
        {
            if (serialPort2->IsOpen == false)
            {
                errorCounter++;
                Thread::Sleep(500);
                serialPort2->Open();
            }

            int packetByteCount = 25;
            array<Byte>^ readBuffer = gcnew array<Byte>(packetByteCount);

            try
            {
                for (int i = 0; i < packetByteCount; i++)
                {
                    if (serialPort2->IsOpen == false)
                    {
                        errorCounter++;
                        Thread::Sleep(500);
                        serialPort2->Open();

                        codeCommandPort1 = 0;
                        accesssTypePort1 = 0;
                        cardCode0Port1 = 0;
                        cardCode1Port1 = 0;
                        cardCode2Port1 = 0;

                        return 1;
                    }
                    readBuffer[i] = serialPort2->ReadByte();

                    if (i == 3)
                    {
                        packetByteCount = 6 + readBuffer[i];
                    }
                }

            }
            catch (IOException^)
            {

            }

            catch (TimeoutException ^)
            {
                //	MessageBox::Show("\nRead port. Timeout Exception!\n");
            }

            //byteCountPort1 = readBuffer[3];
            codeCommandPort2 = readBuffer[4];
            //errorCodePort1 = readBuffer[5];

            if (codeCommandPort2 == 0x04)
            {
                accesssTypePort2 = readBuffer[7];
                cardCode0Port2 = readBuffer[8];
                cardCode1Port2 = readBuffer[9];
                cardCode2Port2 = readBuffer[10];
            }
        }
        return 0;
    }
     */
}