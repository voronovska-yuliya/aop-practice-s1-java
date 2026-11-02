package homework.h10;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class T2Test {

  private final T2 solution = new T2();

  @Test
  void shouldReverseHello() {

    char[] s = {'h', 'e', 'l', 'l', 'o'};

    solution.reverseString(s);

    assertThat(s).containsExactly('o', 'l', 'l', 'e', 'h');
  }

  @Test
  void shouldReverseTwoCharacters() {

    char[] s = {'H', 'i'};

    solution.reverseString(s);

    assertThat(s).containsExactly('i', 'H');
  }

  @Test
  void shouldKeepSingleCharacter() {

    char[] s = {'a'};

    solution.reverseString(s);

    assertThat(s).containsExactly('a');
  }

  @Test
  void shouldHandleEmptyArray() {

    char[] s = {};

    solution.reverseString(s);

    assertThat(s).isEmpty();
  }

  @Test
  void shouldReverseEvenLengthArray() {

    char[] s = {'a', 'b', 'c', 'd'};

    solution.reverseString(s);

    assertThat(s).containsExactly('d', 'c', 'b', 'a');
  }

  @Test
  void shouldReverseOddLengthArray() {

    char[] s = {'1', '2', '3'};

    solution.reverseString(s);

    assertThat(s).containsExactly('3', '2', '1');
  }
}
