class MyCircularQueue {
    int size ;
    int[] arr;
    boolean[] hasValueArr ;
    int selectedIndex;
    int insertPointer;
    int deletePointer;
    int counter ;
    
    public MyCircularQueue(int k) {
        size =k;
        arr = new int[size];
        hasValueArr =new boolean[size];
        selectedIndex =0;
        insertPointer=-1;
        deletePointer=0;
        counter=0;
    }
    
    public boolean enQueue(int value) {
        if(isFull())
            return false;
        if(insertPointer == size-1) insertPointer =0;
        else insertPointer++;
        
        arr[insertPointer] = value ;
        hasValueArr[insertPointer] = true ;
        

        
        counter++;
        return true;
    }
    
    public boolean deQueue() {
        if(isEmpty()) return false; 
        hasValueArr[deletePointer]=false;
        
        if(deletePointer==size-1) deletePointer =0;
        else deletePointer ++;
        
        counter--;
        return true;
    }
    
    public int Front() {
        if(isEmpty()) return -1;

        if(hasValueArr[deletePointer])
            return arr[deletePointer];
        return -1;
        
    }
    
    public int Rear() {
        if(isEmpty()) return -1;
        if(hasValueArr[insertPointer])
            return arr[insertPointer];
        return -1;
    }
    
    public boolean isEmpty() {
        return counter==0;
        
    }
    
    public boolean isFull() {
        return counter ==size;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */