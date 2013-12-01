package com.dkdf.cableway.gui;

/**
 * Created with IntelliJ IDEA.
 * User: Дмитрий
 * Date: 22.11.13
 * Time: 21:35
 * To change this template use File | Settings | File Templates.
 */
public class MainWindow
{
    /*
    void OnIdleHandler(Object^ sender, EventArgs^ e)		// Edit!
    {
        if (numberKeyTable != 0)
        {
            dataGridView1->Rows[numberKeyTable - 1]->Cells[0]->Value = System::Convert::ToString(numberKeyTable );

            //dataGridView1->Rows[numberKeyTable - 1]->Cells[1]->Value = System::Convert::ToString(KeyArray[numberKeyTable][0]);

            dataGridView1->Rows[numberKeyTable - 1]->Cells[1]->Value = "**" + System::Convert::ToString(KeyArray[numberKeyTable][0] % 1000);

            dataGridView1->Rows[numberKeyTable - 1]->Cells[2]->Value = System::Convert::ToString(KeyArray[numberKeyTable][1]);
            dataGridView1->Rows[numberKeyTable - 1]->Cells[3]->Value = System::Convert::ToString(KeyArray[numberKeyTable][2]);
            dataGridView1->Rows[numberKeyTable - 1]->Cells[4]->Value = System::Convert::ToString(KeyArray[numberKeyTable][3]);
            dataGridView1->Rows[numberKeyTable - 1]->Cells[5]->Value = ArrayController::Surnames[numberKeyTable];
            dataGridView1->Rows[numberKeyTable - 1]->Cells[6]->Value = System::Convert::ToString(KeyArray[numberKeyTable][5]);
            Invalidate();
            numberKeyTable = 0;
        }

        if (FlagRFIDCashier)
        {
            FlagRFIDCashier = false;

            CashierWindow^ cashierWindow = gcnew CashierWindow;
            cashierWindow->Show();
            cashierWindow->Text = "Окно кассира";
        }

        if (flagStartTimerDelayCableWay1)
        {
            flagStartTimerDelayCableWay1 = false;			// From below Edit!
            MainTimer::StartTimerDelayCableWay1Main();
            MainTimer::StartTimer1TurnOffSiren_CableWay1Main();
        }

        if (flagDelayUseCard_RFID1)
        {
            MainTimer::StartTimerDelayUseCard_RFID1Main();

            if (FlagAbonementWorkCableWay1)
            {
                this->label13->Visible = true;
            }
        }

        //-------------------------------------------------------------------------------------
        if (flagStartTimerDelayCableWay2)
        {
            flagStartTimerDelayCableWay2 = false;			// From below Edit!
            MainTimer::StartTimerDelayCableWay2Main();
            MainTimer::StartTimer1TurnOffSiren_CableWay2Main();
        }

        if (flagDelayUseCard_RFID2)
        {
            MainTimer::StartTimerDelayUseCard_RFID2Main();

            if (FlagAbonementWorkCableWay2)
            {
                this->label20->Visible = true;
            }
        }
        //-------------------------------------------------------------------------------------
        if (flagInvalidateTable)							// If key was deleted then invalidate table
        {
            flagInvalidateTable = false;

            for (int i = 0; i <= ROWS-1; i++)
            {
                dataGridView1->Rows[i]->Cells[0]->Value = System::Convert::ToString(i + 1);

                //dataGridView1->Rows[i]->Cells[1]->Value = System::Convert::ToString(KeyArray[i + 1][0]);

                dataGridView1->Rows[i]->Cells[1]->Value = "**" + System::Convert::ToString(KeyArray[i + 1][0] % 1000);

                dataGridView1->Rows[i]->Cells[2]->Value = System::Convert::ToString(KeyArray[i + 1][1]);
                dataGridView1->Rows[i]->Cells[3]->Value = System::Convert::ToString(KeyArray[i + 1][2]);
                dataGridView1->Rows[i]->Cells[4]->Value = System::Convert::ToString(KeyArray[i + 1][3]);
                dataGridView1->Rows[i]->Cells[5]->Value = ArrayController::Surnames[i + 1];
                dataGridView1->Rows[i]->Cells[6]->Value = System::Convert::ToString(KeyArray[i + 1][5]);
            }

            Invalidate();
        }


        if (flagInvalidate)
        {
            flagInvalidate = false;

            if (flagGluk)
            {
                this->label22->Visible = true;
            }
            else
            {
                this->label22->Visible = false;
            }

            //this->label3->Text = "Браслет:  " + System::Convert::ToString(KeyArray[NumberKeyCableWay1][0]);
            this->label3->Text = "Браслет:  " + "**" + System::Convert::ToString(KeyArray[NumberKeyCableWay1][0] % 1000);
            this->label4->Text = "Фамилия:  " + ArrayController::Surnames[NumberKeyCableWay1];
            this->label5->Text = "Номер абонемента:   " + System::Convert::ToString(KeyArray[NumberKeyCableWay1][3]);

            this->label17->Text = "Браслет:  " + "**" + System::Convert::ToString(KeyArray[NumberKeyCableWay2][0] % 1000);
            this->label18->Text = "Фамилия:  " + ArrayController::Surnames[NumberKeyCableWay2];
            this->label19->Text = "Номер абонемента:   " + System::Convert::ToString(KeyArray[NumberKeyCableWay2][3]);

            if (FlagWorkCableWay1)
            {
                this->label2->BackColor = System::Drawing::Color::LightPink;
                this->button1->Text = System::Convert::ToString(TimeCableWay1 / 60) + " : " + System::Convert::ToString(TimeCableWay1 % 60);

                if (FlagAbonementWorkCableWay1)
                {
                    this->label13->Visible = true;
                }
                else
                {
                    this->label13->Visible = false;
                }
            }
            else
            {
                this->label13->Visible = false;
                this->label2->BackColor = System::Drawing::Color::LawnGreen;
            }

            if (NumberKeyCableWay1 != 0 && FlagWorkCableWay1 == false)
            {
                this->label2->BackColor = System::Drawing::Color::PaleTurquoise;
            }
            //--------------------------------------------------------------------------------
            if (FlagWorkCableWay2)
            {
                this->label16->BackColor = System::Drawing::Color::LightPink;
                this->button2->Text = System::Convert::ToString(TimeCableWay2 / 60) + " : " + System::Convert::ToString(TimeCableWay2 % 60);

                if (FlagAbonementWorkCableWay2)
                {
                    this->label20->Visible = true;
                }
                else
                {
                    this->label20->Visible = false;
                }
            }
            else
            {
                this->label20->Visible = false;
                this->label16->BackColor = System::Drawing::Color::LawnGreen;
            }

            if (NumberKeyCableWay2 != 0 && FlagWorkCableWay2 == false)
            {
                this->label16->BackColor = System::Drawing::Color::PaleTurquoise;
            }
            //--------------------------------------------------------------------------------
            if (flagAdmin)			// been down there: if();
            {
                this->label14->Visible = true;
                this->label21->Visible = true;
                this->WindowToolStripMenuItem->Visible = true;
            }
            else
            {
                this->label14->Visible = false;
                this->label21->Visible = false;
                this->WindowToolStripMenuItem->Visible = false;
            }

            this->label1->Text = "Стоимость прокатного времени:     " + System::Convert::ToString(Definitions[0]) + " грн / " +
                System::Convert::ToString(TimeToPlay) + " мин";

            this->label7->Text = "1)        " + ArrayController::DaysOfWeek[Abonement[1][0]] + " - " + ArrayController::DaysOfWeek[Abonement[1][1]]
            + "   " + System::Convert::ToString(Abonement[1][2]) + " - " + System::Convert::ToString(Abonement[1][3]) + "     "
                + System::Convert::ToString(Abonement[1][4]) + " грн";

            this->label8->Text = "2)        " + ArrayController::DaysOfWeek[Abonement[2][0]] + " - " + ArrayController::DaysOfWeek[Abonement[2][1]]
            + "   " + System::Convert::ToString(Abonement[2][2]) + " - " + System::Convert::ToString(Abonement[2][3]) + "     "
                + System::Convert::ToString(Abonement[2][4]) + " грн";

            this->label9->Text = "3)        " + ArrayController::DaysOfWeek[Abonement[3][0]] + " - " + ArrayController::DaysOfWeek[Abonement[3][1]]
            + "   " + System::Convert::ToString(Abonement[3][2]) + " - " + System::Convert::ToString(Abonement[3][3]) + "     "
                + System::Convert::ToString(Abonement[3][4]) + " грн";

            this->label10->Text = "4)        " + ArrayController::DaysOfWeek[Abonement[4][0]] + " - " + ArrayController::DaysOfWeek[Abonement[4][1]]
            + "   " + System::Convert::ToString(Abonement[4][2]) + " - " + System::Convert::ToString(Abonement[4][3]) + "     "
                + System::Convert::ToString(Abonement[4][4]) + " грн";

            this->label11->Text = "5)        " + ArrayController::DaysOfWeek[Abonement[5][0]] + " - " + ArrayController::DaysOfWeek[Abonement[5][1]]
            + "   " + System::Convert::ToString(Abonement[5][2]) + " - " + System::Convert::ToString(Abonement[5][3]) + "     "
                + System::Convert::ToString(Abonement[5][4]) + " грн";

            this->label12->Text = "6)        " + ArrayController::DaysOfWeek[Abonement[6][0]] + " - " + ArrayController::DaysOfWeek[Abonement[6][1]]
            + "   " + System::Convert::ToString(Abonement[6][2]) + " - " + System::Convert::ToString(Abonement[6][3]) + "     "
                + System::Convert::ToString(Abonement[6][4]) + " грн";


            Invalidate();

            if (Port2Enabled)
            {
                this->Text = System::Convert::ToString(myCounter) + "          "
                    + System::Convert::ToString(currentDay) + "."
                    + System::Convert::ToString(currentMonth) + "." + System::Convert::ToString(currentYear) + " - E " + System::Convert::ToString(errorCounter);



            }
            else
            {
                this->Text = System::Convert::ToString(myCounter) + "          "
                    + System::Convert::ToString(currentDay) + "."
                    + System::Convert::ToString(currentMonth) + "." + System::Convert::ToString(currentYear) + "          (АВТОНОМНЫЙ РЕЖИМ)";

            }
        }
    }
    */

