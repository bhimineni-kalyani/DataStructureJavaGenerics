public class DataStructureJavaGenerics {

    class Node {
        int data;
        Node Next;

        public Node(int data){
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

    public void addAtEnd(int data) { 
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            tail = newNode;
        }
        else {
            tail.Next = newNode;
            tail = newNode;
        }
    }

    public Node addAtmiddle(int data, int position) {
        Node newnode = new Node(data);
        newnode.data = data;
        Node cur = head;
        Node prev = null;
        int i = 0;
        while (i < position) {
            prev = cur;
            cur = cur.Next;
            i++;
        }
        newnode.Next = cur;
        if (prev != null) {
            prev.Next = newnode;
            return head;
        }
        return newnode;
    }

    public void deleteFirstElement() {
        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        else {
            if(head != tail) {
                head = head.Next;
            }
            else {
                head = tail = null;
            }
        }
    }

    public void deleteLastElement() { 
        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        else {
            if(head != tail ) {
                Node current = head;
                while(current.Next != tail) {
                    current = current.Next;
                }
                tail = current;
                tail.Next = null;
            }
            else {
                head = tail = null;
            }
        }
    }

    public void displayList() { 
        Node current=head;
        if (head==null){
            System.out.println("list is empty");
        }
        else {
            System.out.println("single linked list: ");
            while (current != null) {
                System.out.println(current.data + "");
                current = current.Next;
            }
        }
    }

    public static void main(String[] args) {
        DataStructureJavaGenerics list = new DataStructureJavaGenerics();

        list.addNode(56);
        list.addNode(30);
        list.addNode(70);
        list.deleteLastElement();

        list.displayList();
    }
}
