public class MyHashMultiMap<KeyType, ValueType> {
 
  // Hash table to hold key/value pairs 
  protected MyHashTable<Entry<KeyType,ValueType>> items;  
 
  // Constructor
  public MyHashMultiMap();
 
  // Associates the specified key with the specified value in this map.
  // If key is already associated with a List of values, then value
  // is added to this list; otherwise, a new List is created, value is 
  // added to this List, and key is associated with this new List.
  public void put(KeyType key, ValueType value);
 
  // Returns the List of values that key is associated with, or null if 
  // there is no mapping for key.
  public List<ValueType> get(KeyType key);
 
  // Returns the number of elements
  // Target Complexity: O(1)
  public int size();
 
  // Returns true if there are no elements.
  // Target Complexity: O(1)
  public boolean isEmpty();
 
  // Make the map logically empty.
  // Target Complexity: O(1)
  public void clear();
 
  // Returns a Set of the Entries contained in this map.
  public Set<Entry<KeyType, ValueType>> entrySet();
  
  // Returns the MyHashTable<T> of items
  protected MyHashTable<Entry<KeyType,ValueType>> getItems();
 
  // A helper method that returns an Entry created from the 
  // specified key and List. Called by put and get.
  protected MyHashMultiMap.Entry<KeyType,ValueType> 
  makeEntry( KeyType key, LinkedList<ValueType> valueList ) {
     return new MyHashMultiMap.Entry<KeyType, ValueType>(key,valueList);
  }
 
  // A helper method for creating an Entry from a key value.
  // Called by put and get.
  protected MyHashMultiMap.Entry<KeyType,ValueType> 
  makeEntry( KeyType key ) {
     return makeEntry(key, null );
  }
 
  public static class Entry<KeyType, ValueType>;
}