import java.util.Scanner;

public class LeapYear {
    // kolla om ett år är skottår eller inte
    public static void main(String[] args) {
        // scanner för att ta emot input
        Scanner scanner = new Scanner(System.in);
        // bvariabeln för att spara input
        int year;

        // vi ber användaren mata in ett årtal
        // sparar det i variabeln year
        System.out.println("Mata in ett årtal: ");
        year = scanner.nextInt();

        // variabel för att kolla om det är skottår
        // sätter värdet till false
        boolean isLeapYear = false;

        // % (modulus): Detta är en operator som ger resten när ett tal delas med ett annat.
        // exempel: 10 % 3 ger resten 1 (eftersom 10 delat med 3 är 3 med en rest på 1).
        // exempel: 12 % 4 ger resten 0 (eftersom 12 är jämnt delbart med 4).

        // delbart med 4: Ett år är ett skottår om det är delbart med 4.
        // därför är den första kontrollen if (år % 4 == 0).
        if (year % 4 == 0) {
            if (year % 100 != 0 || year % 400 == 0) {
                // undantag för år som är delbara med 100:
                // om året är jämnt delbart med 100, är det inte ett skottår,
                // utom om det också är jämnt delbart med 400.
                // därför gör vi en ytterligare kontroll inuti den första if-satsen
                // för att hantera denna regel.
                isLeapYear = true;
            }
        }

        // skriver ut resultatet
        if(isLeapYear) {
            System.out.println(year + " är ett skottår!");
        } else {
            System.out.println(year + " är inte ett skottår!");
        }
    }
}











