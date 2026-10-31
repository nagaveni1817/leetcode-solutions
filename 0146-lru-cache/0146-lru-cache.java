class LRUCache {
    class Node {
        int key, value;
        Node prev, next;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }
     HashMap<Integer, Node> map;
    Node head, tail;
    int capacity;
    public LRUCache(int capacity) {
        this.capacity = capacity;
        map = new HashMap<>();

        head = new Node(0, 0);
        tail = new Node(0, 0);

        head.next = tail;
        tail.prev = head;
    }
    private void addNode(Node node) {
        node.next = head.next;
        node.prev = head;

        head.next.prev = node;
        head.next = node;
    }
    private void removeNode(Node node) {
        Node before = node.prev;
        Node after = node.next;

        before.next = after;
        after.prev = before;
    }
    public int get(int key) {
        if (!map.containsKey(key)) {
            return -1;
        }

        Node node = map.get(key);

        removeNode(node);
        addNode(node);

        return node.value;
    }
    
    public void put(int key, int value) {
         if (map.containsKey(key)) {
            Node node = map.get(key);

            node.value = value;

            removeNode(node);
            addNode(node);

            return;
        }

      
        Node newNode = new Node(key, value);

        map.put(key, newNode);
        addNode(newNode);

      
        if (map.size() > capacity) {
            Node lru = tail.prev;

            removeNode(lru);
            map.remove(lru.key);
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */