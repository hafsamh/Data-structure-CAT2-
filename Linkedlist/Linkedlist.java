
package Linkedlist;

 
public class Linkedlist {
    
    node head;
  
    public void insert(int data)
    {       node node = new node();
            node.data=data;
            node.next = null;
            
            if (head==null)
            { 
                head = node;
            }
            else
            {
                node n = head;
                while(n.next!=null)
                {
                    n = n .next;
                }
                n.next = node;
            }
            
    }
    public void insertAtStart(int data)
    {
          node node = new node();
            node.data=data;
            node.next = null; 
            node.next = head;
            head = node;
    }
    public void insertAt(int index,int data)
    {
           node node = new node();
            node.data=data;
            node.next = null;
            
            if(index==0)
            {
                insertAtStart(data);
            }
            else{
            node n = head;
            for( int i=0;i<index-1;i++)
            {
                n = n.next;
            }
          /*  n.next = node.next; */
            node.next = n.next;
            n.next = node; 
            }
    }
    
    public void deleteAt(int index )
    {
        if(index==0)
        {
            head = head.next;
        }
        else
        {
             node n = head;
             node n1 = null;
            for( int i=0;i<index-1;i++)
            {
                n = n.next;
            }
            n1 = n.next;
            n.next = n1.next;
           // we can delete a value just by using delete methos
           //System.out.println("n1" + n1.data);
           n1 = null;
        }
    }
    
    public void show()
    {
            node node = head;
    while (node.next!=null)
    {
   System.out.println(node.data);
        node = node.next;
    
    }
    System.out.println(node.data);
    
    
    }
}
