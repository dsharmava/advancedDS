package rerunPractice.heap;

public class Heap {
	private int size;
	private int heapArr[];
	private int currentPosition = -1;

	public Heap(int sizeVal) {
		this.size = sizeVal;
		this.heapArr = new int[this.size];
	}

	// TODO: Insert operation
	public void insert(int val) {
		if (!isFull()) {
			this.heapArr[++currentPosition] = val;
			this.fixUp(currentPosition);
		} else {
			throw new RuntimeException("Heap is full");
		}
	}

	// TODO: isFull
	public boolean isFull() {
		return this.currentPosition == this.size - 1;
	}

	// TODO: Since we will be inserting the value at the end we will need a
	// fixUp method
	public void fixUp(int index) {
		int parentIndex = (index - 1) / 2;

		while (parentIndex >= 0 && heapArr[parentIndex] < heapArr[index]) {
			swap(parentIndex, index);
			index = parentIndex;
			parentIndex = (index - 1) / 2;
		}
	}

	// TODO: Get the max value from heap(assuming we are creating max heap)
	public int getMax() {
		int result = heapArr[0];
		heapArr[0] = heapArr[currentPosition--];
		fixDown(0, -1);

		return result;
	}

	private void fixDown(int start, int upto) {
		if (upto < 0) {
			upto = currentPosition;
		}
		while (start <= upto) {
			int leftChild = 2 * start + 1;
			int rightChild = 2 * start + 2;

			if (leftChild <= upto) {
				int childToSwap = leftChild;

				if (rightChild <= upto) {
					childToSwap = heapArr[leftChild] > heapArr[rightChild] ? leftChild : rightChild;
				}

				if (heapArr[childToSwap] > heapArr[start]) {
					swap(childToSwap, start);
				} else {
                   break;
				}
				start = childToSwap;
			}else{
				break;
			}
		}

	}
	
	public void displayHeap(){
		 System.out.print("Heap data :");
		 for(int x=0;x<this.size;x++){
			 System.out.print(this.heapArr[x]+" ");
		 }
		 System.out.println();
	 }  

	// TODO: swap operation
	private void swap(int i, int j) {
		int temp = heapArr[i];
		heapArr[i] = heapArr[j];
		heapArr[j] = temp;
	}
}
