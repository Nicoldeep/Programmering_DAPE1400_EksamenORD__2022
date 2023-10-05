package EksamenOrdinær2022;

//Lag en klasse kalt Liste for å behandle arrays.//
//Lag følgende statiske metoder i denne klassen som behandler arrays:

class Liste
{
    //1)  Tar et heltallsarray inn og returnerer hvor mange elementer som er større enn null

    public static int antallElementerStørreEnnNull(int[] innListe)  //Metode for å finne antall elementer større enn 0
    {
        int teller=0;

        for(int elementIArray : innListe)   //Løpet gjennom hele listen
        {
            if(elementIArray>0)
            {
                teller++;
            }
        }
        return teller;  //Return antall elementer større enn 0
    }


    //2)  Tar et heltallsarray inn og finner ut hvor mange ganger et bestemt tall forekommer (tallet skal også  inn i metoden)

    public static int antallGangerTallForekommer(int[] innListe, int innTall)   //Metode for å finne antall ganger et tall forekommer
    {
        int teller=0;
        for(int elementIArray : innListe)   //Løper gjennom listen
        {
            if(elementIArray==innTall){
                teller++;
            }
        }
        return teller;  //Return antall ganger tallet forekom i listen
    }


    //3) Tar et heltallsarray inn og finner det største tallet i array

    public static int størsteTall(int[] innListe)   //Metode for å finne det største tallet i en liste
    {
        int størsteTall=0;

        for(int elementIArray : innListe)   //Løper gjennom listen
        {
            if(elementIArray>størsteTall)
            {
                størsteTall=elementIArray;
            }
        }
        return størsteTall; //Retun det største tallet i listen
    }
}

public class Oppgave2
{
    public static void main(String[] args)
    {
            /*
            Til slutt skriv kode i main-metoden for å kalle de ulike metodene med et heltallsarray
            Resultatet skal skrives ut på System.out.
             */

        int[] liste = {1, 2, 3, 5, 2, 90, -10, 2, -20}; //Definerer et array
        int tall = 2;   //Definerer et tall som vi vil sjekke om forekommer i arrayet

        //Sjekker antall elementer større enn 0 metoden
        System.out.println("Antall elementer større enn null i listen er: " + Liste.antallElementerStørreEnnNull(liste));

        //Sjekker antall ganger et tall forekommer metoden
        System.out.println("Antall ganger tallet " + tall + " forekommer i listen er: " + Liste.antallGangerTallForekommer(liste, tall));

        //Sjekker støste tall metoden
        System.out.println("Største tall i listen er: " + Liste.størsteTall(liste));
    }
}
