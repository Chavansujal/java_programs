import java.util.*;
class practice3 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array :");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the array elements :");
        for(int i =0 ; i< n ; i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println("this array elements are printed by the while loop :");
        int i=0;
        while(n > i)
        {
            System.out.println(arr[i]);
            i++;
        }

        sc.close();

    }
}
