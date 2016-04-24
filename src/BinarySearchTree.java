public class BinarySearchTree<T extends Comparable<? super T>> {
 protected TreeNode<T> root;        // root of tree
 protected int size;                // size of tree
 protected enum PrePostIn {PREORDER, POSTORDER, INORDER};
 
 // Constructor
 // Initialize variables – root is null and size is 0.
 public BinarySearchTree( );
 
 // Constructor that builds a tree from the values in sorted List L.
 // Initialize variables – root is null and size is 0 - and call 
 // recursive method buildTree() if L.size() > 0.
 // Throws IllegalArgumentException if L is null or any element in L is 
 // null.
 public BinarySearchTree(List<T> L);
    
 // Builds a balanced tree from the values in sorted List L.
 // Start and end are the start and end positions of a sub-list of L.
 // Returns the root of the subtree containing the elements in the 
 // sub-list of L.
 // Throws IllegalArgumentException if L or any element in L is null.
 // Called by BinarySearchTree(List<T> L) and balance().
 // This is a recursive method.
protected TreeNode<T> buildTree(int start, int end, List<T> L);
 
 // If x is not already in the tree, inserts x and returns true.
 // If x is already in the tree, does not insert x and returns false.
 // Sets the new nodes left, right, and parent references. 
 // Throws IllegalArgumentException if x is null.
 // This is a non-recursive method.
 public boolean insert(T x);
 
 // Removes x from the tree.
 // Return true if x is removed; otherwise, return false;
// Throws IllegalArgumentException if x is null.
 // This is a non-recursive method.
 public boolean remove( T x);
 
 // Returns an element in the list that equals x, or null if there is no 
 // such element.
 // Throws IllegalArgumentException if x is null.
 // May call method search.
 // This is a non-recursive method.
 public T getMatch(T x);
 
 // Returns true if there is an element in the list that equals x.
 // Throws IllegalArgumentException if x is null.
 // May call method search.
 // This is a non-recursive method.
 public boolean contains(T x);
 
 // Return a reference to the node that contains an element that equals 
 // x or null if there is no such node.
 // Any method that calls this method should ensure that x is not null.
 // This is a non-recursive method.
 protected TreeNode<T> search(T x);
 
 // Returns a reference to the node that contains the minimum element in 
 // the subtree rooted at node n.
 // Called by method next(); method next() should ensure that node n is 
 // not null.
 // This is a non-recursive method.
 protected TreeNode<T> getMinNode(TreeNode<T> n);
 
 // Returns a reference to the node that contains the minimum element in 
 // the subtree rooted at node n; the found node is also removed from the 
 // tree. Note the n may be the node containing the minimum element. 
 // Any method that calls this method should ensure that n is not null
 //   and that n is not the root.
 // This is a non-recursive method.
 protected TreeNode<T> getAndRemoveMinNode(TreeNode<T> n);
   
 // Returns the node that is the node after node n in sorted order,
 // as determined by an inorder traversal of the tree. The next node is 
 // node with the smallest data element greater than n.data.
 // May be called by remove().
 // This is a non-recursive method.
 protected TreeNode<T> next(TreeNode<T> n);
 
 // Returns the node that is the node before n in sorted order, as
 // determined by an inorder traversal of the tree. The previous node is 
 // node with the largest data element smaller than n.data.
 // Methods next() and previous() are symmetric.
 // This is a non-recursive method.
 protected TreeNode<T> previous(TreeNode<T> n);
 
 // Returns the number of elements in the tree
 // Target Complexity: O(1)
 public int size();
 
 // Returns true if there are no elements.
 // Target Complexity: O(1)
 public boolean isEmpty();
 
 // Make the tree logically empty.
 // Target Complexity: O(1)
 public void clear();
 
 // Convenience method that returns a List of elements in sorted order.  
 // Calls getListOfElements(PrePostIn.INORDER);
 public List<T> getSortedListOfElements();
 
 // Returns a List of elements in the order specified by parameter order, 
 // which is either PREORDER, POSTORDER, or INORDER.
 // Calls fillListOfElements(root,order)
 public List<T> getListOfElements(PrePostIn order);
 
 // Returns a List of elements in the order specified by parameter order, 
 // which is either PREORDER, POSTORDER, or INORDER.
 // This is a non-recursive method.
 // Target Complexity: O(n)
 protected List<T> fillListOfElements(TreeNode<T> node, PrePostIn order);
 
 // Balances the tree.
 // Calls buildTree(int start, int end, List<T> L) where L is a sorted 
 // List of the elements in the tree, and start and end are the positions 
 // at the beginning and end of L.
 public void balance();
 
 // Helper middle to compute the middle position of a sub-list
 protected int middle(int start, int end) {return (start + end) / 2;}