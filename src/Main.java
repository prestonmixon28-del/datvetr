public class Main {
    public static void main(String[] args) {
        BinarySearchTree<Integer> archive =
                new BinarySearchTree<>();

        int[] sampleIds = {50, 25, 75, 10, 30, 60, 85};

        for (int id : sampleIds) {
            archive.add(id);
        }

        System.out.println(
                "Archive initialized with sample IDs.");

                System.out.println("Height of the archive: " + archive.height());
        System.out.print("In-order traversal: ");
        archive.inOrderTraversal();
        System.out.print("Pre-order traversal: ");
        archive.preOrderTraversal();
    
    System.out.println("\n--- Empty Tree Test ---");
BinarySearchTree<Integer> emptyTree = new BinarySearchTree<>();
System.out.println("Empty tree height: " + emptyTree.height());
System.out.print("Empty inorder: ");
emptyTree.inOrderTraversal();

System.out.println("\n--- Single Node Test ---");
BinarySearchTree<Integer> singleTree = new BinarySearchTree<>();
singleTree.add(50);
System.out.println("Single node height: " + singleTree.height());

System.out.println("\n--- Skewed Tree Test ---");
BinarySearchTree<Integer> skewedTree = new BinarySearchTree<>();
skewedTree.add(10);
skewedTree.add(20);
skewedTree.add(30);
skewedTree.add(40);

System.out.println("Skewed tree height: " + skewedTree.height());
System.out.print("Inorder: ");
skewedTree.inOrderTraversal();
System.out.print("Preorder: ");
skewedTree.preOrderTraversal();
}
}