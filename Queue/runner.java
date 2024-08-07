package Queue;

public class runner {
    public static void main(String[] args) {
        queue q = new queue();
        q.enQueue(5);
        q.enQueue(2);
        q.enQueue(7);
        q.enQueue(3);

//        q.dequeue();
//        q.dequeue();
//        
        q.enQueue(9);
        q.enQueue(1);
//          
       // q.enQueue(19);
        //q.enQueue(13 );
        System.out.println(q.isFull());
        
        System.out.println("size "+ q.getSize());
        q.show();
    }
}