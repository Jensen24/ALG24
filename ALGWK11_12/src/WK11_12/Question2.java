package WK11_12;
import java.util.PriorityQueue;
// Implement Selection-Sort Scheme
public class Question2 {
	public static void main(String[] args) {
		int[] sequence = {7, 4, 8, 2, 5, 3, 9};
		PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
		System.out.println("Input Sequence S: ");
		for (int num : sequence) {
			System.out.print(num + " ");
		}
		System.out.println("\n\nPhase 1: ");
		
		for (int i = 0; i < sequence.length; i++) {
			priorityQueue.add(sequence[i]);
			System.out.println("Step " + (i + 1) + ") Priority Queue P: " + priorityQueue);
		}
	}
}


// Phase 2 was too confusing for me