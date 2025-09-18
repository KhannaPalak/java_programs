import java.util.Scanner;

public class MinutesToTime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter minutes: ");
        long minutes = sc.nextLong();

        long days = minutes / (60 * 24);
        long years = days / 365;
        long months = (days % 365) / 30;
        long remainingDays = (days % 365) % 30;

        System.out.println(years + " Years " + months + " Months " + remainingDays + " Days");
    }
}
