
package Binarysearchtree;


public class runner {
      public static void main(String[] args) {
        binarysearchtree theTree = new binarysearchtree();
        theTree.addNode(50, "Boss");
        theTree.addNode(25, "Vice President");
        theTree.addNode(15, "Office Manager");
        theTree.addNode(30, "Secretary");
        theTree.addNode(75, "Sales Manager");
        theTree.addNode(85, "Salesman 1");

        System.out.println("\nNode with the key 75");
        System.out.println(theTree.findNode(75));

        System.out.println("\nIn-order traversal:");
        theTree.inOrderTraverseTree(theTree.root);

        System.out.println("\nPre-order traversal:");
        theTree.preorderTraverseTree(theTree.root);

        System.out.println("\nPost-order traversal:");
        theTree.postOrderTraverseTree(theTree.root);
    }
}
