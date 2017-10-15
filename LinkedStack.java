import javax.xml.soap.Node;
import java.util.EmptyStackException;

/**
 * A class implementing a Stack using fixed linked node
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
		stack.add(newEntry);
	}
	
	/** Removes and returns this stack's top entry.
	 @return  The object at the top of the stack.
	 @throws  EmptyStackException if the stack is empty before the operation. */
	public T pop() throws EmptyStackException {
		// Check if empty
		if(isEmpty())
			throw emptyStackException;
		
		// Pop
		T topItem = stack.lastElement();
		
		stack.remove(stack.size() - 1);
		
		return topItem;
	}
	
	/** Retrieves this stack's top entry.
	 @return  The object at the top of the stack.
	 @throws  EmptyStackException if the stack is empty. */
	public T peek() throws EmptyStackException {
		// Check if empty
		if(isEmpty())
			throw emptyStackException;
		
		// Peek
		return stack.lastElement();
	}
	
	/** Detects whether this stack is empty.
	 @return  True if the stack is empty. */
	public boolean isEmpty() {
		return stack.isEmpty();
	}
	
	/** Removes all entries from this stack. */
	public void clear() {
		stack.clear();
	}
	
	// Node
	private class Node {
		private T data;
		private Node next;
		
		public T getData() {
			return data;
		}
		
		public void setData(T newData) {
		
		}
		
		public Node getNext() {
		
		}
		
		public void setNext() {
		
		}
	}
	
}
