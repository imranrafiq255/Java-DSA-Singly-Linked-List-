import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        SinglyLinkedList s1 = new SinglyLinkedList();
        s1.insertNodeAtTail(10);
        s1.insertNodeAtTail(20);
        s1.insertNodeAtTail(30);
        s1.insertNodeAtTail(40);
        s1.insertAtMiddle(5);
        s1.deleteFromMiddle();
        s1.Display();
        s1.callingReversePrint();

        s1.callingMergeTwoLinkedLists();
    }
}