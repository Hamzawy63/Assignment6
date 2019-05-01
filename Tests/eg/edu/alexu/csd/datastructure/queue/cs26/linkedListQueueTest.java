package eg.edu.alexu.csd.datastructure.queue.cs26;

import org.junit.Test;

import static org.junit.Assert.*;

public class linkedListQueueTest {
    @Test
    public void myArrayQueueTest()
    {
        arrQueue q = new arrQueue(5);
        assertEquals(0,q.size()); // still empty
        assertTrue(q.isEmpty());
        q.enqueue(10);
        assertEquals(1,q.size());
        q.enqueue(11);
        q.enqueue(12);
        q.enqueue(13);
        assertEquals(4,q.size());

    }
    @Test(expected=IllegalStateException.class)
    public void testIllegalStateException()  {
        arrQueue q = new arrQueue(2);
        q.enqueue(11);
        q.enqueue(12);
        q.enqueue(12);
    }

}