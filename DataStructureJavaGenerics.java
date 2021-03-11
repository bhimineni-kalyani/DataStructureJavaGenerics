public class DataStructureJavaGenerics {

    class Node {
        int data;
        Node Next;

        public Node(int data) {
            this.data=data;
            this.Next=null;
        }
    }

    public Node head=null;
    public Node tail=null;

    public void addNode(int data) { 
        Node newNode=new Node(data);
        if (head==null) {
            head=newNode;
            tail=newNode;
        }
        else
            tail.Next=newNode;
            tail=newNode;
    }

    public void addAtStart(int data) { 
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            tail = newNode;
        }
        else {
            Node temp = head;
            head = newNode;
            head.Next = temp;
        }
    }

    public void displayList() { 
        Node current=head;
        if (head==null) {
            System.out.println("list is empty");
        }
        else {
            System.out.println("singly linked list: ");
            while (current != null) {
                System.out.println(current.data + "");
                current = current.Next;
            }
        }
    }

    public static void main(String[] args) {
        DataStructureJavaGenerics list=new DataStructureJavaGenerics();

        list.addAtStart(70);
        list.addAtStart(30);
        list.addAtStart(56);

        list.displayList();
    }
}
