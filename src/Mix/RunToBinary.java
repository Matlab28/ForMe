package Mix;

import org.w3c.dom.Node;

public class RunToBinary {
    public static void main(String[] args) {

        BinaryTreeToDLL bt = new BinaryTreeToDLL();

        bt.root = new BinaryTreeToDLL.Node(4);
        bt.root.left = new BinaryTreeToDLL.Node(2);
        bt.root.right = new BinaryTreeToDLL.Node(5);
        bt.root.left.left = new BinaryTreeToDLL.Node(1);
        bt.root.left.right = new BinaryTreeToDLL.Node(6);
        bt.root.right.left = new BinaryTreeToDLL.Node(3);
        bt.root.right.right = new BinaryTreeToDLL.Node(7);

        bt.convertbtToDLL(bt.root);
        bt.display();

    }
}
