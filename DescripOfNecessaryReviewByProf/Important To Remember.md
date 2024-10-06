### Important To Remember
For the class diagram:
* Include variables with their data types
* Include function names with their return type, and parameters with their data type if any

```java
class Animal{
String name;
void setName(string name){}
String getName(){}
}
```
For the flowchart make sure to use correct symbols (check out flowchart notes).
------------------------------------------------------------------------------------------------------------------------------------------
### Time analysis
#### O(n) - Single Loop

```java
public void printNumbers(int n) {
 for (int i = 0; i < n; i++) {
 System.out.println(i);
 }
}
```
In this example, the loop iterates n times. Each iteration takes roughly the same amount of time 
(printing to the console). Since the number of operations grows linearly with n, this is O(n) time 
complexity.
#### Animal
* String name
* void setName(string name)
* String getName()
#### O(n^2) - Nested Loops
```java
public void printPairs(int n) {
 for (int i = 0; i < n; i++) {
 for (int j = 0; j < n; j++) {
 System.out.println(i + ", " + j);
 }
 }
}
```
Here, we have a loop nested inside another loop. The outer loop runs n times, and for each of 
those iterations, the inner loop also runs n times. This results in n * n total iterations, giving us 
O(n^2) time complexity.
#### Why Nested Loops Often Mean O(n^2)
Nested loops often lead to O(n^2) because you're performing an operation for every possible 
pair of elements in your input. Imagine you have a list of numbers, and you want to compare 
each number to every other number in the list. You'd use nested loops to achieve this, resulting 
in that quadratic increase in runtime.
#### Important Note:
While nested loops often indicate O(n^2), it's not always the case. The inner 
loop's behavior and how its iterations relate to the outer loop can significantly impact the 
overall time complexity.
### Big O Notation Cheat Sheet
* **O(1) - Constant Time:** The algorithm takes the same amount of time, regardless of the 
input size.
	+ Example: Accessing an element in an array by its index.
* **O(log n) - Logarithmic Time:** The time grows slowly as the input size increases. Often 
involves dividing the problem in half repeatedly.
	+ Example: Binary search in a sorted array.
* **O(n) - Linear Time:** The time increases linearly with the input size.
	+ Example: Iterating through an array.
* **O(n log n) - Log-linear Time:** A combination of linear and logarithmic behavior. Common 
in efficient sorting algorithms.
	+ Example: Merge sort, Quick sort.
* **O(n^2) - Quadratic Time:** Time grows proportionally to the square of the input size. 
Often involves nested loops.
	+ Example: Bubble sort, Selection sort.
* **O(2^n) - Exponential Time:** Time doubles with each addition to the input. Can become 
very slow quickly.
	+ Example: Finding all subsets of a set.
* **O(n!) - Factorial Time:** Grows extremely fast. Often involves generating all 
permutations.
	+ Example: Traveling Salesperson Problem (brute-force solution).
### Key Concepts
* **Worst-Case Scenario:** Big O usually focuses on the worst-case runtime.
* **Drop Constants and Lower-Order Terms:** Simplify expressions (e.g., O(2n + 5) becomes 
O(n)).
* **Focus on Dominant Terms:** In O(n^2 + n), the n^2 term dominates as n grows large.
### Common Data Structure Operations
| Operation | Array | Linked List | Hash Table (Average) |
| --- | --- | --- | --- |
| Access | O(1) | O(n) | O(1) |
| Search | O(n) | O(n) | O(1) |
| Insertion | O(n) | O(1) | O(1) |
| Deletion | O(n) | O(1) | O(1) |
### Tips for Analysis
1. **Identify Basic Operations:** What are the fundamental steps the algorithm takes?
2. **Count Operations:** How many times are these steps executed?
3. **Express Count as a Function of Input Size:** Use Big O to represent this relationship
### Big-O Algorithm Complexity Cheat Sheet (Know Thy Complexities!) @ericdrowell (bigocheatsheet.com)

