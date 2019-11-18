package lesson32;

import java.util.Stack;

class Node {
    int iData;
    double dData;
    Node leftChild;
    Node rightChild;
}

class Tree {
    private Node root;

    Tree() {
        root = null;
    }

    void insert(int id, double dd) {
        Node newNode = new Node();
        newNode.iData = id;
        newNode.dData = dd;
        if (root == null)
            root = newNode;
        else {
            Node current = root;
            Node parent;
            while (true) {
                parent = current;
                if (id < current.iData) {
                    current = current.leftChild;
                    if (current == null) {
                        parent.leftChild = newNode;
                        return;
                    }
                } else {
                    current = current.rightChild;
                    if (current == null) {
                        parent.rightChild = newNode;
                        return;
                    }
                }
            }
        }
    }

    void displayTree() {
        Stack<Node> globalStack = new Stack<>();
        globalStack.push(root);
        int nBlanks = 32;
        boolean isRowEmpty = false;
        while (!isRowEmpty) {
            Stack<Node> localStack = new Stack<>();
            isRowEmpty = true;

            for (int j = 0; j < nBlanks; j++)
                System.out.print(' ');
            while (!globalStack.isEmpty()) {
                Node temp = globalStack.pop();
                if (temp != null) {
                    System.out.print(temp.iData);
                    localStack.push(temp.leftChild);
                    localStack.push(temp.rightChild);

                    if (temp.leftChild != null || temp.rightChild != null)
                        isRowEmpty = false;
                } else {
                    System.out.print("--");
                    localStack.push(null);
                    localStack.push(null);
                }
                for (int j = 0; j < nBlanks * 2 - 2; j++)
                    System.out.print(' ');
            }
            System.out.println();
            nBlanks /= 2;
            while (!localStack.isEmpty())
                globalStack.push(localStack.pop());
        }
    }

    void countNode() {
        Stack<Node> globalStack = new Stack<>();
        globalStack.push(root);
        int count = 0;
        System.out.print("Листовые узлы в бинарном дереве: ");
        while (!globalStack.empty()) {
            root = globalStack.pop();
            if (root.leftChild != null) {
                globalStack.push(root.leftChild);
            }
            if (root.rightChild != null) {
                globalStack.push(root.rightChild);
            }
            if (root.leftChild == null && root.rightChild == null) {
                System.out.print(root.iData + " ");
                count++;
            }
        }
        System.out.print("\nВсего: " + count);
    }
}

class TreeApp {
    public static void main(String[] args) {
        Tree theTree = new Tree();

        theTree.insert(50, 1.5);
        theTree.insert(25, 1.2);
        theTree.insert(75, 1.7);
        theTree.insert(12, 1.5);
        theTree.insert(37, 1.2);
        theTree.insert(43, 1.7);
        theTree.insert(30, 1.5);
        theTree.insert(33, 1.2);
        theTree.insert(87, 1.7);
        theTree.insert(93, 1.5);
        theTree.insert(97, 1.5);

        theTree.insert(17, 1.5);
        theTree.insert(21, 1.2);
        theTree.insert(28, 1.7);
        theTree.insert(36, 1.5);
        theTree.insert(68, 1.5);
        theTree.insert(57, 1.5);

        theTree.displayTree();
        theTree.countNode();
    }
}