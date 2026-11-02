package homework.h06;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class T1Test {
  @Test
  void shouldReturnTrueForAnagrams() {
    assertThat(T1.isAnagram("anagram", "nagaram")).isTrue();
  }

  @Test
  void shouldReturnFalseForDifferentWords() {
    assertThat(T1.isAnagram("rat", "car")).isFalse();
  }

  @Test
  void shouldReturnFalseForDifferentLengths() {
    assertThat(T1.isAnagram("a", "ab")).isFalse();
  }

  @Test
  void shouldReturnTrueForIdenticalWords() {
    assertThat(T1.isAnagram("a", "a")).isTrue();
  }

  @Test
  void shouldReturnTrueForEmptyStrings() {
    assertThat(T1.isAnagram("", "")).isTrue();
  }
}
