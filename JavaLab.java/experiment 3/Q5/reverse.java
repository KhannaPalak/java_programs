import java.util.Scanner;
public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Palak, 24csu325");
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int numbers[] = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
        int reversed[] = new int[n];
        for (int i = 0; i < n; i++) {
            reversed[i] = numbers[n - 1 - i];
        }
        System.out.println("Reversed Array:");
        for (int i = 0; i < n; i++) {
            System.out.print(reversed[i] + " ");
        }
    }
}