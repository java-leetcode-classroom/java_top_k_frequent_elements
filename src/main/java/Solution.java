import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
  public int[] topKFrequent(int[] nums, int k) {
    HashMap<Integer, Integer> freq = new HashMap<>();
    HashMap<Integer, List<Integer>> bucket = new HashMap<>();
    int nLen = nums.length;
    int count = 0;
    int[] result = new int[k];
    for (int num : nums) {
      if (!freq.containsKey(num)) {
        freq.put(num, 0);
      }
      freq.put(num, freq.get(num)+1);
    }
    for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
      if (!bucket.containsKey(entry.getValue())) {
        bucket.put(entry.getValue(), new ArrayList<>());
      }
      bucket.get(entry.getValue()).add(entry.getKey());
    }

    for (int i = nLen; i >=0; i--) {
      if (bucket.containsKey(i)) {
        List<Integer> list = bucket.get(i);
        for (Integer integer : list) {
          result[count] = integer;
          count++;
          if (count == k) {
            return result;
          }
        }
      }
    }

    return result;
  }
}
