///////////////////////////////////////////////////////////////////////////////
//
// Title:            MyList
// Files:            {ArrayNode.java, MyApp.java}
// Semester:         (Computer Programming II) Spring 2018
//
// Author:           Kevin Ordonez
// Email:            KevinOrdonez0511@FloridaPoly.edu
// CS Login:         KevinOrdonez0511
//
///////////////////////////////////////////////////////////////////////////////

public class ArrayNode {
	ArrayNode right;
	int data;
	
	//Constructor if a int argument is passed
	public ArrayNode(int data) {
		this.data = data;
	}
	//Constructor if no argument is passed
	public ArrayNode() {
		this.data = 0;
	}
	//Constructor if another ArrayNode classed is passed
	public ArrayNode(ArrayNode headnode) {
		
	}
	
	// Returns number of elements stored in the list.
	public int numberOfElements() {
		
		return 0;
	}
	
	// Returns a new ArrayNode that is a clone of this ArrayNode
	public ArrayNode clone() {
		
		return right;
	}
	// Makes this object equal to another object of this class
	public void copy() {
		
	}
	// Indicates whether this object is equal to another object of this class
	public boolean equals(ArrayNode node1, ArrayNode node2) {
		
		return true;
	}
	// Appends an element to the end of the list
	public void add(int data) {
		
		
	}
	// Removes all elements from the list
	public void clear() {
		
	}
	// indicates whether the list contains the specified element
	public boolean contains() {
		
		return false;
	}
	// fill the list with the specified element
	public void fill() {
		
	}
	// fill the specified range of the list with the specified element
	public void fillRange() {
		
	}
	// get the element at the specified position in the list
	public int get() {
		
		return 0;
	}
	// returns the index of the first occurrence of the element in the list; or -1 if the list does not contain the element. 
	public int indexOf(int x) {
		
		return -1;	
	}
	// inserts an element at the specified position in the list
	public void insert(int x) {
		
	}
	// indicates whether the list is empty
	public boolean isEmpty() {
		
		return true;
	}
	// indicates whether the list is sorted
	public boolean isSorted() {
		
		return true;
	}
	//returns the index of the last occurrence of the element in the list; or -1 if the list does not contain the element. 
	public int lastIndexOf(int x) {
		
		return -1;
	}
	// remove the first occurrence of the element in the list
	public void remove() {
		
	}
	//removes the element at the specified position in the list.
	public void removeAt() {
		
	}
	// removes the first element in the list.
	public void removeFirst() {
		
	}
	//removes the last element in the list.
	public void removeLast() {
		
	}
	//remove all elements, whose index is in the specified range, from the list.
	public void removeRange() {
		
	}
	// sets the element at the specified position in the list.
	public void set(int x) {
		
	}
	// prints all elements of the list.
	public void showElements() {
		
	}
	// returns the number of elements in the list.
	public int size() {
		
		return 0;
	}
	// sorts the elements of the list using Merge Sort Algorithm.
	public void sort() {
		
	}
	// creates and returns a sublist of this list, with the elements in the specified range.
	public ArrayNode sublist() {
	
		
		return right;
	}
	// creates and returns an array with the elements of the list in the same order.
	public void toArray() {
		
	}
}
