package homework.h14;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class T1Test {

  @Test
  void testRemoveDuplicates() {

    T1 solution = new T1();

    assertEquals("ca", solution.removeDuplicates("abbaca"));

    assertEquals("ay", solution.removeDuplicates("azxxzy"));

    assertEquals("", solution.removeDuplicates("aabb"));

    assertEquals("abc", solution.removeDuplicates("abc"));

    assertEquals("a", solution.removeDuplicates("a"));
  }
}
