# Data Structures and Algorithms (CSIS 2420)
## Week 1
1. List four pre-computer data structures not covered in class. For each of these describe
   - The problems they help solve
   - Associated algorithms
1. Test your environment by writing a static method that takes positive integer n as input and outputs an array of n random integers in the range 0 → 1,000,000. Test this method by calling it on n = 100 and printing the result.


## Week 2
1. Using just the Node class, create 4 different nodes and place in them: your Last name, First name, Major, Class level. Link them so they go in that order. Then write code which prints out the data, one piece of data per line, by starting at the first node and walking through the list.
1. Add a Biginteger and a Character to the front of your list, and print the entire contents of your list. (Think about what you might want to do to make things faster).
1. Write a test driver for your new List class. (Test all methods and constructors). Add four objects: BigInteger, String, Character, Integer, and print the contents. Remove the objects from the front one at a time and print the contents at each step.
1. Add the following methods to the List code developed in class: insertAtBack() and removeFromBack(), which insert and remove objects from the back of the list. Run a test driver for these new methods using a List with the four elements in ex. 1 above. Show both the list code and the test driver code on your web page.
1. Create a list and fill it with the squares from 1 to 100, then print out the contents.
1. Have the last node of the List in ex. 5 point to the first node. What happens when you try to print the list? (In your web page, you just need to show the whole list printed twice).


## Week 3
1. Add and test a method for the List class which returns the size of the list (i.e. the number of elements in the list). Show your new List class and the test driver in your website. Follow this pattern for all subsequent problems where you are asked to add new methods.
1. Add and test a method for the List class which returns a copy of the list.
1. Add and test static a method to the List class which appends one list to another and returns the result.
1. Write code that pushes 10 strings onto the stack (version 2), printing while it goes, then pops them off, printing while it removes.
1. Rewrite the Stack2 class using composition, and write an appropriate test driver. Then remove the print method and replace it with a “peek()” method that only returns the object at the top of the stack without removing it. Post the code for the final class which models the stack ADT.
1. Rewrite the Queue class using composition, and write an appropriate test driver. First, test it with the “print” method. Then remove the print method and replace it with a “peek()” method that only returns the object at the front of the queue without removing it. Post the code for the final class which models the queue ADT.


## Week 4
1. Use your code from week 1 to generate 15 random ints in the range 0 to 1000 and print them. Draw by hand the resulting BST you would get given this data.
1. Finish our test driver for the TreeNode. Print all contents using only reference to the root.
1. Generate 10 random ints in the range 0 to 100, print them in the order they are generated and insert them into a tree constructed using just the TreeNode class. Print out the keys in such a way that it proves that the data was inserted in the way you expect. (Hint: look at the data we are inserting and draw the corresponding tree. Use the TreeNode methods to verify the data is where it is supposed to be).
1. Generate 1000 random ints in the range 0 to 1 million, print them in the order they are generated and insert them into the tree. Then do an inOrderTraversal which prints out the keys. What can you say about the values printed out? How fast is this algorithm on 1 million keys where the keys range from 0 to 1 billion (for timing purposes, you don’t need to print out). (Hint: use System.currentTimeMillis()).


## Week 5
1. Add and test these methods to the Tree class:
   - max() which returns the maximum value in the Tree.
   - min() which returns the minimum value in the Tree.
1.  Add a find(key) method to the Tree class which returns true if the key is in the Tree and false if key is not in the tree.
1.  Reimplement TreeNode and TreeNodeTest to store strings. Use it to store the first 20 words in the “About SUU” web page. Then print the contents of the tree.
1. Generate 18 random ints in the range 0 to 100. Demonstrate by hand the insertion of these numbers into a hash array of size 31. Use the mod 31 hash. Resolve the collisions by chaining.
1. Using the hash table code given in class as a starting point, generate 100 random ints in the range 0 to 1 million and insert these into an appropriately sized hash table. Then walk through the table printing all values inserted at each index.

## Week 6
1. How does Java hash objects? Test your theory.
1. Show by hand every step in the process of constructing a heap from the following initial values: v = [9, 12, 17, 30, 50, 20, 60, 65, 4, 19].
1. Generate 10 random ints in the range 0 to 1000. Create a heap with these values. Pictorially show the history of HeapSort at each step. Show a picture after the initial swap, then after reheapifying for every step. (The complexity of this assignment is 21 steps).


## Week 7
1. Using the graph given in class, determine by brute force the shortest path from A to H. Show by hand at least 10 different paths with their total weights. (There are 8 vertices in this graph).
1. Using the graph we used for ex. #1, write out the adjacency matrix and adjacency list representations. For the adjacency matrix, show the weights.
1. Give the adjacency matrix and the adjacency list for the heap you created in week 6 ex. 3.
1. Complete the event charts for Depth First and Breadth First search on the graph given in class.
1. Illustrate breadth first traversal for the graph given in ex. 1, starting from vertex A. Use the list of events and queue contents as illustrated in class.
1. Illustrate depth first traversal for the graph given in ex. 1, starting from vertex A. Use the list of events and stack contents as illustrated in class.


## Week 9
1.Using the SUU privacy policy, clean up the text and parse it following the example we did in class. Make sure to clean out all non-word symbols. How many (real) words in this file? (Hint: see the Pattern class).


## Week 10
1. Demo the following ArrayList methods: contains, remove, clear and isEmpty using our data set.
1. Demo the PriorityQueue methods: add, clear, contains, peak, remove, size using our data set.
1. Write a filter that selects the words starting with ‘a’ or ‘b’. How big is it? (Hint: use compareTo()).
1. Write a filter that allows you to find the set A of words starting with a, b, c or d. How many elements in the set?
1. Write a filter that allows you to find the set B of words starting with c, d, e or f. How many elements in the set?
1. Form the union of sets A and B. How many elements in the set?
1. When you print out the data from a HashSet, does it follow the same order you would expect from the order in the text? Why?


## Week 11

1. Look in the Java source for the Collection interface. Copy the relevant part of the code (i.e. remove all comments). Describe what it looks like.
1. Improve our countwords program so that it does not distinguish between upper and lower case.
1. Finish the methods using the TreeSet class that implement the set operations Union, Intersection and Difference. Test these methods using our data set from awmt.txt by first inserting the words into a List data structure, then transforming this into a TreeSet. Use an iterator to walk through the TreeSet creating two sets A and B. A should contain all the unique words of length 5 or less and B should contain all words of length 6 or greater. Use these sets to test your implementation of the set operators by forming (A union B), (A intersect B) and (A difference B).
1. Using the “countwords” program we implemented in class, make the following improvements:
   - make it not case sensitive
   - have it sort so that the highest values are at the top
   - clean up the output: make it look more professional.
1. Write a new comparator that sorts the data by word length (make use of the improvements you made above).


## Week 12
1. Change our definition of the compareTo method so the data shows the most frequent words at the top.
1. Improve the code so it changes all words to lowercase before comparing.
1. Do what you need to do to improve the output?
1. Create a small table showing the complexity of the operations of search, insert and delete for the special purpose data structures: stack, queue priority queue (heap implementation).
1. Redo our image code to include 12 of the cards.
1. Create an ArrayList of this type: <BufferedImage, String>, where the string gives the card name. Repeat the above code using this new type.
1. Dump your ArrayList into a TreeSet and have it lay out the cards in the order it creates. Rewrite your code to have it sort on the name of the card.
