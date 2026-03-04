import java.util.Scanner;

public class inputFromUser {
    public static void main(String args[]){
        /*
        Single line inputs

         */
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius: ");
        try{
            double r = sc.nextDouble();
            System.out.print("The area is: ");
            double a = 3.141592 * r * r;
            System.out.println(a);
        }
        catch(Exception e){
            System.out.println("Please enter a numeric value");
        }
        /*
        Multiple line inputs 
        */

        for (int i = 0 ; i < 5 ; i++ ){
            int num = sc.nextInt();
            System.out.print(num);
        }

        /*
        Arryay input
        */
        System.out.print("Enter the size of the array");
        int n= sc.nextInt();

        int [] arr = new int[n];
        for (int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("The  array you entered is: ");
        for (int x: arr){
            System.out.print(x+ " ");
        }

        /* 
        Array of strings
         */

        String [] strings = new String[n];
        for (int i = 0; i < n; i++){
            strings[i] = sc.nextLine();
        }
        System.out.print("The  array you entered is: ");
        for (String x: strings){
            System.out.print(x+ " ");
        }
        sc.close();
    }
    
}
