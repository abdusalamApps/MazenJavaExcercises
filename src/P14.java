import java.util.Scanner;

public class P14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ange avgångstid: ");
        int departureHour = scanner.nextInt();
        int departureMinute = scanner.nextInt();
        System.out.println();
        System.out.print("Ange körtid: ");
        int durationHour = scanner.nextInt();
        int durationMinute = scanner.nextInt();
        int departureMinutesTotal = departureHour * 60 + departureMinute;
        int durationMinutesTotal = durationHour * 60 + durationMinute;

        int arrivalHour = (departureMinutesTotal + durationMinutesTotal) / 60;
        int arrivalMinutes = (departureMinutesTotal + durationMinutesTotal) % 60;
        if (arrivalHour > 24) {
            arrivalHour -= 24;
            System.out.print("Ankomstid: " + arrivalHour + ":" + arrivalMinutes);
            System.out.println(" Nästa dag");
        } else {
            System.out.print("Ankomstid: " + arrivalHour + ":" + arrivalMinutes);
        }



    }
}
