package EksamenOrdinær2022;

 /*
    Lag en klasse kalt KonverterTemperatur.
    Denne klassen skal inneholde to statiske metoder kalt tilCelsius og tilFahrenheiht.
    Metodene skal regne ut fra Fahernheit til Celsius i den ene metoden og motsatt i den andre.
    Metodene skal motta og returnere et desimal tall.
     */

class KonverterTemperatur
{
    public static double tilCelsius(double innFahrenheiht)  //Metode som gjør fahrenheiht om til celcius
    {
        //C = (F - 32) / 1.8 - FORMEL

        double celcius=0;
        celcius= (innFahrenheiht - 32) / 1.8;   //Utregning
        return celcius; //Retrurerer grader i celcius
    }

    public static double tilFahrenheiht(double innCelsius) //Metode som gjør celcius om til fahrenheiht
    {
        //F = C * 1.8 + 32 - FORMEL

        double fahrenheiht;
        fahrenheiht= innCelsius * 1.8 + 32; //Utregning
        return fahrenheiht; //Returerer grader i fahrenheiht
    }
}


public class Oppgave4
{
    public static void main(String[] args)
    {
        //Skriv så kode i main-metoden for å vise hvordan man benytter seg av klassen / metodene.

        double graderCelcius = 0;   //Definerer grader i celcius
        double graderFahrenheiht = 50;  //Definerer grader i fahrenheiht

        //Tester tilFahrenheiht metoden
        System.out.println(graderCelcius + " grader Celcius, i fahrenheiht blir: " + KonverterTemperatur.tilFahrenheiht(graderCelcius));

        //Tester tilCelcius metoden
        System.out.println(graderFahrenheiht + " grader Fahrenheiht, i celcius blir: " + KonverterTemperatur.tilCelsius(graderFahrenheiht));



        //TESTE MED ANDRE TALL:
        System.out.println(); //Mellomrom

        graderCelcius = 20;   //Definerer grader i celcius
        graderFahrenheiht = 5;  //Definerer grader i fahrenheiht

        //Tester tilFahrenheiht metoden
        System.out.println(graderCelcius + " grader Celcius, i fahrenheiht blir: " + KonverterTemperatur.tilFahrenheiht(graderCelcius));

        //Tester tilCelcius metoden
        System.out.println(graderFahrenheiht + " grader Fahrenheiht, i celcius blir: " + KonverterTemperatur.tilCelsius(graderFahrenheiht));
    }
}