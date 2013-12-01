package com.dkdf.cableway.core;

/**
 * Created with IntelliJ IDEA.
 * User: Дмитрий
 * Date: 22.11.13
 * Time: 21:28
 * To change this template use File | Settings | File Templates.
 */
public class MainProgram
{
    //PortController::Main(); // Assign RTS, DTR values and other!
        /*
    if (Port1Enabled)
    {
        try
        {
            PortController::serialPort1->Open();
        }
        catch (UnauthorizedAccessException^)
        {
            //MessageBox::Show("PFX Запустите программу с правами администратора!");
        }
        catch (IOException^)
        {
            //MessageBox::Show("Ошибка при открытии 1-го порта!");
        }

        FileController::LogCritical(DateTime::Now + " Порт 1 открыт");
        PortController::CheckPort1Ready();
    }
    if (Port2Enabled)
    {
        try
        {
            PortController::serialPort2->Open();
        }
        catch (UnauthorizedAccessException^)
        {
            //MessageBox::Show("PFX Запустите программу с правами администратора!");
        }
        catch (IOException^)
        {
            //MessageBox::Show("Ошибка при открытии 2-го порта!");
        }

        FileController::LogCritical(DateTime::Now + " Порт 2 открыт");
        PortController::CheckPort2Ready();
    }
    //-------------------------------------------------------------------------------------------

    // Test! Send STOP to CableWay 1 & 2!

    PortController::StartCableway1();
    PortController::StartCableway2();

    System::Threading::Thread::Sleep(3000);

    PortController::StopCableway1();
    PortController::StopCableway2();
             */
}