import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
  final private  Solution sol = new Solution();
  @Test
  void topKFrequentExample1() {
    assertArrayEquals(new int[]{1,2}, sol.topKFrequent(new int[]{1,1,1,2,2,3}, 2));
  }
  @Test
  void topKFrequentExample2() {
    assertArrayEquals(new int[]{1}, sol.topKFrequent(new int[]{1}, 1));
  }
}