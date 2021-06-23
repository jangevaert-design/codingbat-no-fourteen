package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CodingBatNoFourteenTest {

  private int[][] fourteenParams = {
      {1, 2, 3},
      {1, 2, 3, 4},
      {2, 3, 4},
      {1, 1, 4, 4},
      {2, 2, 4, 4},
      {2, 3, 4, 1},
      {2, 1, 1},
      {1, 4},
      {2},
      {2, 1},
      {1},
      {4},
      {},
      {1, 1, 1, 1},
      {9, 4, 4, 1},
      {4, 2, 3, 1},
      {4, 2, 3, 5},
      {4, 4, 2},
      {1, 4, 4}
  };

  private boolean[] fourteenExpected = {true, false, true,false, true, false, true, false, true, true,
  true, true, true, true, false, false, true, true, false};


  @Test
  void fourteenTest() {
    for (int i = 0; i < fourteenParams.length; i++) {
      boolean actual = CodingBatNoFourteen.no14(fourteenParams[i]);
      Assertions.assertEquals(actual, fourteenExpected[i]);
    }
  }

}