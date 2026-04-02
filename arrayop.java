import java.util.*;
class arrayop 
{
    public static void display(int arr[])
    {
        System.out.println("ARRAY ELEMENTS :");
        for(int x : arr)
        {
            System.out.println(x);
        }
    }

    public static void searchel(int arr[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to search from array :");
        int num = sc.nextInt();
        for (int i=0; i<arr.length ; i++)
        { 
            if(num==arr[i])
            {
                System.out.println("the number you search is present in the array number is "+arr[i]+" at index" +i);
                break;
            }
            else{
                System.out.println("Element not found !");
                break;
            }
        }
        
    }
    public static void maxmin(int arr[])
    {
        int max = arr[0];

        for(int i=0 ; i< arr.length ; i++)
        {
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("Maximum number is :"+max);
        int min = arr[0];
        for(int i=0 ; i <arr.length ;i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];
            }
        }
        System.out.println("Minimun number is :"+min);
    }

    public static void sumavg(int arr[])
    {
        int sum=0;
        System.out.println("SUM of array elements : ");
        for (int i=0 ; i <arr.length ; i++)
        {
                sum= sum + arr[i];
        }
        System.out.println("Total is : "+sum);
        System.out.println("average of the array elements :");
        int avg = sum/arr.length;
        System.out.println("Average is : "+avg);

    }
    public static void main(String args[])
    {
        int choice;
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the size of array :");
        int n = sc.nextInt();

        System.out.println("Enter the array elements :");
        int[] arr = new int[n];

        for(int i=0 ; i <n ; i++)
            {
                arr[i]= sc.nextInt();
            }
        do{
        System.out.println("*******Random things on array********");
        System.out.println("1. Display all Array elements !");
        System.out.println("2. Calculate MAn mIn from Array elements !");
        System.out.println("3. Calculate SUM and AVG of Array elements !");
        System.out.println("4. Search the element from array !");
        System.out.println("5. exit the code");
        System.out.println("Enter your what u want to perform action on array : (1,2,3)");
        choice = sc.nextInt();
        
        switch(choice)
        {
            case 1 : 
                System.out.println("Displaying the total elements from array :");
                display(arr);
                break;
            
            case 2 : 
                System.out.println("Calculating the MAX MIN :");
                maxmin(arr);
                break;


            case 3 : 
                System.out.println("Calculating the SUM and then average of array elements :");
                sumavg(arr);
                break;

            case 4 : 
                searchel(arr);
                break;
            
            case 5 : 
                System.out.println("Exixting the random things on array !!");
                break;

            default :
                System.out.println("Please enter a valid input (1 , 2 , 3)");
                break;
        }
    }while(choice != 5);
    }
}
