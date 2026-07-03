import java.util.*;

public class P114 {
    static int arr[];
    static int size;
    static int count = 0;
    static Scanner sc = new Scanner(System.in);

    static void createArray() {
        System.out.print("Enter Array Size: ");
        size = sc.nextInt();

        arr = new int[size];

        System.out.print("Enter Number of Elements: ");
        count = sc.nextInt();

        if (count > size) {
            System.out.println("Number of elements cannot exceed array size.");
            count = size;
        }

        System.out.println("Enter Elements:");

        for (int i = 0; i < count; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Array Created Successfully.");
    }

    static void displayArray() {
        if (count == 0) {
            System.out.println("Array is Empty.");
            return;
        }

        System.out.println("Array Elements:");

        for (int i = 0; i < count; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

    static void insertElement() {

        if (count == size) {
            System.out.println("Array is Full.");
            return;
        }

        System.out.print("Enter Position: ");
        int pos = sc.nextInt();

        if (pos < 0 || pos > count) {
            System.out.println("Invalid Position.");
            return;
        }

        System.out.print("Enter Value: ");
        int value = sc.nextInt();

        for (int i = count; i > pos; i--) {
            arr[i] = arr[i - 1];
        }

        arr[pos] = value;
        count++;

        System.out.println("Element Inserted Successfully.");
    }

    static void deleteElement() {

        if (count == 0) {
            System.out.println("Array is Empty.");
            return;
        }

        System.out.print("Enter Position: ");
        int pos = sc.nextInt();

        if (pos < 0 || pos >= count) {
            System.out.println("Invalid Position.");
            return;
        }

        for (int i = pos; i < count - 1; i++) {
            arr[i] = arr[i + 1];
        }

        count--;

        System.out.println("Element Deleted Successfully.");
    }

    static void searchElement() {
        if (count == 0) {
            System.out.println("Array is Empty.");
            return;
        }

        System.out.print("Enter Element to Search: ");
        int key = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < count; i++) {

            if (arr[i] == key) {
                System.out.println("Element Found at Index " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Element Not Found.");
        }
    }

    static void updateElement() {
        if (count == 0) {
            System.out.println("Array is Empty.");
            return;
        }

        System.out.print("Enter Position: ");
        int pos = sc.nextInt();

        if (pos < 0 || pos >= count) {
            System.out.println("Invalid Position.");
            return;
        }

        System.out.print("Enter New Value: ");
        arr[pos] = sc.nextInt();

        System.out.println("Element Updated Successfully.");
    }

    static void findMaximum() {
        if (count == 0) {
            System.out.println("Array is Empty.");
            return;
        }

        int max = arr[0];

        for (int i = 1; i < count; i++) {

            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Maximum Element = " + max);
    }

    static void findMinimum() {
        if (count == 0) {
            System.out.println("Array is Empty.");
            return;
        }

        int min = arr[0];

        for (int i = 1; i < count; i++) {

            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Minimum Element = " + min);
    }

    static void calculateSum() {
        if (count == 0) {
            System.out.println("Array is Empty.");
            return;
        }

        int sum = 0;

        for (int i = 0; i < count; i++) {
            sum += arr[i];
        }

        System.out.println("Sum = " + sum);
    }

    static void calculateAverage() {
        if (count == 0) {
            System.out.println("Array is Empty.");
            return;
        }

        int sum = 0;

        for (int i = 0; i < count; i++) {
            sum += arr[i];
        }

        double average = (double) sum / count;

        System.out.println("Average = " + average);
    }

    static void countEvenOdd() {
        if (count == 0) {
            System.out.println("Array is Empty.");
            return;
        }

        int even = 0;
        int odd = 0;

        for (int i = 0; i < count; i++) {

            if (arr[i] % 2 == 0)
                even++;
            else
                odd++;
        }

        System.out.println("Even Numbers = " + even);
        System.out.println("Odd Numbers = " + odd);
    }

    static void reverseArray() {

        if (count == 0) {
            System.out.println("Array is Empty.");
            return;
        }

        int start = 0;
        int end = count - 1;

        while (start < end) {

            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        System.out.println("Array Reversed Successfully.");
    }

    static void sortArray() {

        if (count == 0) {
            System.out.println("Array is Empty.");
            return;
        }

        int start = 0;
        int end = count - 1;

        while (start < end) {

            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        System.out.println("Array Reversed Successfully.");
    }

    static void secondLargest() {
        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int i = 0; i < count; i++) {
            if (arr[i] > largest) {
                second = largest;
                largest = arr[i];
            } else if (arr[i] > second && arr[i] != largest) {
                second = arr[i];
            }
        }

        System.out.println("Second Largest = " + second);
    }

    static void secondSmallest() {
        int smallest = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int i = 0; i < count; i++) {
            if (arr[i] < smallest) {
                second = smallest;
                smallest = arr[i];
            } else if (arr[i] < second && arr[i] != smallest) {
                second = arr[i];
            }
        }

        System.out.println("Second Smallest = " + second);
    }

    static void countPositiveNegative() {
        int positive = 0;
        int negative = 0;

        for (int i = 0; i < count; i++) {
            if (arr[i] >= 0)
                positive++;
            else
                negative++;
        }

        System.out.println("Positive = " + positive);
        System.out.println("Negative = " + negative);
    }

    static void removeDuplicates() {
        for (int i = 0; i < count; i++) {
            for (int j = i + 1; j < count; j++) {
                if (arr[i] == arr[j]) {
                    for (int k = j; k < count - 1; k++) {
                        arr[k] = arr[k + 1];
                    }

                    count--;
                    j--;
                }
            }
        }

        System.out.println("Duplicates Removed Successfully.");
    }

    static void copyArray() {
        int copy[] = new int[count];

        for (int i = 0; i < count; i++) {
            copy[i] = arr[i];
        }

        System.out.println("Copied Array:");

        for (int i = 0; i < count; i++) {
            System.out.print(copy[i] + " ");
        }

        System.out.println();
    }

    static void mergeArray() {
        System.out.print("Enter Size of Second Array: ");
        int n = sc.nextInt();

        int arr2[] = new int[n];

        System.out.println("Enter Elements:");

        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }

        int merge[] = new int[count + n];

        for (int i = 0; i < count; i++) {
            merge[i] = arr[i];
        }

        for (int i = 0; i < n; i++) {
            merge[count + i] = arr2[i];
        }

        System.out.println("Merged Array:");

        for (int i = 0; i < merge.length; i++) {
            System.out.print(merge[i] + " ");
        }

        System.out.println();
    }

    static void rotateLeft() {
        int first = arr[0];

        for (int i = 0; i < count - 1; i++) {
            arr[i] = arr[i + 1];
        }

        arr[count - 1] = first;

        System.out.println("Array Rotated Left.");
    }

    static void rotateRight() {
        int last = arr[count - 1];

        for (int i = count - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }

        arr[0] = last;

        System.out.println("Array Rotated Right.");
    }

    static void binarySearch() {
        System.out.println("Note: Please sort the array before using Binary Search.");
        System.out.print("Enter Element: ");
        int key = sc.nextInt();

        int low = 0;
        int high = count - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == key) {
                System.out.println("Element Found at Index " + mid);
                return;
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        System.out.println("Element Not Found.");
    }

    public static void main(String[] args) {

        while (true) {

            System.out.println("\n========== ARRAY OPERATIONS SYSTEM ==========");
            System.out.println("1. Create Array");
            System.out.println("2. Display Array");
            System.out.println("3. Insert Element");
            System.out.println("4. Delete Element");
            System.out.println("5. Search Element");
            System.out.println("6. Update Element");
            System.out.println("7. Find Maximum");
            System.out.println("8. Find Minimum");
            System.out.println("9. Calculate Sum");
            System.out.println("10. Calculate Average");
            System.out.println("11. Count Even and Odd Numbers");
            System.out.println("12. Reverse Array");
            System.out.println("13. Sort Array");
            System.out.println("14. Exit");

            System.out.print("Enter Your Choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    createArray();
                    break;

                case 2:
                    displayArray();
                    break;

                case 3:
                    insertElement();
                    break;

                case 4:
                    deleteElement();
                    break;

                case 5:
                    searchElement();
                    break;

                case 6:
                    updateElement();
                    break;

                case 7:
                    findMaximum();
                    break;

                case 8:
                    findMinimum();
                    break;

                case 9:
                    calculateSum();
                    break;

                case 10:
                    calculateAverage();
                    break;

                case 11:
                    countEvenOdd();
                    break;

                case 12:
                    reverseArray();
                    break;

                case 13:
                    sortArray();
                    break;

                case 14:
                    secondLargest();
                    break;

                case 15:
                    secondSmallest();
                    break;

                case 16:
                    countPositiveNegative();
                    break;

                case 17:
                    removeDuplicates();
                    break;

                case 18:
                    copyArray();
                    break;

                case 19:
                    mergeArray();
                    break;

                case 20:
                    rotateLeft();
                    break;

                case 21:
                    rotateRight();
                    break;

                case 22:
                    binarySearch();
                    break;

                case 23:
                    System.out.println("Thank You!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}
