public interface Queue {
    /**
     * Adds an object to the back of the queue
     * @param data
     */
    public void enqueue(Object data);

    /**
     * Removes an object from the front of the queue
     * @return
     */
    public Object dequeue();

    /**
     * Returns the item at the front of the queue without removing it
     * @return
     */
    public Object front();
    /**
     * Returns the number of items in the queue
     * @return
     */
    public int size();

    /**
     * Returns true if the queue is empty
     * @return
     */
    public boolean isEmpty();
}
