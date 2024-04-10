import javax.swing.plaf.PanelUI;
import java.util.Scanner;
import java.util.Stack;

public class Alg {

    public static void main(String[] args) {
        System.out.println("Enter the problem number to solve:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        long startTime = System.currentTimeMillis();
        // Main loop to display task menu
        switch (n) {
            case 1:
                System.out.println("Result: " + problem1());
                break;
            case 2:
                System.out.println("Result: " + problem2());
                break;
            case 3:
                System.out.println("Result:" + problem3());
                break;
            case 4:
                System.out.println("Enter the factorial number");
                int a = scanner.nextInt();
                System.out.println("Result is:" + problem4(a));
                break;
            case 5:
                System.out.println("Enter the n-th element:");
                int b = scanner.nextInt();
                System.out.println("Result is:" + problem5(b));
                break;
            case 6:
                System.out.println("Enter the number:");
                int c = scanner.nextInt();
                System.out.println("Enter the degree of number:");
                int d = scanner.nextInt();
                System.out.println("Result is:" + problem6(c, d));
                break;
            case 7:
                System.out.println("Enter the number of elements");
                int f = scanner.nextInt();
                System.out.println("Enter the elements:");
                int arr[] = new int[n];
                for (int i =0;i<f;i++){
                    arr[i] =scanner.nextInt();
                }
                System.out.println("Reversed arrays elements:");
                problem7(arr,0,f-1);
                for (int i = 0;i<f;i++){
                    System.out.println(arr[i] + " ");
                }
                break;
            case 8:
                System.out.println("Enter the string:");
                String str;
                scanner.nextLine();
                str = scanner.nextLine();
                System.out.println("String is  " + problem8(str));
                break;
            case 9:
                System.out.println("Enter the c:");
                int k = scanner.nextInt();
                System.out.println("enter the k:");
                int m = scanner.nextInt();
                System.out.println("Result is " + problem9(k,m));
                break;
            case 10:
                System.out.println("Enter the a:");
                int e = scanner.nextInt();
                System.out.println("Enter the b:");
                int g = scanner.nextInt();
                System.out.println("Result is:" + problem10(e, g));
                break;
            default:
                System.out.println("Invalid problem number");
                break;
        }

        double endTime = System.currentTimeMillis();
        double duration = (endTime - startTime) / 1000000;
        System.out.println("Time spent to do is " + duration + "ms");
    }

    /**
     * Calculates the average of elements in an array.
     * @return The average of elements in the array.
     */
    public static double problem2() {
        double result = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the total number of elements:");
        int numOfElements = scanner.nextInt();
        int[] arr = new int[numOfElements];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < numOfElements; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int i = 0; i < numOfElements; i++) {
            result += arr[i];
        }
        scanner.close();
        return result / numOfElements;
    }

    /**
     * This block of code about searching minimum digit in the array.
     * @param arr This is array.
     * @return The minimum element in the array.
     **/
    public static int problem1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the total number of elements:");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        scanner.close();

        int res = arr[0];
        for (int i = 1; i < n; i++) {
            if (res >= arr[i]) {
                res = arr[i];
            }
        }
        return res;
    }

    /**
     * This code checks if a number is a prime.
     * @param n Number.
     */
    public static String problem3() {
        System.out.println("Enter the number to find: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String result;
        if (n == 2 || n == 3 || n == 5 || n == 7) {
            System.out.println(result = "prime");
        } else if (n % 2 != 0 && n % 3 != 0 && n % 5 != 0 && n % 7 != 0) {
            result = "prime";
        } else {
            result = "Composite";
        }
        return result;
    }

    /**
     * Calculates the factorial of a given number.
     * Although this method calculates the factorial of non-negative number.
     * @param n The number for calculation factorial.
     * @return The factorial of a given number.
     */
    public static int problem4(int n) {

        if (n == 0) {
            return 1;
        } else {
            return n * problem4(n - 1);
        }
    }

    /**
     * This code calculates nth Fibonacci number.
     * It uses recursive approach.
     * @param n The index of the Fibonacci number.
     * @return The nth Fibonacci number.
     */
    public static int problem5(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return problem5(n - 1) + problem5(n - 2);
        }
    }

    /**
     * Calculates the power of a number recursively.
     * a^n, a to the power n.
     * @param a basic number.
     * @param b power.
     * @return The result of a to the power b.
     */
    public static int problem6(int a, int b) {
        if (b == 0) {
            return 1;
        } else {
            return a * problem6(a, b - 1);
        }
    }

    /**
     * This code reverse the given array, swaps start and end.
     * @param arr The array.
     * @param a The starting index.
     * @param b The ending index.
     */public static int problem7(int arr[],int a, int b){
        if(a>=b){
            return 0;
        }
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
        return problem7(arr,a+1 , b-1);
    }

    /**
     * This code will check String for only digits recursively.
     * @param str The string which to check.
     * @return Yes if the string consists only digits, otherwise NO.
     */public static boolean problem8(String str){
        for (int i =0;i<str.length();i++){
            if(!Character.isDigit(str.charAt(i))){
                return false;
            }
        }
        return true;
    }

    /**
     * Calculating binomial coefficient.
     * Using recursive approach.
     * Formula k! / (m! * (k - m)!).
     * @param k Total number.
     * @param m The number of items to choose.
     * @return Binomial coefficient, C(n, k).
     */public static int problem9(int k, int m){
        if (m == 0 || m == k) {
            return 1;
        } else {
            // Recursive call to calculate binomial coefficient
            return problem9(k - 1,  m- 1) + problem9(k-1,m);
        }
    }
    /**
     * This code calculating greatest common denominator (GCD) of two numbers recursively.
     * @param a The 1st integer.
     * @param b The 2nd integer.
     * @return The GCD of a and b.
     */
    public static int problem10(int a, int b) {
        // if b is 0, return a
        if (b == 0) {
            return a;
        } else {
             // Recursive call with b as the new value of a, and a % b as the new value of b
            return problem10(b, a % b);
        }
    }
}

