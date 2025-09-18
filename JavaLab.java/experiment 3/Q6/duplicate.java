import java.util.Scanner;
class duplicate{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Palak, 24csu325");
        System.out.println("Provide size of elements:");
        int n = sc.nextInt();
        boolean[] counted = new boolean[n];
        int[] arr = new int[n];
        System.out.println("Enter elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("No. of times elements repeated :");
        for (int i = 0; i < n; i++) {
            if (counted[i])
                continue;
            int count = 0; 
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {     
                    count++;
                    counted[j] = true;
                }
            }
            System.out.println(arr[i] + " occurs " + count + " times");
        }  
        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) { 
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}