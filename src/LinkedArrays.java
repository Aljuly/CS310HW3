public class LinkedArrays<T> {
  protected int size;                 // number of elements
  protected int nodeCount;            // number of LinkedArrayNodes
  protected final int lengthOfArrays; // value initialized in constructor
  protected static final int DEFAULTLENGTHOFARRAYS = 16;
  protected LinkedArrayNode<T> head;        // dummy nodes head and tail
  protected LinkedArrayNode<T> tail;
 
  // Workhorse constructor that initializes variables.
  // Throws IllegalArgumentException if lengthOfArray < 0.
  public LinkedArrays (int lengthOfArrays) throws IllegalArgumentException {
	  if (lengthOfArrays < 0) {
		  throw new IllegalArgumentException("Exception! Length Of Arrays less then 0!: " + lengthOfArrays); 
	  } else {
		  this.lengthOfArrays = lengthOfArrays;
		  this.nodeCount = 0;
		  this.size = 0;
		  this.head = null;
		  this.tail = null;
	  }
  }
 
  // Convenience constructor. Calls the workhorse constructor with 
  // DEFAULTLENGTHOFARRAYS as the argument.
  public LinkedArrays() {
	  this(DEFAULTLENGTHOFARRAYS);
  }
 
  // Make this LinkedArrays logically empty.
  // Target Complexity: O(1)
  // Implementation note: It is not necessary to remove() all of the 
  // elements; instead, some data members can be reinitialized.
  // Target Complexity: O(1)
  public void clear(){
	  this.head = null;
	  this.tail = null;
  }
 
  // Returns the number of elements
  // Target Complexity: O(1)
  public int size() {
	  return (int) size;
  }
 
  // Returns the number of LinkedArrayNodes.
  // Target Complexity: O(1)
  public int nodeCount() {
	  return (int) nodeCount;
  }
 
  // Returns true if there are no elements in this LinkedArrays
  // Target Complexity: O(1)
  public boolean isEmpty() {
	  if (nodeCount == 0) {
		  return (boolean) true;
	  } else {
		  return (boolean) false;
	  }		  
  }
 
  private search(LinkedArrayNode<T> node, T x) {
	  
  }
  
  // Returns the first element that equals x, or null 
  // if there is no such element.
  // Throws IllegalArgumentException if x is null.
  // Target Complexity: O(n) for n elements
  public T getMatch(T x) {
	  if (head == null) {
		  return null;
	  } else {
		  
	  }
	  
	  
  }
  
  
  // Returns true if this LinkedArrays contains the specified element.
  // Throws IllegalArgumentException if x is null. May call getMatch.
  // Target Complexity: O(n)
  public boolean contains (T x);
 
  // Insert x into the first LinkedArrayNode with an available space in 
  // its array. 
  // Returns true if x was added.
  // Throws IllegalArgumentException if x is null.
  // Target Complexity: O(number of nodes)
  public boolean add(T x);
 
  // Remove the first occurrence of x if x is present. 
  // Returns a reference to the removed element if it is removed. 
  // When the last data element is removed from (the array in) a
  // LinkedArrayNode, the LinkedArrayNode is removed from the 
  // LinkedArrays.
  // Throws IllegalArgumentException if x is null.
  // Target Complexity: O(n)
  protected T remove(T x);
    
  // Returns a pretty representation of the LinkedArrays.
  // Example: A LinkedArrays with two LinkedArrayNodes that have arrays 
  // of length two. The size of the first array is two and the size of
  // the second array is one: | 4, 2 | 3 |
  public String toString();
}