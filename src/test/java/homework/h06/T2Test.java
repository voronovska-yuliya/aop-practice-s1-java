package homework.h06;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class T2Test {

  @Test
  void shouldReturnTrueForPalindromePhrase() {
    assertThat(T2.isPalindrome("A man, a plan, a canal: Panama")).isTrue();
  }

  @Test
  void shouldReturnFalseForNonPalindromePhrase() {
    assertThat(T2.isPalindrome("race a car")).isFalse();
  }

  @Test
  void shouldReturnTrueForWhitespace() {
    assertThat(T2.isPalindrome(" ")).isTrue();
  }

  @Test
  void shouldReturnTrueForSingleCharacter() {
    assertThat(T2.isPalindrome("a")).isTrue();
  }

  @Test
  void shouldReturnFalseForLetterAndDigit() {
    assertThat(T2.isPalindrome("0P")).isFalse();
  }

  @Test
  void shouldReturnTrueForEmptyString() {
    assertThat(T2.isPalindrome("")).isTrue();
  }
}
