import java.util.Scanner;	
public class count{
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		System.out.println("Palak, 24csu325");
		System.out.println("Enter the number of elements: ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		int even=0;
		int odd=0;
		//Input elements
		System.out.println("Enter " + n + " elements:");
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println("Even Elements : ");
		for(int i=0;i<n;i++){
			if(arr[i]%2==0){
				System.out.println(arr[i] + " ");
				even++;
			}
		}
		System.out.println("Odd Elements : ");
		for(int i=0;i<n;i++){
			if(arr[i]%2!=0){
				System.out.println(arr[i] + " ");
				odd++;
			}
		}
		System.out.println("Total even numbers: " + even);
        System.out.println("Total odd numbers: " + odd);
	}
}