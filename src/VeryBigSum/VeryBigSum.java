package VeryBigSum;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * Created by admin on 2/15/2017.
 */
public class VeryBigSum {

    static long solveMeFirst(int[] a) {
        long res=0;

        for (int i = 0; i < a.length; i++){
            res+=a[i];
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        System.out.println(solveMeFirst(arr));
    }
}
