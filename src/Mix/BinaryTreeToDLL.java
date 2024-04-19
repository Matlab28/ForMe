package Mix;
public class BinaryTreeToDLL {

    public static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public Node root;
    Node head, tail = null;

    public void convertbtToDLL(Node node) {
        if (node == null)
            return;
        convertbtToDLL(node.left);
        if (head == null) {
            head = tail = node;
        }
        else {
            tail.right =node;
            node.left = tail;
            tail = node;
        }
        convertbtToDLL(node.right);
    }
    public void display() {
        Node current = head;
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        System.out.println("Nodes of generated doubly linked list: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.right;
        }
        System.out.println();
    }
}
