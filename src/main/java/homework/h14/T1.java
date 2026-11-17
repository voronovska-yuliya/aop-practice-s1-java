package homework.h14;

public class T1 {

  public String removeDuplicates(String s) {

    StringBuilder result = new StringBuilder();

    for (char c : s.toCharArray()) {

      int length = result.length();

      if (length > 0 && result.charAt(length - 1) == c) {

        result.deleteCharAt(length - 1);

      } else {

        result.append(c);
      }
    }

    return result.toString();
  }
}
