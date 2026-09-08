
package activity5;

public class linkyList {

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    // Insert at the end//
    public void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;

        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
    }

    // Insert at the beginning//
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);

        newNode.next = head;
        head = newNode;
    }

    // Search for a value//
    public boolean search(int value) {
        Node current = head;

        while (current != null) {
            if (current.data == value) {
                return true;
            }

            current = current.next;
        }

        return false;
    }

    // Delete a value//
    public void delete(int value) {

        if (head == null) {
            return;
        }

        // If the value is in the first node//
        if (head.data == value) {
            head = head.next;
            return;
        }

        Node current = head;

        while (current.next != null) {

            if (current.next.data == value) {
                current.next = current.next.next;
                return;
            }

            current = current.next;
        }
    }

    // Display the linked list//
    public void display() {
        Node current = head;

        while (current != null) {
            System.out.print(current.data);

            if (current.next != null) {
                System.out.print(" -> ");
            }

            current = current.next;
        }

        System.out.println(" -> null");
    }
}

