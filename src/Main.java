import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // initiera en scanner för att ta emot input
        Scanner scanner = new Scanner(System.in);
        //Scanner i Java är en klass som används för att läsa in data
        // från olika källor, som tangentbordet, filer

        // för att använda den för att läsa in användarinmatning,
        // skapar man ett Scanner-objekt kopplat till System.in.
        // scanner kan läsa olika datatyper som int, double, och String
        // med metoder som nextInt(), nextDouble(), och nextLine().

        // variabel där vi kan spara ner åldern
        // är av datatypen int
        int age;
        System.out.println("hej");

        // variabel för att kolla om personen är student eller inte
        // är av datatypen boolen => kan bara vara true eller false
        boolean isStudent;

        // vi frågar användaren om åldern och sparar i variabeln age
        System.out.println("Ange din ålder: ");
        age = scanner.nextInt();
        //System.out.println(age);

        // vi frågar användaren om den är student och ber den svara true eller false
        // vi sparar svaret i isStudent
        System.out.println("Är du student? (true/false)");
        isStudent = scanner.nextBoolean();

        // variabel för att kolla om personen får rabatt eller ej
        // sätter initiala värdet till false
        boolean getDiscount = false;

        // vi kollar värden som är inmatade
        // om age är mindre än 18 ELLER
        // om age större än eller lika med 65 ELLER
        // om isStudent är true
        if(age < 18 || age >= 65 || isStudent) {
            // stämmer något av ovan villkor så sätter vi
            // getDiscount till true
            getDiscount = true;
        }

        // om getDiscount är true skriver vi ut att man får rabatt
        if(getDiscount) {
            System.out.println("Du är berättigad till rabatt!");
        } else {
            // annars skriver vi ut att man ej får rabatt
            System.out.println("Du är inte berättigad till rabatt!");
        }
    }
}












