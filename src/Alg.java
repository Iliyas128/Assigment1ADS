import javax.swing.plaf.PanelUI;
import java.util.Scanner;

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

                break;
            case 5:

                break;
            case 6:

                break;
            default:
                System.out.println("Invalid problem number");
                break;
        }

        double endTime = System.currentTimeMillis();
        double duration = (endTime-startTime)/1000000;
        System.out.println("Time spent to do is "+ duration + "ms");
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

    public static String problem3(){
        System.out.println("Enter the number to find: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String result;
        if(n == 2 || n ==3 || n ==5 || n ==7 ){
            System.out.println(result="prime");
        }
        else if (n%2!=0 && n%3!=0 && n%5!=0 && n % 7!=0){
            result = "prime";
        }
        else{
            result = "Composite";
        }
    return result;
    }

    public static int problem4(){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a=0;
        int b=1;
        int[]arr = new int[n];
        for(int i = 0;i<n;i++){
        arr[i] =
        }
    }
    private static int fibonacci(n  )
}

