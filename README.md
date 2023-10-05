# Programmering_DAPE1400_EksamenORD__2022

## Generell infomasjon
Ordinær Eksamen i Programmering (DAPE1400)

**Karakter**: A

**Emnekode**: DAPE1400 Programmering

**Dato**: 12.12.2022

**Vurderingsform**: Skriftlig eksamen under tilsyn

## Oppgaver:

### Oppgave 1 (20%)
Gitt et heltallsarray med følgende tall: -3,41,5,-3,2,49. Bruk dette arrayet for å:
a) Tell opp hvor mange tall som er større enn 10 og skriv ut resultatet
b) Skriv ut annethvert element
c) Skriv ut summen av alle positive tall i arrayet
d) Skriv også ut gjennomsnittet av alle positive tall i arrayet
Bruk løkker og System.out for å skrive ut.


### Oppgave 2 (15%)
Lag en klasse kalt Liste for å behandle arrays.
Lag følgende statiske metoder i denne klassen som behandler arrays:
1) Tar et heltallsarray inn og returnerer hvor mange elementer som er større enn null
2) Tar et heltallsarray inn og finner ut hvor mange ganger et bestemt tall forekommer (tallet skal
   også inn i metoden)
3) Tar et heltallsarray inn og finner det største tallet i arrayet
   Til slutt skriv kode i main-metoden for å kalle de ulike metodene med et heltallsarray
   Resultatet skal skrives ut på System.out.


### Oppgave 3 (20%)
Det skal lages et program som regner ut BMI (Body Mass Index). Det skal brukes inputdialogbokser og meldingsboks fra Swing- biblioteket.
Først skal det leses inn vekten (i kg) og deretter høyden (i cm).
Så skal BMI'en regnes ut med følgende formel:
( 1,3 * vekt) / ( høyde/100)^ 2,5 )
^2,5 står for "opphøyd i". Bruk Math.pow(a,b) der a er grunntallet og b eksponenten.
Resultatet skal så skrives ut i en meldingsboks med passende ledetekst.
Dersom det skrives inn noe annet enn tall skal det skrives ut en feilmelding i meldingsboksen
isteden for beregningen.


### Oppgave 4 (20%)
Lag en klasse kalt KonverterTemperatur. Denne klassen skal inneholde to statiske metoder kalt
tilCelsius og tilFahrenheiht. Metodene skal regne ut fra Fahernheit til Celsius i den ene metoden
og motsatt i den andre. Metodene skal motta og returnere et desimal tall.
Formelene for konverteringene er:
C = (F - 32) / 1.8
F = C * 1.8 + 32
Skriv så kode i main-metoden for å vise hvordan man benytter seg av klassen / metodene.


### Oppgave 5 (25%)
Det skal lages et program som registrer bøker i en boksamling. Klassene, attributtene og
metodene som skal implementeres illustreres i overstående klasse-diagram. Lydbok og Papirbok
arver Bok-klassen. Det er bare metodene illustrert i klasse-diagrammet som skal
implementeres.
I main-metoden skal det så opprettes et objekt av hver type (Lydbok og Papirbok). Disse skal så
legges inn i en ArrayList av type Bok. Deretter skal attributtene skrives ut i en løkke ved hjelp av
toString()-metodene.
Klassediagram var lagt ved..