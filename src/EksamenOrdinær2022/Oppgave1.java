package EksamenOrdinær2022;

public class Oppgave1
{
    public static void main(String[] args)
    {
        //Gitt et heltallsarray med følgende tall: -3,41,5,-3,2,49. Bruk dette arrayet for å:

        int[] liste = {-3,41,5,-3,2,49};       //Definerer arrayet

        //a)  Tell opp hvor mange tall som er større enn 10 og skriv ut resultatet

        int antallStørreEnnTi=0;    //Teller

        for(int elementIArray : liste)  //Løper gjennom hele listen
        {
            if(elementIArray>10)
            {
                antallStørreEnnTi++;    //Legger til 1 for hver gang det er et tall større enn 10
            }
        }

        System.out.println("Antall tall større enn 10 er: " + antallStørreEnnTi);


        //b)  Skriv ut annethvert element
        System.out.println(); //Mellomrom
        System.out.print("Annethvert tall i rekken er: " );

        for(int i=0; i<liste.length; i++)
        {
            if(i % 2 ==0)   //Annenthvert element
            {
                System.out.print(liste[i] + ", ");
            }
        }


        //c)  Skriv ut summen av alle positive tall i arrayet
        System.out.println();//Mellomrom
        System.out.println();//Mellomrom

        int sum=0;  //Sum variabel

        for(int elementIArray : liste)  //Løper gjennom hele arrayet
        {
            if(elementIArray>0)
            {
                sum+=elementIArray;
            }
        }

        System.out.println("Summen av alle positive tall i listen er: " + sum);


        //d) Skriv også ut gjennomsnittet av alle positive tall i arrayet
        System.out.println();   //Mellomrom

        sum=0;
        int teller=0;   //Teller
        double gjennomsnitt=0;     //Definerer variabel for gjennomsnitt

        for(int elementIArray : liste)  //Løper gjennom hele listen
        {
            if(elementIArray>0){
                sum+=elementIArray;
                teller++;
            }
        }

        gjennomsnitt=(double) sum/(double) teller;

        System.out.println("Gjennomsnittet av alle positive heltall i listen er: " + gjennomsnitt);
    }
}
