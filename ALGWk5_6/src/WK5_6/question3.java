package WK5_6;

import java.util.Arrays;


public class question3<E> implements StackE<E> {
	    public static final int CAPACITY = 1000;
	    private E[] data;
	    private int t = -1;

	    public question3() {
	        this(CAPACITY); 
	    }

	    public question3(int capacity) { // Creates stack with given capacity
	        data = (E[]) new Object[capacity];
	    }

	    public int size() {
	        return (t + 1);
	    }

	    public boolean isEmpty() {
	        return (t == -1);
	    }

	    public void push(E e) throws IllegalStateException {
	        if (size() == data.length) throw new IllegalStateException("Stack is full.");
	        data[++t] = e;
	    }

	    public E top() {
	        if (isEmpty()) return null;
	        return data[t];
	    }

	    public E pop() {
	        if (isEmpty()) return null;
	        E answer = data[t];
	        data[t] = null;
	        t--;
	        return answer;
	    }

	    public static <E> void transfer(StackE<E> S, StackE<E> T) {
	        StackE<E> tempStack = new question3<>(); // Temporary placeholder

	        // Transfer To placeholder
	        while (!S.isEmpty()) {
	            tempStack.push(S.pop());
	        }

	        // Transfer from placeholder to T
	        while (!tempStack.isEmpty()) {
	            T.push(tempStack.pop());
	        }
	    }

	    public static void main(String[] args) {
	        StackE<Integer> S = new question3<>();
	        StackE<Integer> T = new question3<>();

	        // Copy Stack S as provided in Homework
	        S.push(5); // contents: (5)
	        S.push(3); // contents: (5, 3)
	        System.out.println(S.size()); // contents: (5, 3) outputs 2
	        System.out.println(S.pop()); // contents: (5) outputs 3
	        System.out.println(S.isEmpty()); // contents: (5) outputs false
	        System.out.println(S.pop()); // contents: () outputs 5
	        System.out.println(S.isEmpty()); // contents: () outputs true
	        System.out.println(S.pop()); // contents: () outputs null
	        S.push(7); // contents: (7)
	        S.push(9); // contents: (7, 9)
	        System.out.println(S.top()); // contents: (7, 9) outputs 9
	        S.push(4); // contents: (7, 9, 4)
	        System.out.println(S.size()); // contents: (7, 9, 4) outputs 3
	        System.out.println(S.pop()); // contents: (7, 9) outputs 4
	        S.push(6); // contents: (7, 9, 6)
	        S.push(8); // contents: (7, 9, 6, 8)
	        System.out.println(S.pop()); // contents: (7, 9, 6) outputs 8

	        // Transfer elements from S to T
	        transfer(S, T);

	        // Display contents of T
	        while (!T.isEmpty()) {
	            System.out.println(T.pop());
	        }
	    }
	}
