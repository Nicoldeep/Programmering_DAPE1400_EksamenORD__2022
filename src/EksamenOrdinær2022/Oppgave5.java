package EksamenOrdinær2022;

  /*
    Det skal lages et program som registrer bøker i en boksamling.
    Klassene, attributtene og metodene som skal implementeres illustreres i overstående klasse-diagram.
    Lydbok og Papirbok arver Bok-klassen.  Det er bare metodene illustrert i klasse-diagrammet som skal implementeres.
     */

import java.util.ArrayList;

class Bok
{
    private String tittel;
    private String forfatter;
    private double pris;

    public Bok(String tittel, String forfatter, double pris)
    {
        this.tittel = tittel;
        this.forfatter = forfatter;
        this.pris = pris;
    }

    @Override
    public String toString()
    {
        return "Bok\n" +
                "Tittel: " + tittel + "\n" +
                "Forfatter: " + forfatter + "\n" +
                "Pris: " + pris + "\n";
    }
}


class Papirbok extends Bok
{
    private int ISBN;

    public Papirbok(String tittel, String forfatter, double pris, int ISBN)
    {
        super(tittel, forfatter, pris);
        this.ISBN = ISBN;
    }

    @Override
    public String toString()
    {
        return super.toString() +
                "ISBN: " + ISBN + "\n";
    }
}

class LydBok extends Bok
{
    private int lengdeIminutter;

    public LydBok(String tittel, String forfatter, double pris, int lengdeIminutter)
    {
        super(tittel, forfatter, pris);
        this.lengdeIminutter = lengdeIminutter;
    }

    @Override
    public String toString()
    {
        return super.toString() +
                "Lengde (minutter): " + lengdeIminutter + "\n" ;
    }
}


public class Oppgave5
{

    public static void main(String[] args)
    {
            /*
            I main-metoden skal det så opprettes et objekt av hver type (Lydbok og Papirbok).
            Disse skal så legges inn i en ArrayList av type Bok.
            Deretter skal attributtene skrives ut i en løkke ved hjelp av toString()-metodene.
             */

        ArrayList<Bok> bokHylle = new ArrayList<>();    //Lager en arraylist av typen Bok

        Papirbok enPapirbok = new Papirbok("Harry Potter", "Nico", 400,  964763148); //Lager en papirbok
        LydBok enLydbok = new LydBok("Manifest", "Netflix", 800, 90);   //Lager en lydbok

        bokHylle.add(enPapirbok);   //Legger papirboken inn i arrayet
        bokHylle.add(enLydbok);  //legger lydboken inn i arrayet

        for(Bok enBok : bokHylle)   //Skriver ut bøkene i arrayet
        {
            if(enBok!=null)
            {
                System.out.println(enBok);
                System.out.println("------------------");
            }
        }
    }
}
