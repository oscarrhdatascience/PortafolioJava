import java.util.LinkedList;

public class BasicQueue {
    private LinkedList<Integer> list = new LinkedList<>();

    public void enqueue(int item) {
        list.addLast(item);
    }

    public int dequeue() {
        return list.removeFirst();
    }

    public int size() {
        return list.size();
    }

    public static void main(String[] args) {
        BasicQueue q = new BasicQueue();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        System.out.println(q.dequeue());  // 1
    }
}
