import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<>();
        Map<Integer, Integer> freq = new HashMap<>();
        
        int n = in.nextInt(); 
        int m = in.nextInt(); 
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        
        int maxUnique = 0;
        
        for (int i = 0; i < n; i++) {
        
            deque.addLast(arr[i]);
            freq.put(arr[i], freq.getOrDefault(arr[i], 0) + 1);
            
          
            if (deque.size() > m) {
                int removed = deque.removeFirst();
                freq.put(removed, freq.get(removed) - 1);
                if (freq.get(removed) == 0) {
                    freq.remove(removed);
                }
            }
            
           
            if (deque.size() == m) {
                maxUnique = Math.max(maxUnique, freq.size());
            }
        }
        
        System.out.println(maxUnique);
    }
}
