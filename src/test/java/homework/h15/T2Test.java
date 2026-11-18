package homework.h15;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class T2Test {

  @Test
  void testRangeSumBST() {

    T2 solution = new T2();

    T1.TreeNode root = new T1.TreeNode(10);

    root.left = new T1.TreeNode(5);

    root.right = new T1.TreeNode(15);

    root.left.left = new T1.TreeNode(3);

    root.left.right = new T1.TreeNode(7);

    root.right.right = new T1.TreeNode(18);

    assertEquals(32, solution.rangeSumBST(root, 7, 15));

    assertEquals(22, solution.rangeSumBST(root, 5, 10));

    assertEquals(0, solution.rangeSumBST(null, 1, 10));
  }
}
