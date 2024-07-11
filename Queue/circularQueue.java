public class circularQueue {
    int front = -1;
    int rear = -1;
    int[] arrayqueue = new int[5];
    int n = arrayqueue.length;

    public void display(){
        int i = front;
        int n = arrayqueue.length;
        if(front == -1 && rear == -1){
            System.out.println("Queue is Empty");
        }
        else{
            while(i != rear){
                System.out.print(arrayqueue[i]);
                i = ((i + 1)%n);
                System.out.print(", ");
            }
            System.out.print(arrayqueue[rear]);
            System.out.println();
        }
    }

    public void circularEnqueue(int x){
        if(front == -1 && rear == -1){
            front = rear = 0;
            arrayqueue[rear] = x;
            System.out.println(x + " enqueued");
        }
        else if(((rear +1) % n) == front){
            System.out.println("Queue is full");
        }
        else{
            rear = (rear +1) % n;
            arrayqueue[rear] = x;
            System.out.println(x + " enqueued");
        }
    }

    public void circularDequeue(){
        if(front == -1 && rear == -1){
            System.out.println("Queue is Empty");
        }
        else if(front == rear){
            front = rear = -1;
        }
        else{
            System.out.println(arrayqueue[front] + " dequeued");
            front = (front +1) % n;
        }
    }
    public boolean IsEmpty(){
        if(front == -1 && rear == -1){
            return true; 
        }
        else{
            return false;
        }
    }
    public void peek(){
        if(IsEmpty()){
            System.out.println("Nothing to peek");
        }
        else{
            System.out.println(arrayqueue[front]);
        }
    }
}
