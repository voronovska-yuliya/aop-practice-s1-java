package homework.h16;

public class T1 {

  public int[][] floodFill(int[][] image, int sr, int sc, int color) {

    int originalColor = image[sr][sc];

    if (originalColor == color) {

      return image;
    }

    fill(image, sr, sc, originalColor, color);

    return image;
  }

  private void fill(int[][] image, int row, int col, int originalColor, int color) {

    if (row < 0) {

      return;
    }

    if (row >= image.length) {

      return;
    }

    if (col < 0) {

      return;
    }

    if (col >= image[0].length) {

      return;
    }

    if (image[row][col] != originalColor) {

      return;
    }

    image[row][col] = color;

    fill(image, row - 1, col, originalColor, color);

    fill(image, row + 1, col, originalColor, color);

    fill(image, row, col - 1, originalColor, color);

    fill(image, row, col + 1, originalColor, color);
  }
}
