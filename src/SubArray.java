import java.util.ArrayList;
import java.util.Scanner;

class Solution {
    public ArrayList realArray(int[] ar, int b, int c) {
        ArrayList<Integer> lst =new ArrayList<>();
        int i=b;
        while(i<=c){
            lst.add(ar[i]);
            i++;
        }
        return lst;
    }
}

public class SubArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        int i=0;
        while(i<size){
            arr[i] = sc.nextInt();
            i++;
        }
        System.out.print("enter the starting index of the array: ");
        int b= sc.nextInt();
        System.out.print("enter the ending index of the array: ");
        int c= sc.nextInt();
        Solution answer = new Solution();
        System.out.println(answer.realArray(arr,b,c));
    }
}
