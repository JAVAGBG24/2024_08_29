import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        // Random-klassen i Java används för att generera slumpmässiga tal.
        // genom att skapa ett Random-objekt kan du använda metoder som
        // nextInt(), nextDouble(), och nextBoolean() för att få olika
        // typer av slumpvärden.
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        // slumpmässigt tal mellan 1 och 100
        // nextInt(100) ger ett tal mellan 0 och 99
        int correctNumber = random.nextInt(100) + 1;

        // lagra numret som man gissar på
        int guess = 0;
        // lagra hur många försök man gjort
        int tries = 0;

        System.out.println("Jag har slumpat fram ett tal mellan 1 - 100, kan du gissa vilket?");

        // loop som kommer att köras så länge
        // guess inte är lika med correctNumber
        // är guess exakt lika med correctNumber så bryts loopen
        while(guess != correctNumber) {
            System.out.println("Ange din gissning: ");
            // tar emot och sparat talet som gissades på
            guess = scanner.nextInt();
            // ökar tries med 1
            tries++;

            // kontrollera om gissningen är för hög, för låg eller korrekt
            if(guess < correctNumber) {
                System.out.println("För lågt, försök igen!");
            } else if (guess > correctNumber) {
                System.out.println("För högt, försök igen!");
            } else {
                System.out.println("Rätt! Du gissade rätt nummer på " + tries + " försök.");
            }
        }
    }
}


















