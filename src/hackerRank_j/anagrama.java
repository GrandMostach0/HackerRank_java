package hackerRank_j;

import java.util.Arrays;
import java.util.Scanner;

public class anagrama {

    static boolean isAnagram(String at, String bt){
        String s1 = at.toLowerCase();
        String s2 = bt.toLowerCase();

        if(s1.length() == s2.length()){
            int [] a = new int[256];
            int [] b = new int[256];

            for (int i = 0; i < 256; i++){
                if(a[i]!=b[i])
                    return false;
            }

            return true;

        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagram");
    }
}
