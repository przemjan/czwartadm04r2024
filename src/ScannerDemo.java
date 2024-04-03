import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {

        int numerButa;

        Scanner klawisz = new Scanner(System.in);

        System.out.println("Podaj numer buta: ");
        numerButa = klawisz.nextInt();
        klawisz.nextLine();

        System.out.println("Podaj średnią z majcy: ");
        double srednia = klawisz.nextDouble();
        klawisz.nextLine();

        System.out.println("Podaj swoje imię: ");
        String imie = klawisz.nextLine();


        System.out.println("Twój numer buta: " + numerButa +
                ", twoja średnia: " + srednia + ", imię: " + imie);


    }
}
