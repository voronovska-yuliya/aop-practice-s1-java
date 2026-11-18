package homework.h15;

public class T2 {

  public int rangeSumBST(T1.TreeNode root, int low, int high) {

    if (root == null) {

      return 0;
    }

    if (root.val < low) {

      return rangeSumBST(root.right, low, high);
    }

    if (root.val > high) {

      return rangeSumBST(root.left, low, high);
    }

    return root.val + rangeSumBST(root.left, low, high) + rangeSumBST(root.right, low, high);
  }
}
