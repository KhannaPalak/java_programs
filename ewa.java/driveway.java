import java.util.*;
public class DriveWay {
    public static void main(String[] args) {
        Stack<String> driveway = new Stack<>();
        Queue<String> street = new LinkedList<>();
        driveway.push("DL 1789");
        driveway.push("MH 0007");
        driveway.push("UK 1574");
        System.out.println("Initial driveway: "+ driveway);
        System.out.println("Enter the car no: ");
        Scanner scanner = new Scanner(System.in);
        String carNo = scanner.nextLine();

        for(int i=0;i<driveway.size();i++){
            if(driveway.get(i).equals(carNo)) {
                System.out.println("Car found in driveway: " + carNo);
                System.out.println("Removing car from driveway...");
                driveway.remove(i);
                
                street.offer(carNo);
                System.out.println("Car moved to street: " + street);
                System.out.println("Car removed. Current driveway: " + driveway);
                
                break;
            } 
        }

    }
    }