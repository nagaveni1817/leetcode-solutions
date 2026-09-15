class MyCircularDeque {
    int[] arr;
    int f;
    int r;
    int size;
    public MyCircularDeque(int k) {
        arr=new int[k];
        f=0;
        r=0;
        size=0;

    }
    
    public boolean insertFront(int value) {
        if(isFull()){
            return false;
        }
        f=(f-1+arr.length)%arr.length;
        arr[f]=value;
        
        size++;
        return true;
    }
    
    public boolean insertLast(int value) {
        if(isFull()){
            return false;
        }
        arr[r]=value;
        r=(r+1)%arr.length;
        size++;
        return true;
    }
    
    public boolean deleteFront() {
        if(isEmpty()){
            return false;
        }
        f=(f+1)%arr.length;
        size--;
        return true;
    }
    
    public boolean deleteLast() {
        if(isEmpty()){
            return false;
        }
        r=(r-1+arr.length)%arr.length;
        size--;
        return true;
    }
    
    public int getFront() {
        if(isEmpty()){
            return -1;
        }
        return arr[f];
    }
    
    public int getRear() {
        if(isEmpty()){
            return -1;
        }
        return arr[(r-1+arr.length)%arr.length];
    }
    
    public boolean isEmpty() {
       return size==0; 
    }
    
    public boolean isFull() {
        return size==arr.length;
    }
}

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */