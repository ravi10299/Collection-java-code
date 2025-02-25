package List;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEx2 {
    public static void main(String[] args) {
        // Check the initial capacity of the list.
        ArrayList<Integer> list = new ArrayList<>(11);

        Collections.addAll(list, 1, 20, 23, 14, 5, 50, 60, 70, 80, 90, 100);
        System.out.println("Size: " + list.size());

        // Estimate the capacity based on the size and default growth policy
        int capacity = estimateCapacity(list);
        System.out.println("Estimated Capacity: " + capacity);
    }

    private static int estimateCapacity(ArrayList<?> list) {
        int size = list.size();
        int capacity = 10; // Default initial capacity
        while (capacity < size) {
            capacity = (capacity * 3) / 2 + 1;
        }
        return capacity;
    }
}