package homework.h13;

class T1 {

  private final int badVersion;

  public T1(int badVersion) {

    this.badVersion = badVersion;
  }

  public int firstBadVersion(int n) {

    int left = 1;

    int right = n;

    while (left < right) {

      int middle = left + (right - left) / 2;

      if (isBadVersion(middle)) {

        right = middle;

      } else {

        left = middle + 1;
      }
    }

    return left;
  }

  private boolean isBadVersion(int version) {

    return version >= badVersion;
  }
}
