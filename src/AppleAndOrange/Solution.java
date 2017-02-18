package AppleAndOrange;

import java.util.Scanner;

/**
 * Created by admin on 2/18/2017.
 */
public class Solution {

    static int solveMeFirst(int[] fruits, int[] house, int tree) {
        int res = 0;

        for (int i=0; i <fruits.length; i++ ){
            if ((fruits[i] + tree) >= house[0] && (fruits[i] + tree) <= house[1]){
                res++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] house = new int[2];
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        house[0]=s;
        int t = in.nextInt();
        house[1]=t;
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int[] apple = new int[m];
        for(int apple_i=0; apple_i < m; apple_i++){
            apple[apple_i] = in.nextInt();
        }
        int[] orange = new int[n];
        for(int orange_i=0; orange_i < n; orange_i++){
            orange[orange_i] = in.nextInt();
        }
        System.out.println(solveMeFirst(apple,house,a) +"\n" + solveMeFirst(orange,house,b));
    }
}
