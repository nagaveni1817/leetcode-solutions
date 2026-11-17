
class FrontMiddleBackQueue {

    class Node {
        Node prev;
        Node next;
        int data;

        Node(int data) {
            this.data = data;
        }
    }

    Node head;
    Node tail;
    Node middle;
    int size;

    public FrontMiddleBackQueue() {
        head = null;
        tail = null;
        middle = null;
        size = 0;
    }

    public void pushFront(int val) {
        Node newnode = new Node(val);

        if (head == null) {
            head = newnode;
            tail = newnode;
            middle = newnode;
        } else {
            newnode.next = head;
            head.prev = newnode;
            head = newnode;

            if (size % 2 == 1) {
                middle = middle.prev;
            }
        }

        size++;
    }

    public void pushMiddle(int val) {
        Node newNode = new Node(val);

        if (size == 0) {
            head = newNode;
            tail = newNode;
            middle = newNode;
        }
        else if (size % 2 == 1) {
            Node prevNode = middle.prev;

            newNode.next = middle;
            newNode.prev = prevNode;

            if (prevNode != null) {
                prevNode.next = newNode;
            }

            middle.prev = newNode;

            if (middle == head) {
                head = newNode;
            }

            middle = newNode;
        }
        else {
            Node nextNode = middle.next;

            newNode.prev = middle;
            newNode.next = nextNode;

            middle.next = newNode;

            if (nextNode != null) {
                nextNode.prev = newNode;
            }

            if (middle == tail) {
                tail = newNode;
            }

            middle = newNode;
        }

        size++;
    }

    public void pushBack(int val) {
        Node newnode = new Node(val);

        if (head == null) {
            head = newnode;
            tail = newnode;
            middle = newnode;
        } else {
            tail.next = newnode;
            newnode.prev = tail;
            tail = newnode;

            if (size % 2 == 0) {
                middle = middle.next;
            }
        }

        size++;
    }

    public int popFront() {
        if (head == null) {
            return -1;
        }

        int popf = head.data;

        if (size == 1) {
            head = null;
            tail = null;
            middle = null;
        } else {
            head = head.next;
            head.prev = null;

            if (size % 2 == 0) {
                middle = middle.next;
            }
        }

        size--;
        return popf;
    }

    public int popMiddle() {
        if (size == 0) {
            return -1;
        }

        int deleted = middle.data;

        if (size == 1) {
            head = null;
            tail = null;
            middle = null;
        } else {
            Node prevNode = middle.prev;
            Node nextNode = middle.next;

            if (size % 2 == 1) {
                middle = prevNode;
            } else {
                middle = nextNode;
            }

            if (prevNode == null) {
                head = nextNode;
            } else {
                prevNode.next = nextNode;
            }

            if (nextNode == null) {
                tail = prevNode;
            } else {
                nextNode.prev = prevNode;
            }
        }

        size--;
        return deleted;
    }

    public int popBack() {
        if (tail == null) {
            return -1;
        }

        int popb = tail.data;

        if (size == 1) {
            head = null;
            tail = null;
            middle = null;
        } else {
            tail = tail.prev;
            tail.next = null;

            if (size % 2 == 1) {
                middle = middle.prev;
            }
        }

        size--;
        return popb;
    }
}
