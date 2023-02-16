using System;
using System.Collections.Generic;
using System.Text;
using System.Windows.Forms;
namespace WinFormsApp1
{
    class sportsmen
    {
        public string name = "0";
        public string otch = "0";
        public string familia = "0";
        public string pol;
        public DateTime age;
        public double rost;
        public double ves;
        public string type_of_sport;
        public bool chelovek(string name1, string otch1, string familia1, string pol1, DateTime age1, double rost1, double ves1, string type_of_sport1)
        {
            char[] OGname = name1.ToCharArray();
            char[] OGotch = otch1.ToCharArray();
            char[] OGf = familia1.ToCharArray();
            char[] tos = type_of_sport1.ToCharArray();
            bool s = true;
            if (name1 != "" && familia1 != "" && otch1 != ""&& type_of_sport1!="")
            {
                for (int i = 0; i < OGname.Length; i++)
                {
                    if (!Char.IsLetter(OGname[i]))
                    {
                        MessageBox.Show("Встроке должны быть лишь буквы", "Сообщение", MessageBoxButtons.OK);
                        s = false;
                        break;
                    }

                }
                for (int i = 0; i < OGf.Length; i++)
                {
                    if (!Char.IsLetter(OGf[i]))
                    {
                        MessageBox.Show("Встроке должны быть лишь буквы", "Сообщение", MessageBoxButtons.OK);
                        s = false;
                        break;
                    }
                }
                for (int i = 0; i < OGotch.Length; i++)
                {
                    if (!Char.IsLetter(OGotch[i]))
                    {
                        MessageBox.Show("Встроке должны быть лишь буквы", "Сообщение", MessageBoxButtons.OK);
                        s = false;
                        break;
                    }

                }
                if (rost1 > 0 && rost1 < 235)
                {
                    rost = rost1;
                }
                else
                {
                    MessageBox.Show("Рост введён неправильно", "Сообщение", MessageBoxButtons.OK);
                    s = false;
                }
                if (ves1 > 0 && ves1 < 150)
                {
                    ves = ves1;
                }
                else
                {
                    MessageBox.Show("Рост введён неправильно", "Сообщение", MessageBoxButtons.OK);
                    s = false;
                }
                if()
            }

        }
    }
}
