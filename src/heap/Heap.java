package heap;

public class Heap {
   private int size;
   private Integer[] heap;
   private int currentPosition = -1;
   
   public Heap(int sizeVal){
	   this.size = sizeVal;
	   this.heap = new Integer[this.size];
   }
   
   //TODO: add method to insert to heap
   public void insert(int data){
	   if(isFull()){
		   throw new RuntimeException("heap size full..");
	   }else{
		    this.heap[++this.currentPosition] = data;
		    fixUp();// method to fix the max heapify property
	   }
   }
   //TODO: get max value
  public int getMax(){
	    int result = this.heap[0];
	    this.heap[0] = this.heap[this.currentPosition--];
	    this.heap[this.currentPosition +1] = null;
	    fixDown(0,-1);
	    return result;
  }  
  
  private void fixDown(int start, int end) {
	if(end < 0) end = this.currentPosition;
	
	while(start <= end){
		int leftChild = 2*start+1;
		int rightChild = 2*start+2;
		
		if(leftChild <= end){
			int childToSwap;
			if(rightChild > end){
				childToSwap = leftChild;
			}else{
				childToSwap = (this.heap[leftChild] > this.heap[rightChild])? leftChild : rightChild;
			}
			
			if(this.heap[start] < this.heap[childToSwap]){
				int temp = this.heap[start];
				this.heap[start] = this.heap[childToSwap];
				this.heap[childToSwap] = temp;
			}else{
				break;
			}
			
			start = childToSwap;
		}else{
			break;
		}
	}
	
}

//TODO: get min value
   private void fixUp() {
	int index = this.currentPosition;    
    int parentIndex = (index -1)/2;
     
    while(parentIndex >=0 && this.heap[parentIndex] < this.heap[index]){
    	int temp = this.heap[index];
    	this.heap[index] = this.heap[parentIndex];
    	this.heap[parentIndex] = temp;
    	index = parentIndex;
    	parentIndex = (index -1)/2;
    }
}

private boolean isFull(){
	   boolean result = false;
	   if(this.currentPosition >= this.size-1){
		   result = true;
	   }
	   return result;
   }
   
private boolean isEmpty(){
	   boolean result = false;
	   if(this.currentPosition == -1){
		   result = true;
	   }
	   return result;
}  

 public void displayHeap(){
	 System.out.print("Heap data :");
	 for(int x=0;x<this.size;x++){
		 System.out.print(this.heap[x]+" ");
	 }
	 System.out.println();
 }  
   
}
