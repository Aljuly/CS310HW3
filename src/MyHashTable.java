public class MyHashTable<T> {
  protected static final int DEFAULTTABLESIZE = 101; 
  protected int size;
  protected int tableSize;
  protected Object[] table;
 
  // Workhorse constructor. The internal table size is tableSize if
  // tableSize is prime or the next prime number that is
  // greater than tableSize if tableSize is not prime.
  public MyHashTable( int tableSize );
 
  // Convenience constructor. DEFAULTTABLESIZE is 101
  public MyHashTable( );
  
  // Make the hash table logically empty.
  // Target Complexity: O(n)
  public void clear( );
 
  // Insert x into the hash table. If x is already present, then do 
  // nothing.
  // Throws IllegalArgumentException if x is null.
  public void insert(T x);
 
  // Remove x from the hash table.
  // Throws IllegalArgumentException if x is null.
  public void remove( T x );
 
  // Return true if x is in the hash table
  // Throws IllegalArgumentException if x is null.
  public boolean contains(T x );
 
  // Return the first element in the hashed-to LinkedArrays that equals 
  // x, or null if there is no such element.
  // Throws IllegalArgumentException if x is null.
  public T getMatch(T x);
 
  // Returns the number of elements
  // Target Complexity: O(1)
  public int size();
 
  // Returns true if there are no elements.
  // Target Complexity: O(1)
  public boolean isEmpty( );
 
  // Returns a Set containing all of the T elements in the table. (Set is
  // an interface implemented by classes HashSet and TreeSet.)
  public Set<T> toSet();
 
  // Returns a pretty representation of the hash table.
  // Uses toString() of LinkedArrays.
  // Example: For a table of size 3
  // Table:
  // 0: | two |
  // 1: | one, four |
  // 2: 
  public String toString();
 
  // Increases the size of the table by finding a prime number 
  // (nextPrime) at least as large as twice the current table size. 
  // Rehashes the elements of the hash table when size is greater than 
  // tableSize/2.
  protected void rehash( );
 
  // Internal method for computing the hash value from the hashCode of x.
  protected int myhash(T x) {
    int hashVal = x.hashCode( );
    hashVal %= tableSize;
    if( hashVal < 0 )
      hashVal += tableSize;
    return hashVal;
  }
 
  // Internal method to find a prime number at least as large as n. 
  protected static int nextPrime(int n ){
    if( n % 2 == 0 )
      n++;
    for( ; !isPrime( n ); n += 2 )
      ;
    return n;
  }
 
  // Internal method to test if a number is prime. Not an efficient 
  // algorithm. 
  protected static boolean isPrime(int n ) {
    if( n == 2 || n == 3 )
      return true;
    if( n == 1 || n % 2 == 0 )
      return false;
    for( int i = 3; i * i <= n; i += 2 )
      if( n % i == 0 )
        return false;
    return true;
  }
}
