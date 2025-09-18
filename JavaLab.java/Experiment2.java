// import java.util.Scanner;

// public class QuadraticRoots {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter coefficients a, b, c: ");
//         double a = sc.nextDouble(), b = sc.nextDouble(), c = sc.nextDouble();

//         double d = b * b - 4 * a * c; // discriminant

//         if (d > 0) {
//             double r1 = (-b + Math.sqrt(d)) / (2 * a);
//             double r2 = (-b - Math.sqrt(d)) / (2 * a);
//             System.out.println("Real and Distinct Roots: " + r1 + " and " + r2);
//         } else if (d == 0) {
//             double r = -b / (2 * a);
//             System.out.println("Real and Equal Roots: " + r);
//         } else {
//             double real = -b / (2 * a);
//             double imag = Math.sqrt(-d) / (2 * a);
//             System.out.println("Complex Roots: " + real + " ± " + imag + "i");
//         }
//     }
// }




// import java.util.Scanner;

// public class VowelConsonant {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a character: ");
//         char ch = sc.next().toLowerCase().charAt(0);

//         if ("aeiou".indexOf(ch) != -1)
//             System.out.println(ch + " is a Vowel.");
//         else if (Character.isLetter(ch))
//             System.out.println(ch + " is a Consonant.");
//         else
//             System.out.println("Not a valid alphabet.");
//     }
// }


// public class PyramidPattern {
//     public static void main(String[] args) {
//         int n = 5;
//         for (int i = 1; i <= n; i++) {
//             for (int j = i; j < n; j++)
//                 System.out.print(" ");
//             for (int k = 1; k <= (2 * i - 1); k++)
//                 System.out.print("*");
//             System.out.println();
//         }
//     }
// }


// public class LeftTriangle {
//     public static void main(String[] args) {
//         int n = 5;
//         for (int i = 1; i <= n; i++) {
//             for (int j = i; j < n; j++)
//                 System.out.print(" ");
//             for (int k = 1; k <= i; k++)
//                 System.out.print("*");
//             System.out.println();
//         }
//     }
// }


// public class RightTriangle {
//     public static void main(String[] args) {
//         int n = 5;
//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= i; j++)
//                 System.out.print("*");
//             System.out.println();
//         }
//     }
// }



// public class DiamondPattern {
//     public static void main(String[] args) {
//         int n = 5;
//         for (int i = 1; i <= n; i++) {
//             for (int j = i; j < n; j++)
//                 System.out.print(" ");
//             for (int k = 1; k <= (2 * i - 1); k++)
//                 System.out.print("*");
//             System.out.println();
//         }
//         for (int i = n - 1; i >= 1; i--) {
//             for (int j = n; j > i; j--)
//                 System.out.print(" ");
//             for (int k = 1; k <= (2 * i - 1); k++)
//                 System.out.print("*");
//             System.out.println();
//         }
//     }
// }



// import java.util.Scanner;

// public class PrimeCheck {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int n = sc.nextInt();
//         boolean isPrime = true;

//         if (n <= 1) isPrime = false;
//         else {
//             for (int i = 2; i <= Math.sqrt(n); i++) {
//                 if (n % i == 0) {
//                     isPrime = false;
//                     break;
//                 }
//             }
//         }
//         System.out.println(n + (isPrime ? " is Prime." : " is Not Prime."));
//     }
// }



// import java.util.Scanner;

// public class Fibonacci {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter number of terms: ");
//         int n = sc.nextInt();

//         int a = 0, b = 1;
//         System.out.print("Fibonacci Series: " + a + " " + b);
//         for (int i = 3; i <= n; i++) {
//             int c = a + b;
//             System.out.print(" " + c);
//             a = b;
//             b = c;
//         }
//     }
// }
