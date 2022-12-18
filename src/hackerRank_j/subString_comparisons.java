package hackerRank_j;

import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.Scanner;

public class subString_comparisons {

    public static void getSmallestAndLargest(String s, int k) {
        java.util.ArrayList<String> vector = new ArrayList<>();
        String smallest = "";
        String largest = "";

        for (int i = 0; i < s.length()-k+1; i++){
            vector.add(s.substring(i,k+i));
        }

        String asmallest = vector.get(0);
        String a = asmallest;
        String alargest = vector.get(vector.size()-1);
        String b = alargest;

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'

        for(int j = 0; j < vector.size(); j++){
            System.out.println(vector.get(j));
        }
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
        getSmallestAndLargest(s, 3);

    }
}
