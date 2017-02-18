package DesignerPDFViewer;

import java.util.Scanner;

/**
 * Created by admin on 2/16/2017.
 */
public class DesignerPDFViewer {

    static int getLetterNumber(char ch) {
    String alphabet="abcdefghijklmnopqrstuvwxyz";
        return alphabet.indexOf(ch);
    }

    static int solveMe(int[] array, String word){
        int res;
        int maxHight = 0;
        for (int i=0; i < word.length(); i++){
            if (maxHight < array[getLetterNumber(word.charAt(i))]){
                maxHight = array[getLetterNumber(word.charAt(i))];
            }
        }
        res = maxHight*word.length();
        return res;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int[] h = new int[26];
        for(int h_i=0; h_i < 26; h_i++){
            h[h_i] = in.nextInt();
        }
        String word = in.next();

        System.out.print(solveMe(h,word));
    }
}
