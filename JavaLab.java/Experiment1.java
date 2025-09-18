// import java.util.Scanner;

// public class BasicOperations {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter two numbers: ");
//         int a = sc.nextInt(), b = sc.nextInt();

//         System.out.println("Addition: " + (a + b));
//         System.out.println("Subtraction: " + (a - b));
//         System.out.println("Multiplication: " + (a * b));
//         System.out.println("Division: " + (a / b));
//         System.out.println("Modulus: " + (a % b));
//     }
// }





// import java.util.Scanner;

// public class MinutesToTime {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter minutes: ");
//         long minutes = sc.nextLong();

//         long days = minutes / (60 * 24);
//         long years = days / 365;
//         long months = (days % 365) / 30;
//         long remainingDays = (days % 365) % 30;

//         System.out.println(years + " Years " + months + " Months " + remainingDays + " Days");
//     }
// }



// import java.util.Scanner;

// public class FahrenheitToCelsius {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter temperature in Fahrenheit: ");
//         double f = sc.nextDouble();

//         double c = (f - 32) * 5 / 9;
//         System.out.println("Celsius: " + c);
//     }
// }



// import java.util.Scanner;

// public class SumOfDigits {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a 3-digit number: ");
//         int num = sc.nextInt();

//         int sum = 0, temp = num;
//         while (temp > 0) {
//             sum += temp % 10;
//             temp /= 10;
//         }
//         System.out.println("Sum of digits: " + sum);
//     }
// }





// import java.util.Scanner;

// public class ReverseNumber {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a 3-digit number: ");
//         int num = sc.nextInt();

//         int rev = 0, temp = num;
//         while (temp > 0) {
//             rev = rev * 10 + temp % 10;
//             temp /= 10;
//         }
//         System.out.println("Reversed number: " + rev);
//     }
// }
