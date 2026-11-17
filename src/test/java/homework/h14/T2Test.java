package homework.h14;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class T2Test {

  @Test
  void testQueueUsingStacks() {

    T2 queue = new T2();

    assertTrue(queue.empty());

    queue.push(1);

    queue.push(2);

    assertEquals(1, queue.peek());

    assertEquals(1, queue.pop());

    assertFalse(queue.empty());

    queue.push(3);

    assertEquals(2, queue.pop());

    assertEquals(3, queue.pop());

    assertTrue(queue.empty());
  }
}
