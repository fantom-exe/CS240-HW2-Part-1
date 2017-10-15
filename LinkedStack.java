import java.util.EmptyStackException;

/**
 * A class implementing a Stack using linked node
 */

public final class LinkedStack<T> implements StackInterface<T> {
	// member variables
	private Node topNode; // top of the stack
	
	private EmptyStackException emptyStackException = new EmptyStackException(); // exception to throw of stack is empty
	
	public LinkedStack() {
		topNode = null;
	}
	
	/** Adds a new entry to the top of this stack.
	 @param newEntry  An object to be added to the stack. */
	public void push(T newEntry) throws EmptyStackException {
		topNode = new Node(newEntry, topNode);
	}
	
	/** Removes and returns this stack's top entry.
	 @return  The object at the top of the stack.
	 @throws  EmptyStackException if the stack is empty before the operation. */
	public T pop() throws EmptyStackException {
		// Check if empty
		if(isEmpty())
			throw emptyStackException;
		
		T topItem = peek(); // Get the top item
		topNode = topNode.getNext();
		
		return topItem;
	}
	
	/** Retrieves this stack's top entry.
	 @return  The object at the top of the stack.
	 @throws  EmptyStackException if the stack is empty. */
	public T peek() throws EmptyStackException {
		// Check if empty
		if(isEmpty())
			throw emptyStackException;
		else return topNode.getData();
	}
	
	/** Detects whether this stack is empty.
	 @return  True if the stack is empty. */
	public boolean isEmpty() {
		return topNode == null;
	}
	
	/** Removes all entries from this stack. */
	public void clear() {
		topNode = null;
	}
	
	/** Node class */
	private class Node {
		private T data;
		private Node next;
		
		public Node(T newEntry, Node topNode) {
			data = newEntry;
			next = topNode;
		}
		
		public T getData() {
			return data;
		}
		
		public void setData(T newData) {
			data = newData;
		}
		
		public Node getNext() {
			return next;
		}
		
		public void setNext(Node newNode) {
			next = newNode;
		}
	}
	
}
