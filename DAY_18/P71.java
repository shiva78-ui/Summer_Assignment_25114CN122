import java.util.*;

public class P71 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter elements in sorted order:");

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter element to search: ");
        int target = sc.nextInt();

        int start = 0;
        int end = n - 1;
        int found = -1; // means null bcz this is not the valid index

        while(start <= end) {

            int mid = (start + end) / 2;

            if(arr[mid] == target) {
                found = mid;
                break;
            }
            else if(arr[mid] < target) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }

        if(found != -1) {
            System.out.println("Element found at index: " + found);
        }
        else {
            System.out.println("Element not found");
        }

        sc.close();
    }
}