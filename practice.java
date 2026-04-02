import java.util.*;

class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    
        System.out.print("Enter a number to search: ");
        int a = sc.nextInt();

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] == a) {
                System.out.println("Number " + a + " found at index " + i);
                break; 
            }
            else{
                System.out.println("Number not fount in the array :");
            }

        }
        sc.close();
    }
}