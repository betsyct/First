/** Oppgavetekst: Quiz med tre sporsmaal, hvor du maa ha rett svar paa alle oppgavene for aa vinne. */

import java.util.Scanner;

class MinOppgave1
{
  public static void main(String[] args)
  {
    // Skriver ut velkomstmelding
    System.out.println("Velkommen til quiz! Du maa svare rett på alle tre oppgavene for aa vinne.");

    // Skriver ut forste sporsmaal, og henter input, svar, fra brukeren
    Scanner in = new Scanner(System.in);
    System.out.println("Hvilket aar ble Facebook startet?");
    String linje1 = in.nextLine();
    int aar = Integer.parseInt(linje1);

    // Hvis svaret er riktig: Skriver ut "Riktig", samt nytt sporsmaal
    if (aar == 2004)
    {
      System.out.println("Riktig!");

      System.out.println("Hvor mange aar gammel er Norges eldste person?");
      String linje2 = in.nextLine();
      int gammel = Integer.parseInt(linje2);

      // Hvis svaret er riktig: Skriver ut "Riktig", samt nytt sporsmaal
      if (gammel == 108)
      {
        System.out.println("Riktig!");

        System.out.println("Hvor mange meter hoyt er Mount Everest?");
        String linje3 = in.nextLine();
        int meter = Integer.parseInt(linje3);

        // Hvis svaret er riktig: Skriver ut gratulasjon
        if (meter == 8848)
        {
          System.out.println("Gratulerer! Du vant quizen, og er kjempesmart!");
        }
        // Hvis svaret er feil: Skriver ut "Feil", og avslutter
        else
        {
          System.out.println("Feil! Du tapte...");
        }
      }
      // Hvis svaret er feil: Skriver ut "Feil", og avslutter
      else
      {
        System.out.println("Feil! Du tapte...");
      }
    }
    // Hvis svaret er feil: Skriver ut "Feil", og avslutter
    else
    {
      System.out.println("Feil! Du tapte...");
    }
  }
}
