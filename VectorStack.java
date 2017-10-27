import java.util.EmptyStackException;
import java.util.Vector;

/**
 * A class implementing a Stack using vector
 */

public final class VectorStack<T> implements StackInterface<T> {
	// member variables
	private static final int INITIAL_CAPACITY = 10; // default size of stack
	private Vector<T> stack;
	private int top; // top of the stack
	
	private EmptyStackException emptyStackException = new EmptyStackException(); // exception to throw of stack is empty
	
	public VectorStack() {
		stack = new Vector<>(INITIAL_CAPACITY); // This is an unchecked cast
	}
	
	/** Adds a new entry to the top of this stack.
	 @param newEntry  An object to be added to the stack. */
	public void push(T newEntry) {
		stack.add(newEntry);
	}
	
	/** Removes and returns this stack's top entry.
	 @return  The object at the top of the stack.
	 @throws  EmptyStackException if the stack is empty before the operation. */
	public T pop() {
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
	public T peek() {
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
	
}
