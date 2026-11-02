package homework.h10;

class T1 {
  public char kthCharacter(int k) {
    String word = "a";

    while (word.length() < k) {
      StringBuilder next = new StringBuilder(word);

      for (int i = 0; i < word.length(); i++) {
        next.append((char) (word.charAt(i) + 1));
      }

      word = next.toString();
    }

    return word.charAt(k - 1);
  }
}
