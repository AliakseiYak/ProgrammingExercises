package CompareTriplets;

import java.io.*;
        import java.util.*;
        import java.text.*;
        import java.math.*;
        import java.util.regex.*;

public class CompareTriplets {

    static int[] solveMeFirst(int[] a, int[] b) {
        int res[] = new int[2];
        res[0] = 0;
        res[0] = 0;
        for (int i = 0; i < 3; i++){
            if (a[i]>b[i]){
                res[0] += 1;
            } else if (a[i]<b[i]){
                res[1] += 1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int a[] = new int[3];
        int b[] = new int[3];
        int res[];
        Scanner in = new Scanner(System.in);
        a[0] = in.nextInt();
        a[1] = in.nextInt();
        a[2] = in.nextInt();
        b[0] = in.nextInt();
        b[1] = in.nextInt();
        b[2] = in.nextInt();

        res = solveMeFirst(a,b);

        System.out.println(res[0] +" " + res[1]);
    }
}
