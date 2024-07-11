public class Queue {
    int front = -1;
    int rear = -1;
    int[] arrayqueue = new int[5];

    public void display(){
        int i;
        int n = arrayqueue.length;
        for(i = front; i < rear+1; i++){
            System.out.print(arrayqueue[i]);
            if(i < n - 1){
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public void enqueue(int x){
        if(IsFull()){
            System.out.println("Can't insert");
        }
        else if(IsEmpty()){
            front=rear=0;
            arrayqueue[rear] = x;
            System.out.println(x + " enqueued");
        }
        else{
            rear++;
            arrayqueue[rear] = x;
            System.out.println(x + " enqueued");
        }
    }

    public void dequeue(){
        if(IsEmpty()){
            System.out.println("Can't delete");
        }
        else if(front == rear){
            front = rear = -1;
        }
        else{
            System.out.println(arrayqueue[front]+ " dequeued");
            for (int i = front; i < rear; i++) {
                arrayqueue[i] = arrayqueue[i + 1];
            }
            arrayqueue[rear] = 0;
            rear--;
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
    public boolean IsFull(){
        if(rear == arrayqueue.length - 1){
            System.out.println("Array is full");
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
