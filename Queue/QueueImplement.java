public class QueueImplement {
    public static void main(String[] args) {
        Queue q = new Queue();
        q.IsEmpty();
        q.enqueue(2);
        q.enqueue(8);
        q.display();
        q.dequeue();
        q.display();
        q.enqueue(5);
        q.display();
        q.dequeue();
        q.dequeue();
        q.peek();

    }
    
}