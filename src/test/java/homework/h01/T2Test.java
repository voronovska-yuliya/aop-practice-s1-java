package homework.h01;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class T2Test {

  @Test
  void returnsTrueForZero() {
    assertThat(T2.isSameAfterReversals(0)).isTrue();
  }

  @Test
  void returnsTrueForNumberNotEndingInZero() {
    assertThat(T2.isSameAfterReversals(526)).isTrue();
  }

  @Test
  void returnsFalseForNumberEndingInZero() {
    assertThat(T2.isSameAfterReversals(120)).isFalse();
  }

  @Test
  void returnsFalseForNumber1800() {
    assertThat(T2.isSameAfterReversals(1800)).isFalse();
  }
}
