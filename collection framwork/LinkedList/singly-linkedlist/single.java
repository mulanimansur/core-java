public class single {

    // Step 1: Create Node class
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

     Node head;

    // Step 2: Insert at End
    public void insertAtEnd(int data) {

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

    // Step 3: Insert at Beginning
    public void insertAtBeginning(int data) {

        Node newNode = new Node(data);

        newNode.next = head;
        head = newNode;
    }

    // Step 4: Delete by Value
    public void deleteByValue(int value) {

        if (head == null) {
            return;
        }

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

    // Step 5: Display Linked List
    public void display() {

        Node current = head;

        while (current != null) {

            System.out.print(current.data + " -> ");

            current = current.next;
        }

        System.out.println("null");
    }

    // Step 6: Main Method
    public static void main(String[] args) {

        single list = new single();

        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);

        list.insertAtBeginning(5);

        System.out.println("Original Linked List:");
        list.display();

        list.deleteByValue(20);

        System.out.println("After Deletion:");
        list.display();
    }
}