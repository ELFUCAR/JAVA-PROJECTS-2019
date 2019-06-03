package linkedlist;
 public class LinkedList {
    
     public Node head;              // head of list  
    public class Node              // the constructor
    {
        public int data;
        public int coef;
        public Node next;
        public Node(int d)
        {
            data = d;
            next = null;
        }
    }
    //----------------------------------------------
    
     public void AddFirst(int new_data) //adding a node in a front of a list
    {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    public Node GetLastNode()
    {
        Node temp = head;
        while (temp.next != null)
        {
            temp = temp.next;
        }
        return temp;
    }

    
    public void PrintList() // prints out all nodes of a list
    {
        Node n = head;
        while (n != null)
        {
            System.out.println(n.data + " ");
            n = n.next;
        }
        System.out.println();
    }
    
    //--------------------------------------------------
    

    public void ReverseLinkedList()
    {
        Node prev = null;
        Node current = head;
        Node temp = null;
        while (current != null)
        {
            temp = current.next;
            current.next = prev;
            prev = current;
            current = temp;
        }
        head = prev;
    }
    
    
    //**********************************
    
   public static void main(String [] args) {
       
       int[] a;
        LinkedList lst = new LinkedList();

        lst.AddFirst(1);
        lst.AddFirst(3);
        lst.AddFirst(5);
        lst.AddFirst(50);
        lst.AddFirst(100);
    
        lst.PrintList();
          System.out.println("---------------------");
       
         Node last=lst.GetLastNode();
         System.out.println("First element is : " + lst.head.data);
         System.out.println("Last element is : " + last.data);
         
           System.out.println("Now we reverse the list\n-------------------");
         lst.ReverseLinkedList();
         lst.PrintList();
         System.out.println("---------------------");
         last=lst.GetLastNode();
         System.out.println("First element is : " + lst.head.data);
         System.out.println("Last element is : " + last.data);

    
   }
 }