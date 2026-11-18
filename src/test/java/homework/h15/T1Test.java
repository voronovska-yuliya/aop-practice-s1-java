package homework.h15;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class T1Test {

  @Test
  void testInvertTree() {

    T1 solution = new T1();

    T1.TreeNode root = new T1.TreeNode(4);

    root.left = new T1.TreeNode(2);

    root.right = new T1.TreeNode(7);

    root.left.left = new T1.TreeNode(1);

    root.left.right = new T1.TreeNode(3);

    root.right.left = new T1.TreeNode(6);

    root.right.right = new T1.TreeNode(9);

    T1.TreeNode result = solution.invertTree(root);

    assertEquals(4, result.val);

    assertEquals(7, result.left.val);

    assertEquals(2, result.right.val);

    assertEquals(9, result.left.left.val);

    assertEquals(6, result.left.right.val);

    assertEquals(3, result.right.left.val);

    assertEquals(1, result.right.right.val);

    assertNull(solution.invertTree(null));
  }
}
