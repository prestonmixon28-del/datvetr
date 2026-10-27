# Journal
I created the tree classes and added the accession IDS. The add method uses comparisons to put smaller numbers on the left and larger numbers on the right.

I added a height method to find the deepest level of the tree. It checks the left and right sides and returns the larger height

I added inorder and preorder traversals to print the IDS in different orders. Inorder prints the IDS in sorted order because smaller values are on the left and larger values are on the right.

I tested empty, single node, and skewed trees. The tree had -1, and the single-node tree had a height of 0. The sorted numbers created a skewed tree with a height of 3, showing that inserting sorted data can make a tree less balenced.