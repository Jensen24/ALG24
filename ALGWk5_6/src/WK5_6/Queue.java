package WK5_6;

public interface Queue<E> {
	int size();
    boolean isEmpty();
    void enqueue(E e) throws IllegalStateException;
    E first();
    E dequeue();
    void rotate();
}
