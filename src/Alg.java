import java.util.Scanner;
public class Alg {

    public static void main(String[] args){
        System.out.println("Enter the problem number to solve:");
    }

    public static int problem2(int n,int[] arr, int index){
        if (index < n) {
            return arr[index] + problem2(n, arr,index+1);
        } else {
            return 0;
        }
    }


}
