import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircularArrayQueueTest {
    private final String[] testData = {"ant", "bat", "cat", "dog","fly"};
    private final int MAX_STACK = 10;
    private CircularArrayQueue circularArrayQueue;
    @BeforeEach
    void setUp() {
        circularArrayQueue = new CircularArrayQueue(MAX_STACK);
        for (String str: testData) {
            circularArrayQueue.enqueue(str);
        }
    }

    @Test
    void enqueue() {
        String newItem = "gnu";
        //add a new item
        circularArrayQueue.enqueue(newItem);
        int size = circularArrayQueue.size();
        //remove everything in front of the new item
        for (int i = 0; i <  size - 1; i++) {
            Object dequeue = circularArrayQueue.dequeue();
        }
        assertEquals(newItem, circularArrayQueue.front());
    }

    @Test
    void dequeue() {
        assertEquals(testData[0], circularArrayQueue.dequeue());
    }

    @Test
    void front() {
        assertEquals(testData[0], circularArrayQueue.front());
    }

    @Test
    void size() {
        assertEquals(testData.length, circularArrayQueue.size());
    }

    @Test
    void isEmpty() { assertFalse(circularArrayQueue.isEmpty());
    }
}