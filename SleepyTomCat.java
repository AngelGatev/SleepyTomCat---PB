package JavaBasics.ConditionalStatements.MoreExercise;

import java.util.Scanner;

public class SleepyTomCat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int daysOff = Integer.parseInt(scanner.nextLine());
        int minutesSpentForPlaying = daysOff * 127 + (365 - daysOff) * 63;
        int diff = Math.abs(minutesSpentForPlaying-30000);
        int hours = diff / 60;
        int minutes = diff % 60;
        if (minutesSpentForPlaying > 30000) {
            System.out.println("Tom will run away");
            System.out.printf("%d hours and %d minutes more for play", hours ,minutes);
        } else {
            System.out.println("Tom sleeps well");
            System.out.printf("%d hours and %d minutes less for play", hours ,minutes);
        }
    }
}
