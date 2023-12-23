public class SinglyLinkedList
{
    private static class Node{
        private int data;
        private Node next;
        Node()
        {
            data = 0;
            next = null;
        }
    }
    private Node head;
    SinglyLinkedList()
    {
        this.head = null;
    }
    public void insertNodeAtTail(int data)
    {
        Node n1 = new Node();
        n1.data = data;
        if(head == null)
        {
            head = n1;
            return;
        }
        Node temp = head;
        while (temp.next != null)
        {
            temp = temp.next;
        }
        temp.next = n1;
    }
    public void insertAtMiddle(int data)
    {
        Node n = new Node();
        n.data = data;
        if (head == null)
        {
           head = n;
           return;
        }
        if (head.next == null)
        {
            Node temp = head;
            temp.next = n;
            return;
        }
        Node temp = head;
        int count = 0;
        while(temp != null)
        {
            count++;
            temp = temp.next;
        }
        int mid = count / 2;
        int counter = 0;
        Node temp2 = head;
        Node prev = head;
        while(temp2 != null)
        {
            if (counter == mid)
            {

                prev.next = n;
                n.next = temp2;
                return;
            }
            counter++;
            prev = temp2;
            temp2 = temp2.next;
        }
    }

    public void deleteFromMiddle()
    {
        if (head == null)
        {
            System.out.println("You can't delete anything because List is empty...");
            return;
        }
        else if (head.next == null)
        {
            Node temp = head;
            head = head.next;
            temp = null;
            System.gc();
        }
        Node temp = head;
        int count = 0;
        while(temp != null) {
            count++;
            temp = temp.next;
        }
        int mid = count/2;
        int counter = 0;
        Node temp2 = head;
        Node prev = head;
        while(temp2 != null)
        {
            if (counter == mid)
            {
                prev.next = temp2.next;
                temp2 = null;
                System.gc();
                return;
            }
            prev = temp2;
            counter++;
            temp2 = temp2.next;
        }
    }
    private void mergeTwoLinkedLists() {
        Node n1;
        Node n2;
        Node node1 = new Node();
        node1.data = 1;
        Node node2 = new Node();
        node2.data = 2;
        Node node3 = new Node();
        node3.data = 3;
        Node node4 = new Node();
        node4.data = 4;
        Node node5 = new Node();
        node5.data = 5;
        n1 = node1;
        n1.next = node2;
        n2 = node3;
        n2.next = node4;
        n2.next.next = node5;

        Node temp1 = n1;
        Node temp2 = n2;
        Node finalList = null;
        Node tail = null;

        while (temp1 != null && temp2 != null) {
            if (temp1.data < temp2.data) {
                if (finalList == null) {
                    finalList = temp1;
                    tail = temp1;
                } else {
                    tail.next = temp1;
                    tail = tail.next;
                }
                temp1 = temp1.next;
            } else {
                if (finalList == null) {
                    finalList = temp2;
                    tail = temp2;
                } else {
                    tail.next = temp2;
                    tail = tail.next;
                }
                temp2 = temp2.next;
            }
        }

        if (temp1 != null) {
            tail.next = temp1;
        } else if (temp2 != null) {
            tail.next = temp2;
        }

        Node tempFinal = finalList;
        while (tempFinal != null) {
            System.out.print(tempFinal.data + " ");
            tempFinal = tempFinal.next;
        }
        System.out.println();
    }

    public void callingMergeTwoLinkedLists()
    {
        mergeTwoLinkedLists();
    }
    public void Display()
    {
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data);
            System.out.print(" ");
            temp = temp.next;
        }
        System.out.println();
    }
    private void reversePrint(Node n)
    {
        if (n == null)
        {
            return;
        }
        reversePrint(n.next);
        System.out.print(n.data);
        System.out.print(" ");
    }
    public void callingReversePrint()
    {
        reversePrint(head);
        System.out.println();
    }
}
