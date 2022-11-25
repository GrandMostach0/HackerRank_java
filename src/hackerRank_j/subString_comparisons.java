package hackerRank_j;

import java.util.ArrayList;
import java.util.Scanner;

public class subString_comparisons {

    public static String getSmallestAndLargest(String s, int k) {
        ArrayList<String> vector = new ArrayList<>();
        String smallest = "";
        String largest = "";

        for (int i = 0; i < s.length()-k+1; i++){
            vector.add(s.substring(i,k+i));
        }

        smallest = vector.get(0);
        largest = vector.get(vector.size()-1);

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'

        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
        System.out.println(getSmallestAndLargest(s, k));
    }
}
