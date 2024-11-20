package WK11_12;
import java.util.ArrayList;
import java.util.List;
// Merging a List

public class Question1 {
	public static List<Integer> merge(List<Integer> list1, List<Integer> list2) {
		List<Integer> mergedList = new ArrayList<>();
		int i = 0 , p = 0;
		
		while (i < list1.size() && p < list2.size()) {
			if (list1.get(i) < list2.get(p)) {
				mergedList.add(list1.get(i));
				i++;
			} else {
				mergedList.add(list2.get(p));
				p++;
			}
		}
		while (i < list1.size()) {
			mergedList.add(list1.get(i));
			i++;
		}
		while (p < list2.size()) {
			mergedList.add(list2.get(p));
			p++;
		}
		return mergedList;
	}
	// test code
	public static void main(String[] args) {
		List<Integer> list1 = List.of(5, 7, 9);
		List<Integer> list2 = List.of(6, 8, 10);
		List<Integer> merge = merge(list1, list2);
		
		System.out.println("Merge Complete: " + merge);
	}
}

