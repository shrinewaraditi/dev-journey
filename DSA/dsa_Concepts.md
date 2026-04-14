### HashSet — Complete Theory
You've now seen HashMap and HashSet in two problems. Time to understand both properly.

The Big Picture — What is Hashing?
Simple explanation:
Imagine a library with 1000 books. You want to find a specific book.
Without hashing:
Check every shelf one by one → slow → O(n)
With hashing:
Every book has a code. Code tells you exactly which shelf it's on. Go directly there → instant → O(1)
Hashing = a system that converts a value into a location so you can find it instantly.

### HashSet — Theory
What it is:
A collection that stores values with NO duplicates and NO order.
How it works internally:
You add value 5
→ HashSet runs a formula on 5 called hash function
→ formula gives a location number
→ 5 gets stored at that location
→ next time you check if 5 exists
→ same formula runs → same location → found instantly
Three things HashSet guarantees:
1. No duplicates — adding same value twice has no effect
2. O(1) lookup — checking if value exists is instant
3. No order — elements are not stored in insertion order
All operations:
javaimport java.util.HashSet;

HashSet<Integer> set = new HashSet<>();

set.add(5);           // add value
set.add(3);
set.add(5);           // duplicate — silently ignored

set.contains(5);      // true  — check if exists
set.contains(9);      // false

set.remove(3);        // remove value

set.size();           // how many elements

set.isEmpty();        // is it empty?

// loop through all values
for (int val : set) {
    System.out.println(val);
}
When to use HashSet:
→ Need to check if something was seen before
→ Need to remove duplicates from a collection
→ Need fast lookup without caring about order

### HashMap — Theory
What it is:
A collection that stores KEY → VALUE pairs.
Think of it as a dictionary:
word (key)   → meaning (value)
"apple"      → "a fruit"
"java"       → "a programming language"
In DSA:
number (key) → its index (value)    ← Two Sum
character    → its count (value)    ← frequency problems
All operations:
javaimport java.util.HashMap;

HashMap<Integer, Integer> map = new HashMap<>();

map.put(2, 0);         // store key=2, value=0
map.put(7, 1);         // store key=7, value=1

map.get(2);            // returns 0 — get value for key 2
map.containsKey(7);    // true — does key 7 exist?
map.containsValue(1);  // true — does value 1 exist?

map.remove(2);         // remove key 2 and its value

map.size();            // how many pairs

// loop through all pairs
for (int key : map.keySet()) {
    System.out.println(key + " → " + map.get(key));
}
When to use HashMap:
→ Need to remember a value associated with something
→ Need to count frequency of elements
→ Need to find complement or pair (like Two Sum)

HashSet vs HashMap — Side by Side
                HashSet          HashMap
────────────────────────────────────────────────
Stores          values only      key-value pairs
Duplicate keys  not allowed      not allowed
Use when        checking if      remembering value
                seen before      linked to a key
Example         Contains         Two Sum
                Duplicate        (need index too)
Import          HashSet          HashMap
Time complexity O(1)             O(1)
Simple rule:
Just need to remember IF you saw something → HashSet
Need to remember WHAT was associated with it → HashMap

Contains Duplicate → did I see this number? → HashSet
Two Sum → where was that number? → HashMap (need index)

The Pattern You'll See Again and Again
Both problems follow the same thinking:
Brute force  → nested loops → O(n²) → slow
Optimized    → HashSet/HashMap → O(n) → fast

The upgrade from O(n²) to O(n) almost always
involves HashSet or HashMap in array problems.
Whenever you see a problem involving:
→ duplicates          → think HashSet
→ finding pairs       → think HashMap
→ counting frequency  → think HashMap
→ checking existence  → think HashSet

DSA Notes to Add Today
DATA STRUCTURE: HashSet
  stores unique values only
  add(), contains(), remove(), size(), isEmpty()
  O(1) for all operations
  use when: checking if seen before, removing duplicates

DATA STRUCTURE: HashMap
  stores key-value pairs
  put(), get(), containsKey(), remove(), size()
  O(1) for all operations
  use when: need to remember value linked to a key

PATTERN:
  nested loops O(n²) → upgrade with HashSet/HashMap → O(n)
  seen in: Two Sum, Contains Duplicate, and many more
