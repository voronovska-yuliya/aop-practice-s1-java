package homework.h06;

// https://leetcode.com/problems/valid-anagram/
public class T1 {
  public static boolean isAnagram(String firstWord, String secondWord) {
    if (firstWord.length() != secondWord.length()) {
      return false;
    }
    int[] characterCounts = new int[26];
    for (int i = 0; i < firstWord.length(); i++) {
      characterCounts[firstWord.charAt(i) - 'a']++;
      characterCounts[secondWord.charAt(i) - 'a']--;
    }
    for (int value : characterCounts) {
      if (value != 0) {
        return false;
      }
    }
    return true;
  }
}
