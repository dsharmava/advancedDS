package rerunPractice.heap;

import heap.Heap;

public class App {
	public static void main(String[] args) {
		Heap h = new Heap(6);
		try {
			h.insert(0);
			h.insert(1);
			h.insert(2);
			h.insert(3);
			h.insert(4);
			h.insert(5);
			
			System.out.println("Getting max : "+h.getMax());
			
		} catch (RuntimeException e) {
			System.out.println(e);
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			h.displayHeap();
		}
		
	}
}
