package fpplesson10;
import java.util.ArrayList;
import java.util.Iterator;

// Demo code for the user implemenation of Binary search tree
public class MyBST {
	/** The tree root. */
	private BinaryNode root;

	public MyBST() {
		root = null;
	}
	ArrayList<Integer> node = new ArrayList<Integer>();
	ArrayList<Integer> postnode = new ArrayList<Integer>();
	int size = 0;
	
	/**
	* Prints the values in the nodes of the tree
	* in sorted order. Inorder Traversal
	*/
	public void printTree() {
		if( root == null )
			System.out.println( "Empty tree" );
		else
			printTree(root);
	}
	// Inorder Traversal to print the nodes in Ascending order
	private void printTree( BinaryNode t ){
		if( t != null ){
			printTree( t.left );
		    System.out.print(t.element+",");
		    printTree( t.right );
		} 
	}
	
	//Assume the data in the Node is an Integer.
	public void preOrder() {
		preOrder(root);
	}
	
	// Inorder Traversal to print the nodes in Ascending order
		private void preOrder(BinaryNode t ){
			if( t != null ){
				System.out.print(t.element+",");
				preOrder( t.left );
			    preOrder( t.right );
			} 
		}
		
		
		public void postOrder( ) {
			postOrder(root);
		}
		
		
		public void postOrder (BinaryNode t) {
			if (t !=null)
			{
				postOrder(t.left);
				postOrder(t.right);
				System.out.print(t.element + ",");
			}
		}

		
		
		public Boolean contains(Integer key) {
			if (root == null)
				return false;
			if (root.element != key)
				return contains(root, key);
			return true;
		}

		private Boolean contains(BinaryNode binaryNode, Integer key) {
			if (binaryNode.left == null && binaryNode.right == null) {
				if (binaryNode.element == key)
					return true;
				return false;
			}
			if (key == binaryNode.element) {
				return true;
			} else if (key < binaryNode.element) {
				return contains(binaryNode.left, key);
			}
			return contains(binaryNode.right, key);
			
			
		}
		
		public Integer leafNodes(){
		 
			return leafNodes(root);
		} 
		
		
		
		private int leafNodes(BinaryNode root){
			if (root.left == null && root.right == null)  return 1;
			return leafNodes(root.left) + leafNodes(root.right);
			
		}
		
		
		public Integer getRoot()
		{
			return root.element;
			
		}
		


	
 
	//Assume the data in the Node is an Integer.	

	public void insert(Integer x) {
	
		if (root == null) {
			root = new BinaryNode(x);
			++size;
			return;
		}
		else { 
			BinaryNode n = root;
			boolean inserted = false;

			while(!inserted)//true
				{
				if(x.compareTo(n.element)<0) {
					//space found on the left
					if(n.left == null){
						n.left = new BinaryNode(x,null,null);
						++size;
						inserted = true;
					}
					//keep looking for a place to insert (a null)
					else {
						n = n.left;
					}
				}				
				else if(x.compareTo(n.element)>0){ 
					//space found on the right					
					if(n.right==null){
					n.right = new BinaryNode(x,null,null);
					++size;
					inserted = true;
					}
						//keep looking for a place to insert (a null)
					else {
							n = n.right;
					}
										
				}
				// if a node already exists
				else {
					inserted = true;
				}

			}

		}
	}
	
		public int size()
		{
			return size;
		}

		
		public boolean isEmpty()
		{ 
			if (root.element == null)
				return true;
			else return false;
		}
		
		
		public Integer findMin(){
			 return findMin(root);
		}
		
		private Integer findMin(BinaryNode root)
		{
			if (root == null) return null;
			while (root.left != null)
			{
				root = root.left; 
			}
			return root.element;
		}
	
		public Integer findMax() {
			return findMax(root);
		} 
		
		private Integer findMax(BinaryNode root){
			if (root == null) return null;
			while (root.right != null)
			{
				root = root.right;
			}
			return root.element;
		}
		
	private class BinaryNode {

		private Integer element;// The data in the node
		private BinaryNode left;      // Left child
		private BinaryNode right;     // Right child	  
		// Constructors 
		
		BinaryNode( Integer theElement ){
			this( theElement, null, null );
		}	

		BinaryNode( Integer element, BinaryNode left, BinaryNode right ){
			this.element = element;
			this.left = left;
			this.right = right;
		}
		
	}
		


	public static void main(String[] args) {
		
		MyBST mybst = new MyBST();
		
		int [] a = {15, 12, 9, 56, 1, 16, 19, 22, 3, 100, 2, 25};
	
		for (int j = 0; j < a.length; j++ ) {
			mybst.insert(a[j]);
					
		}
	
		
		mybst.preOrder();
		System.out.println();
		mybst.postOrder();
		System.out.println();
		System.out.println(mybst.getRoot());
		System.out.println();
		System.out.println(mybst.leafNodes());
		System.out.println();
		System.out.println(mybst.contains(9));
		System.out.println();
		System.out.println(mybst.size());
		System.out.println();
		System.out.println(mybst.isEmpty());
		System.out.println();
		System.out.println(mybst.findMin());
		System.out.println();
		System.out.println(mybst.findMax());
		
	
	
	
	
	
	}
}
