package WK5_6;
import java.util.Arrays;

public class question4<E> implements Queue<E> {

	public static final int CAPACITY = 1000; // default array capacity
	private E[] data; // generic array used for storage
	private int f = 0; // index of the front element
	private int sz = 0; // current number of elements
	
	public question4() {
		this(CAPACITY);} // constructs queue with default capacity
	public question4(int capacity) { // constructs queue with given capacity
		data = (E[]) new Object[capacity]; // safe cast; compiler may give warning
	}
	public int size() {
		return sz; 
	}
	public boolean isEmpty() { 
		return (sz == 0); 
	}
	public void enqueue(E e) throws IllegalStateException {
		if (sz == data.length) throw new IllegalStateException("Queue is full");
		int avail = (f + sz) % data.length; // use modular arithmetic
		data[avail] = e;
		sz++;
	}
	public E first() {
		if (isEmpty()) return null;
		return data[f];
	}
	public E dequeue() {
		if (isEmpty()) return null;
		E answer = data[f];
		data[f] = null; // dereference to help garbage collection
		f = (f + 1) % data.length;
		sz--;
		return answer;
	}
	public void rotate() {
		if (!isEmpty()) {
			E element = dequeue(); // Removes front element
			enqueue(element); // Puts it back at the end
		}
	}
		public static void main(String[] args) {
				Queue<Integer> S = new question4<>(); // contents: ()
				S.enqueue(5); // contents: (5)
				S.enqueue(3); // contents: (5, 3)
				System.out.println(S.size()); // contents: (5, 3) outputs 2
				S.rotate(); // contents: (3, 5)
				System.out.println(S.dequeue()); // contents: 3
				System.out.println(S.dequeue()); // contents: 5
		}
	}
