# Java Collections
* Collection: It is group of objects represented by an entity e.g. List, Set, Map etc.
  
* List is used when insertion order has to be preserved and duplicate entries can be added
  - How it can be implemented
    - ArrayList
    - LinkedList
    - Vector 
       -> Stack
       
 * Set is when insertion order is not maintained and duplicate entries are not allowed
    - How it can be implemented
      - HashSet
      - TreeSet

* HashMap is used for persisting group of objects in the form of key-value pairs.
  - Duplicate Keys are not allowed
  - Sort Order is not preserved

* Comparator Interface contains only one method called compare()
   - How the declaration of this method looks like public int compare(Object obj1, Object obj2)
      ---returns negative value if obj1 has to come before obj2
      ---returns positive value if obj1 has to come after obj2
      ---returns 0 if obj1 equals obj2