    /*
    System::Void MainWindow_Load(System::Object^  sender, System::EventArgs^  e)
		 {
			 Application::Idle += gcnew System::EventHandler (this, &MainWindow::OnIdleHandler);		// Edit!

			 System::Threading::Thread::Sleep(2000);

			 if (FileController::RecoverFileExists())
			 {
				 label15->Visible = true;
			 }
			 else
			 {
				 label15->Visible = false;
			 }

			 if (flagGluk)
			 {
				 this->label22->Visible = true;
			 }
			 else
			 {
				 this->label22->Visible = false;
			 }

			 this->KeyPreview = true; // Last Edit!
			 this->dataGridView1->SelectionMode = DataGridViewSelectionMode::FullRowSelect; // Last edit!

			 this->dataGridView1->Rows->Add(1000);

			 for (int i = 0; i <= ROWS-1; i++) // Last edit!
			 {
				 dataGridView1->Rows[i]->Cells[0]->Value = System::Convert::ToString(i + 1);

				 //dataGridView1->Rows[i]->Cells[1]->Value = System::Convert::ToString(KeyArray[i + 1][0]);

				 dataGridView1->Rows[i]->Cells[1]->Value = "**" + System::Convert::ToString(KeyArray[i + 1][0] % 1000);

				 dataGridView1->Rows[i]->Cells[2]->Value = System::Convert::ToString(KeyArray[i + 1][1]);
				 dataGridView1->Rows[i]->Cells[3]->Value = System::Convert::ToString(KeyArray[i + 1][2]);
				 dataGridView1->Rows[i]->Cells[4]->Value = System::Convert::ToString(KeyArray[i + 1][3]);
				 dataGridView1->Rows[i]->Cells[5]->Value = ArrayController::Surnames[i + 1];
				 dataGridView1->Rows[i]->Cells[6]->Value = System::Convert::ToString(KeyArray[i + 1][5]);
			 }

			 this->label1->Text = "Стоимость прокатного времени:     "
								+ System::Convert::ToString(Definitions[0]) + " грн / "
								+ System::Convert::ToString(TimeToPlay) + " мин";

			 if (FlagWorkCableWay1)
			 {
				 this->label2->BackColor = System::Drawing::Color::LawnGreen;
				 this->label3->Text = "Браслет:  " + "**" + System::Convert::ToString(KeyArray[NumberKeyCableWay1][0] % 1000);
					 //System::Convert::ToString(KeyArray[NumberKeyCableWay1][0]);
				 this->label4->Text = "Фамилия:  " + ArrayController::Surnames[NumberKeyCableWay1];
				 this->label5->Text = "Номер абонемента:   " + System::Convert::ToString(KeyArray[NumberKeyCableWay1][3]);
				 this->button1->Text = System::Convert::ToString(TimeCableWay1);
			 }
			 //--------------------------------------------------------------------------
			 if (FlagWorkCableWay2)
			 {
				 this->label16->BackColor = System::Drawing::Color::LawnGreen;
				 this->label17->Text = "Браслет:  " + "**" + System::Convert::ToString(KeyArray[NumberKeyCableWay2][0] % 1000);
				 //System::Convert::ToString(KeyArray[NumberKeyCableWay1][0]);
				 this->label18->Text = "Фамилия:  " + ArrayController::Surnames[NumberKeyCableWay2];
				 this->label19->Text = "Номер абонемента:   " + System::Convert::ToString(KeyArray[NumberKeyCableWay2][3]);
				 this->button2->Text = System::Convert::ToString(TimeCableWay2);
			 }
			 //--------------------------------------------------------------------------
			 this->label7->Text = "1)        " + ArrayController::DaysOfWeek[Abonement[1][0]] + " - " + ArrayController::DaysOfWeek[Abonement[1][1]]
				+ "   " + System::Convert::ToString(Abonement[1][2]) + " - " + System::Convert::ToString(Abonement[1][3]) + "     "
				+ System::Convert::ToString(Abonement[1][4]) + " грн"; // exception!

				this->label8->Text = "2)        " + ArrayController::DaysOfWeek[Abonement[2][0]] + " - " + ArrayController::DaysOfWeek[Abonement[2][1]]
				+ "   " + System::Convert::ToString(Abonement[2][2]) + " - " + System::Convert::ToString(Abonement[2][3]) + "     "
					+ System::Convert::ToString(Abonement[2][4]) + " грн";

				this->label9->Text = "3)        " + ArrayController::DaysOfWeek[Abonement[3][0]] + " - " + ArrayController::DaysOfWeek[Abonement[3][1]]
				+ "   " + System::Convert::ToString(Abonement[3][2]) + " - " + System::Convert::ToString(Abonement[3][3]) + "     "
					+ System::Convert::ToString(Abonement[3][4]) + " грн";

				this->label10->Text = "4)        " + ArrayController::DaysOfWeek[Abonement[4][0]] + " - " + ArrayController::DaysOfWeek[Abonement[4][1]]
				+ "   " + System::Convert::ToString(Abonement[4][2]) + " - " + System::Convert::ToString(Abonement[4][3]) + "     "
					+ System::Convert::ToString(Abonement[4][4]) + " грн";

				this->label11->Text = "5)        " + ArrayController::DaysOfWeek[Abonement[5][0]] + " - " + ArrayController::DaysOfWeek[Abonement[5][1]]
				+ "   " + System::Convert::ToString(Abonement[5][2]) + " - " + System::Convert::ToString(Abonement[5][3]) + "     "
					+ System::Convert::ToString(Abonement[5][4]) + " грн";

				this->label12->Text = "6)        " + ArrayController::DaysOfWeek[Abonement[6][0]] + " - " + ArrayController::DaysOfWeek[Abonement[6][1]]
				+ "   " + System::Convert::ToString(Abonement[6][2]) + " - " + System::Convert::ToString(Abonement[6][3]) + "     "
					+ System::Convert::ToString(Abonement[6][4]) + " грн";

				this->label13->Visible = false;
				this->label20->Visible = false;

				if (flagAdmin)
				{
					this->label14->Visible = true;
					this->label21->Visible = true;
					this->WindowToolStripMenuItem->Visible = true;
				}
				else
				{
					this->label14->Visible = false;
					this->label21->Visible = false;
					this->WindowToolStripMenuItem->Visible = false;
				}

				//MessageBox::Show("Number: " + dataGridView1->Rows[1]->Cells[1]->Value);
		 }
     */

    /*
    System::Void WindowAdminToolStripMenuItem_MouseDown(System::Object^  sender, System::Windows::Forms::MouseEventArgs^  e)
		 {
			 if (flagAdmin)
			 {
				 AdminWindow^ adminWindow = gcnew AdminWindow;
				 adminWindow->Show();
			 }
		 }
     */
}