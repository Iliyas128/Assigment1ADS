import javax.swing.plaf.PanelUI;
import java.util.Scanner;
import java.util.Stack;

public class Alg {

    public static void main(String[] args) {
        System.out.println("Enter the problem number to solve:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        long startTime = System.currentTimeMillis();
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

                break;
            case 8:

                break;
            case 9:

                break;
            case 10:
                System.out.println("Enter the a:");
                int e = scanner.nextInt();
                System.out.println("Enter the b:");
                int f = scanner.nextInt();
                System.out.println("Result is:" + problem10(e, f));
                break;
            default:
                System.out.println("Invalid problem number");
                break;
        }

        double endTime = System.currentTimeMillis();
        double duration = (endTime - startTime) / 1000000;
        System.out.println("Time spent to do is " + duration + "ms");
    }

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

    public static int problem4(int n) {

        if (n == 0) {
            return 1;
        } else {
            return n * problem4(n - 1);
        }
    }

    public static int problem5(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return problem5(n - 1) + problem5(n - 2);
        }
    }

    public static int problem6(int a, int b) {
        if (b == 0) {
            return 1;
        } else {
            return a * problem6(a, b - 1);
        }
    }

    public static int problem10(int a, int b) {
        // Base case: if b is 0, return a
        if (b == 0) {
            return a;
        } else {
            // Recursive call with b as the new value of a, and a % b as the new value of b
            return problem10(b, a % b);
        }
    }


    public static String problem8(String arr[], int index) {

        char firstChar = arr[].charAt(index);
        if (!Character.isDigit(firstChar)) {
            // If it's not a digit, return "No"
            return "No";
        } else {
            // If it's a digit, recursively call problem8 with the next index
            return problem8(arr, index -1);
        }

    }

