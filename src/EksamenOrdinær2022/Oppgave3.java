package EksamenOrdinær2022;

import static javax.swing.JOptionPane.*;

public class Oppgave3
{
    public static void main(String[] args)
    {
        //Det skal lages et program som regner ut BMI (Body Mass Index).
        // Det skal brukes input-dialogbokser og meldingsboks fra Swing- biblioteket.

        //Først skal det leses inn vekten (i kg) og deretter høyden (i cm)

        String innVekt = showInputDialog("Skriv inn din vekt (kg)");    //Leser inn vekt
        String innHøyde = showInputDialog("Skriv inn din høyde (cm)");  //Leser inn høyde

        //Definerer variabler vi skal bruke
        double vekt;
        double høyde;
        double BMI=0;


            /*
            Så skal BMI'en regnes ut med følgende formel:
            ( 1,3 * vekt) / ( høyde/100)^ 2,5 )
            ( 1,3 * vekt) / (( høyde/100) ^ 2,5 )
            ^2,5 står for "opphøyd i". Bruk Math.pow(a,b) der a er grunntallet og b eksponenten.
             */

        try{    //Sjekker om alle input er riktig og regner ut BMI
            vekt = Double.parseDouble(innVekt);
            høyde = Double.parseDouble(innHøyde);

            BMI= (1.3*vekt) / (Math.pow((høyde/100),2.5)); //Utregning

            //Resultatet skal så skrives ut i en meldingsboks med passende ledetekst.

            String ut = "Din vekt er " + vekt + " kg, og din høyde er " + høyde +" cm\n" +
                    "Din BMI blir: " + BMI;

            showMessageDialog(null, ut);
        }
        catch (Exception e)
        {
            //Dersom det skrives inn noe annet enn tall skal det skrives ut en feilmelding i meldingsboksen isteden for beregningen.

            String ut = "Din input var ikke gyldig! Skriv inn tall!";
            showMessageDialog(null, ut);
        }
    }
}

