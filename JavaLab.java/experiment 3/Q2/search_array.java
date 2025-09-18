import java.util.Scanner;
class search_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Palak, 24csu325");
        System.out.println("Enter size of array:");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Array elements: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Enter the element you want to find:");
        int key = sc.nextInt();

        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                System.out.println("Element is found.");
                return; 
            }
        }
        System.out.println("Element not found.");
       
    }
}