import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // number of lists
        List<List<Integer>> lists = new ArrayList<>();

        // Read each list
        for (int i = 0; i < n; i++) {
            int d = sc.nextInt(); // number of elements in this list
            List<Integer> inner = new ArrayList<>();
            for (int j = 0; j < d; j++) {
                inner.add(sc.nextInt());
            }
            lists.add(inner);
        }

        int q = sc.nextInt(); // number of queries
        for (int i = 0; i < q; i++) {
            int x = sc.nextInt(); // list index (1-based)
            int y = sc.nextInt(); // element index (1-based)
            try {
                System.out.println(lists.get(x - 1).get(y - 1));
            } catch (Exception e) {
                System.out.println("ERROR!");
            }
        }
    }
}