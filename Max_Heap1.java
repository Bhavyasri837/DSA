import java.util.*;

class MaxHeap {
    int[] heap;
    int size;

    MaxHeap(int capacity) {
        heap = new int[capacity];
        size = 0;
    }

    int parent(int i) {
        return (i - 1) / 2;
    }

    int left(int i) {
        return 2 * i + 1;
    }

    int right(int i) {
        return 2 * i + 2;
    }

    void insert(int val) {
        heap[size] = val;
        int i = size;
        size++;

        while (i > 0 && heap[i] > heap[parent(i)]) {
            int temp = heap[i];
            heap[i] = heap[parent(i)];
            heap[parent(i)] = temp;
            i = parent(i);
        }
    }

    int extractMax() {
        if (size == 0) {
            System.out.println("Heap is empty");
            return -1;
        }

        int root = heap[0];
        heap[0] = heap[size - 1];
        size--;
        heapify(0);
        return root;
    }

    void heapify(int i) {
        int largest = i;
        int l = left(i);
        int r = right(i);

        if (l < size && heap[l] > heap[largest]) largest = l;
        if (r < size && heap[r] > heap[largest]) largest = r;

        if (largest != i) {
            int temp = heap[i];
            heap[i] = heap[largest];
            heap[largest] = temp;
            heapify(largest);
        }
    }

    void printHeap() {
        for (int i = 0; i < size; i++) {
            System.out.print(heap[i] + " ");
        }
        System.out.println();
    }
}

public class Max_Heap1 {
    public static void main(String[] args) {
        MaxHeap ob = new MaxHeap(10); // specify capacity
        ob.insert(22);
        ob.insert(54);
        ob.insert(63);
        ob.insert(42);
        ob.insert(78);

        System.out.println("Heap array:");
        ob.printHeap();

        System.out.println("The max value is: " + ob.extractMax());

        System.out.println("Heap after extracting max:");
        ob.printHeap();
    }
}
