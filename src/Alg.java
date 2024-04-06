import java.util.Scanner;
public class Alg {

    public static void main(String[] args){
        System.out.println("Enter the problem number to solve:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        switch (n){
            case 1:
                System.out.println("Enter the tolat number of elements");
                int numofElem = scanner.nextInt();
                int arra[] = new int[numofElem];
                System.out.println("Enter the numbers:");
                for(int i = 0;i<numofElem;i++){
                    arra[i] = scanner.nextInt();
                }
                problem1(numofElem,arra,0);
                break;
            case 2:
                System.out.println("enter the total number of elements:");
                int numOfElements = scanner.nextInt();
                int[] arr = new int[numOfElements];

                System.out.println("Enter the elements of array:");
                for (int i = 0;i<numOfElements;i++){
                    arr[i]= scanner.nextInt();
                }
                double result = problem2(numOfElements,arr,0);
                System.out.println(result/numOfElements);
                break;
            case 3:

                break;
            case 4:

                break;
            case 5:

                break;
            case 6:

                break;


        }
    }

    public static int problem2(int a,int[] arr, int index){
        if (index < a) {
            return arr[index] + problem2(a, arr,index+1);
        } else {
            return 0;
        }
    }
    public static int problem1(int n,int[]arr,int res){

        for (int i = 0;i<n;i++){
            res = arr[0];
            if(res<= arr[i]){
            res = arr[i];
        }

        }
    return res;
    }

}
