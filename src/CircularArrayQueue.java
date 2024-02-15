public class CircularArrayQueue implements Queue {

    private Object[] arrayQueue;
    //How many items in the queue
    private int size;
    //Maximum items that could be stored
    private int maxSize;
    private int front;
    private int rear;

    /**
     * Constructor initialises CircularArrayQueue fields
     * @param maxSize
     */
    public CircularArrayQueue(int maxSize) {
        this.maxSize = maxSize;
        size = 0;
        arrayQueue = new Object[maxSize];
        front = 0;
        rear = 0;
    }

    /**
     * Adds an object to the back of the queue
     *
     * @param data
     */
    @Override
    public void enqueue(Object data) {
        //Complete this method
    }

    /**
     * Removes an object from the front of the queue
     * @return Object
     */
    @Override
    public Object dequeue() {
        Object item = null;
        //Complete this method
        return item;
    }

    /**
     * Returns the item at the front of the queue without removing it
     * @return Object
     */
    @Override
    public Object front() {
        if (isEmpty())
            throw new IllegalStateException("Queue is empty!");
        return arrayQueue[front];
    }

    /**
     * Returns the number of items in the queue
     * @return int
     */
    @Override
    public int size() {
        return size;
    }

    /**
     * Returns true if the queue is empty
     * @return boolean
     */
    @Override
    public boolean isEmpty() {
        return size == 0;
    }
}
