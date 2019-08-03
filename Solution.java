package canessa.tree.ops;

import java.util.Scanner;

/*
 * Test scaffolding. 
 */
public class Solution {
	
	/*
	 * This code includes several algorithms using binary trees.
	 */
	public static void main(String[] args) {

		// **** open scanner ****
		Scanner sc = new Scanner(System.in);
		
		// **** allocate nodes for the BST ****
		Node n1 = new Node(27);
		Node n2 = new Node(13);
		Node n3 = new Node(30);
		Node n4 = new Node(26);
		
		Node n5 = new Node(56);
		Node n6 = new Node(40);
		Node n7	= new Node(65);
		Node n8	= new Node(70);
		
		// **** build the binary tree ****
		BinaryTree tree = new BinaryTree(38);
		Node root 		= tree.getRoot();
		
		tree.add(root, n1, ChildLocation.LEFT);
		tree.add(root, n5, ChildLocation.RIGHT);
		
		tree.add(n1, n2, ChildLocation.LEFT);
		tree.add(n1, n3, ChildLocation.RIGHT);
		
		tree.add(n2, n4, ChildLocation.RIGHT);
		
		tree.add(n5, n6, ChildLocation.LEFT);
		tree.add(n5, n7, ChildLocation.RIGHT);
		
		tree.add(n7, n8, ChildLocation.RIGHT);
		
		
/*		
		// **** ****
		int[] values = {1, 2, 3, 4};
		System.out.println("main <<< values.length: " + values.length);

		// **** build the binary tree as illustrated here ****
		BinaryTree tree = new BinaryTree(10);
		Node root 		= tree.getRoot();
		
		tree.add(root, n1, ChildLocation.LEFT);
		tree.add(root, n2, ChildLocation.RIGHT);
		
		tree.add(n1, n3, ChildLocation.LEFT);
		tree.add(n1, n4, ChildLocation.RIGHT);
		
		tree.add(n2, n5, ChildLocation.LEFT);
		tree.add(n2, n6, ChildLocation.RIGHT);
		
		tree.add(n4, n7, ChildLocation.LEFT);
		
		tree.add(n6, n8, ChildLocation.RIGHT);
*/
		
		
		// **** depth first - preorder (root comes first) ****
		System.out.println("main <<< pre order:");
		tree.preOrder(root);
		
		// **** depth first - inorder (root is middle) ****
		System.out.println("\nmain <<< in order:");
		tree.inOrder(root);

		// **** depth first - inorder (using stack) ****
		System.out.println("\nmain <<< DFSInOrder:");
		tree.DFSInOrder(root);
		
		// **** depth first - postorder (root is last) ****
		System.out.println("\nmain <<< post order:");
		tree.postOrder(root);
		
		// **** depth first - postorder (using stack)
		System.out.println("\nmain <<< DFSPostOrder:");
		tree.DFSPostOrder(root);

		// **** breadth first using queue ****
		System.out.println("\nmain <<< BFS:");
		tree.BFS(root);
		
		// **** mystery order ****
		System.out.println("\nmain <<< MysteryOrder:");
		tree.MysteryOrder(root);
		System.out.println();
		
		
		// **** search for the specified value ****
		int value = 0;
		do {

			// **** prompt for the value to search for ****
			System.out.print(">>> value [-1 to exit]: ");
			value = sc.nextInt();
			
			// **** search for the specified value (if needed) ****
			if (value >= 0) {
				boolean found = tree.search(root, value);
				System.out.println("main <<< value: " + value + " found: " + found);
			}
		} while (value >= 0);
		
		// **** close scanner ****
		sc.close();
	}

}
