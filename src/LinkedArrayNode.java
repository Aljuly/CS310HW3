
public class LinkedArrayNode<T> {
  protected LinkedArrayNode<T> prev;
  protected LinkedArrayNode<T> next;
  protected Object[] array;          // array holds T objects
  protected static final int DEFAULTLENGTHOFARRAY = 16;
  protected int arraySize;    // number of elements in the array.
  private int curpos;	// current position in the array
 
  // Workhorse constructor. Initialize prev and next and the size of the
  // array, and create an array of Objects of the specified length.
  // Parameter lengthOfArray is used to create array. The value of 
  // lengthOfArray need not be saved since it is essentially array.length.
  // Throws IllegalArgumentException if lengthOfArray < 0.
  public LinkedArrayNode(LinkedArrayNode<T> prev, 
		  LinkedArrayNode<T> next, int lengthOfArray) throws IllegalArgumentException {
	  this.prev = prev;
	  this.next = next;
	  this.curpos = 0;
	  if (lengthOfArray < 0) {
		  throw new IllegalArgumentException("Exception! Length Of Array less then 0!: " + lengthOfArray); 
	  } else {
		  this.arraySize = lengthOfArray;
		  this.array = new Object[this.arraySize];
	  }
  }
 
  // Convenience constructor. Calls the workhorse constructor with 
  // DEFAULTLENGTHOFARRAY as the argument.
  public LinkedArrayNode(LinkedArrayNode<T> prev, 
     LinkedArrayNode<T> next) throws IllegalArgumentException {
	  this(prev, next, DEFAULTLENGTHOFARRAY);
  }

// Add element x to the end of the array.
  // Throws IllegalArgumentException if x is null.
  // Target Complexity: O(1)
  public void add(T x) throws IllegalArgumentException {
	  if (x == null) {
		  throw new IllegalArgumentException("Exception! adding value is Null! ");
	  } else {
		  if (curpos < arraySize) { 
			  array[curpos] = x;  
			  curpos++;
		  }
	  }
  }
 
  // Locate and remove the first element that equals x. This may require 
  // elements to be shifted (left). Returns a reference to the removed 
  // element, or null if the element was not removed.
  // Throws IllegalArgumentException if x is null.
  // Target Complexity: O(n)
  @SuppressWarnings("unchecked")
  public T remove(T x) throws IllegalArgumentException {
	  T y = null;
	  int k = 0;
	  boolean finded = false;
	  if (x == null) {
		  throw new IllegalArgumentException("Exception! removing value is Null! ");
	  } else {
		  for (int i = 0; i < arraySize; i++) {
			  k = i;
			  if (array[i] == x) {
				  y = (T)array[i];
				  finded = true;
				  curpos--;
				  break;
			  }
		  } 
		  if (finded) {
			  int i = k;
			  while ((i < arraySize - 1) && (array[i] != null)) {
				  array[i] = array[i+1];
				  i++;
			  }
			  array[i] = null;
		  }
	  }
	  return y;
  }
 
  // Returns a reference to the first element in the array that equals x, or 
  // null if there is no matching element. 
  // Throws IllegalArgumentException if x is null.
  // Target Complexity: O(N)
  @SuppressWarnings("unchecked")
  public T getMatch(T x){
	  T y = null;
	  if (x == null) {
		  throw new IllegalArgumentException("Exception! searching for Null value! ");
	  } else {
		  for (int i = 0; i < arraySize; i++) {
			  if (array[i] == x) {
				  y = (T)array[i];
				  break;
			  }
		  } 
	  }
	  return y;
  }
 
  // toString() - create a pretty representation of the node by
  // showing all of the elements in the array.
  // Target Complexity: O(n)
  // Example: an array with size four and length five: 1, 2, 4, 6
  public String toString(){
	  String n = "";
	  for (int i = 0; i <= curpos; i++) {
		  n = n + array[i].toString();
		  if (i < curpos) n = n + ","; 
	  }
	  return n;
  }
}