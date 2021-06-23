package edu.cnm.deepdive;

/*

Given an array of ints, return true if it contains no 1's or it contains no 4's.

no14([1, 2, 3]) → true
no14([1, 2, 3, 4]) → false
no14([2, 3, 4]) → true
 */

public class CodingBatNoFourteen {

  private static int[] one = {1, 2, 3};
  private static int[] two = {1, 2, 3, 4};
  private static int[] three = {1, 2, 3};

  public static void main(String[] args) {
    System.out.printf("Given the array [1, 2, 3], the outcome will be " + no14(one) + ".\n");
    System.out.printf("Given the array [1, 2, 3, 4], the outcome will be " + no14(two) + ".\n");
    System.out.printf("Given the array [1, 2, 3], the outcome will be " + no14(three) + ".\n");
  }

  public static boolean no14(int[] nums) {

    for (int num : nums) {
      for (int i : nums) {
        if (num == 1 && i == 4) {
          return false;
        }
      }
    }
    return true;
  }

}
