import java.util.Stack;

public class BinaryTree 
{
	Node	root=null;
	
	public static void main(String args[])
	{
		BinaryTree tree = new BinaryTree();
		int[] nums = {7,4,8,3,9,1,2};
		
		for (int n : nums) 
			tree.add(n);
		
		tree.printInOrderWalk(tree.root);
		// tree.printNonRecursiveInOrderWalk(tree.root);
	}
	
	/**
	 * Add 'value' to the current tree.
	 * 
	 * @param value	The value to add to the tree.
	 */
	public void add(int value)
	{
		Node n = new Node(value);
		if (root == null) 
		{
			root = n;
			return;
		}		
		addNode(root,n);
	}
	
	/**
	 * Prints an in order walk of the tree (left node right) such that
	 * values added to the tree should be printedout in numeric order.
	 * 
	 * 
	 * @param n	The node to print the in order walk from
	 */
	private void printInOrderWalk(Node n)
	{
		if (n == null) return;		// The terminating condition!
		
		printInOrderWalk(n.left);
		System.out.println(n.value);
		printInOrderWalk(n.right);
	}
	
	/**
	 * This code should print out an in order walk of the tree but
	 * should not use recursion.
	 * 
	 * @param tree	The tree to perform the in order walk on.
	 */
	private void printNonRecursiveInOrderWalk(Node tree)
	{
		Stack<Node> stack = new Stack<Node>();
		Node n=tree;
				
		while (n!=null || !stack.isEmpty())
		{
			// Implement the code for an in order tree walk here.
			// This should traverse the tree linked to by root 
			// in the order of left node, node (print the value), right
			// See printInOrderWalk for the logic but don't use 
			// any recursion to achieve this (you may want to use the 
			// the debugger to watch what your implementation is doing).
			
			// stack.push(x)
			// x = stack.pop()
			// stack.isEmpty()
		}
	}
	
	/**
	 * Recursively adds a node to a binary tree ensuring values that are 
	 * less than the current node are inserted to the left and values greater
	 * than the current node are inserted to the right.
	 * 
	 * @param parent	The current node to compare our new node with
	 * @param node		The node to be inserted
	 */
	private void addNode(Node parent, Node node)
	{
		if (node.value < parent.value)
		{
			if (parent.left == null)
				parent.left = node;
			else
				addNode(parent.left,node);				
		}
		else
		{
			if (parent.right == null)
				parent.right = node;
			else
				addNode(parent.right,node);
		}
	}
	
	/**
	 * Internal class declaration for Node that is used only by BinaryTree.
	 * 
	 */
	public class Node 
	{
		int		value;		// The value associated with the node
		Node	left,right;	// The node's left and right branches
		
		public Node(int v) 
		{
			value = v;
			left = null;
			right = null;
		}
	}
}
