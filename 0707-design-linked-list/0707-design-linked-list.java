class MyLinkedList {
     class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    Node head;
    int size;

    public MyLinkedList() {
        head = null;
        size = 0;
    }

    public int get(int index) {
        if (index < 0 || index >= size)
            return -1;

        Node current = head;

        for (int i = 0; i < index; i++)
            current = current.next;

        return current.val;
    }

    public void addAtHead(int val) {
        Node newNode = new Node(val);

        newNode.next = head;
        head = newNode;

        size++;
    }

    public void addAtTail(int val) {
        Node newNode = new Node(val);

        if (head == null) {
            head = newNode;
        } else {
            Node current = head;

            while (current.next != null)
                current = current.next;

            current.next = newNode;
        }

        size++;
    }

    public void addAtIndex(int index, int val) {
        if (index < 0 || index > size)
            return;

        if (index == 0) {
            addAtHead(val);
            return;
        }

        Node current = head;

        for (int i = 0; i < index - 1; i++)
            current = current.next;

        Node newNode = new Node(val);

        newNode.next = current.next;
        current.next = newNode;

        size++;
    }

    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size)
            return;

        if (index == 0) {
            head = head.next;
        } else {
            Node current = head;

            for (int i = 0; i < index - 1; i++)
                current = current.next;

            current.next = current.next.next;
        }

        size--;
    }
   /*ListNode head;
    public MyLinkedList() {
     
    }
    
    public int get(int index) {
        ListNode cur=head;
        for(int i=0; i< index;i++){
            if(cur==null){
                return -1;

            }
            cur=cur.next;
        }
        if(cur==null){
            return -1;
        }
        return cur.val;
    }
    
    public void addAtHead(int val) {
        ListNode newNode=new ListNode(val);
       
        newNode.next=head;
        head=newNode;
    }
    
    public void addAtTail(int val) {
        ListNode newNode=new ListNode(val);
       
        if(head==null){
            head=newNode;
            return;
        }
        ListNode cur=head;
        while(cur.next != null){
            cur=cur.next;
        }
        cur.next=newNode;
    }
    
    public void addAtIndex(int index, int val) {
        ListNode newNode=new ListNode(val);
      
        if(index<0){
            return;
        }
        if(index==0){
           addAtHead(val);
            return;
        }
        ListNode cur=head;
        for(int i=0;i<index-1; i++){
            if (cur == null) {
               return;
            }
            cur=cur.next;
        }
        if (cur == null) {
            return;
        }
        newNode.next=cur.next;
        cur.next=newNode;
    }
    
    public void deleteAtIndex(int index) {
        if(head==null){
            return ;
        }
        if(index==0){
            head=head.next;
            return;
        }
        ListNode cur=head;
        for(int i=0; i< index-1; i++){
            if (cur.next == null) {
            return;
            }
            cur=cur.next;
        }
        if (cur.next == null) {
            return;
        }
        cur.next=cur.next.next;
    }*/
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */