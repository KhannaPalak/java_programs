import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().toLowerCase().charAt(0);

        if ("aeiou".indexOf(ch) != -1)
            System.out.println(ch + " is a Vowel.");
        else if (Character.isLetter(ch))
            System.out.println(ch + " is a Consonant.");
        else
            System.out.println("Not a valid alphabet.");
    }
}
