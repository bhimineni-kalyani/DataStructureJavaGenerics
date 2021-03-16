public class DataStructureJavaGenerics<T> {

    class Node<T> {
        T data;
        Node<T> Next;

        public Node(T data) {
            this.data=data;
            this.Next=null;
        }
    }

    public Node<T> head=null;
    public Node<T> tail=null;

    public void addNode(T data) {
        Node<T> newNode=new Node<T>(data);
        if (head==null) {
            head=newNode;
            tail=newNode;
        }
        else
            tail.Next=newNode;
            tail=newNode;
     }

    public void addAtStart(T data) {
        Node<T> newNode = new Node<T>(data);
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

    public void addAtEnd(T data) {
        Node<T> newNode = new Node<T>(data);
        if(head == null) {
            head = newNode;
            tail = newNode;
        }
        else {
            tail.Next = newNode;
            tail = newNode;
        }
    }

    public Node addAtmiddle(T data, int position){
        Node<T> newnode = new Node<T>(data);
        newnode.data = data;
        Node<T> cur = head;
        Node<T> prev = null;
        int count=0;
        while (count < position) {
            prev = cur;
            cur = cur.Next;
            count++;
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

    public void searchNode(T data) {
        Node<T> current = head;
        int i = 1;
        boolean flag = false;
        if(head == null) {
            System.out.println("List is empty");
        }
        else {
            while(current != null) {
                if(current.data == data) {
                    flag = true;
                    break;
                }
                i++;
                current = current.Next;
            }
        }
        if(flag)
            System.out.println("Element " +data+ " is present in the list at the position : " + i);
        else
            System.out.println("Element is not present in the list");
    }

    public void insertAfterNode(Node<T> previous, T data) {
        if(previous == null) {
            System.out.println("Previous node cannot be empty");
            return;
        }
        Node newnode=new Node(data);
        newnode.Next=previous.Next;
        previous.Next=newnode;
    }

    public void displayList() {
        Node<T> current=head;
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
        list.displayList();

        list.insertAfterNode(30,40);
    }
}
