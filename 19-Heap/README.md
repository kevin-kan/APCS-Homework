HW 19: JAVA BUILT-INS
=====================

1. What is the difference between HashMap and HashSet?
\n	A HashMap is like the dictionary in python and uses a key to value. A HashMap cannot have duplicate keys, but it can have duplicate values. 
\n	A HashSet is a set, or an unordered collection. A HashSet cannot have duplicate values.

2. How is a HashMap/TreeMap implemented internally? 
\n	Implementing a map interface, a Hashmap then stores an object which stores both keys and values and assigns keys to values. The put() method are instances of HashMaps, adding the key/value to an array. But when put() is called, hashcode of a hashfunction, which changes the properties of the value are run on the object's value. There is also a get method. If there are equal values, you run a keys.equal() test to check for true equality. If it exists, then the two key objects will be treated as one and the same.
\n	A treemap similary implements a map, storing a key and value in an object, and implements NavigableMap. The object's key has a compare method, implementing the Comparable interface. 

3. Speed Comparison between HashMap and TreeMap?
\n	In TreeMap, elements are sorted, but in HashMap, elements are unsorted. However, unless there is a specific need for ordering, a HashMap appears to be faster. 100K elements takes about 65 milliseconds for a HashMap, and 100 milliseconds for a TreeMap. HashMaps are about O(1) in runtime whereas TreeMaps are O(log n) in terms of runtime. 

4. Java's Heap structure?
\n	Priority Queue.

