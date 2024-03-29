package eg.edu.alexu.csd.datastructure.queue.cs26;

public interface IQueue {
    /**
     * Inserts an item at the queue front.
     */
    public void enqueue(Object item);
    /**
     * Removes the object at the queue rear and returns it.
     * @return
     */
    public Object dequeue();
    /**
     * Tests if this queue is empty.
     */
    public boolean isEmpty();
    /**
     * Returns the number of elements in the queue
     */
    public int size();
}
