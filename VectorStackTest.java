public class VectorStackTest {
	
	public static void main(String[] args) { // rename to 'main' and run
		VectorStack stack = new VectorStack();
		
		String book1 = "book1";
		String book2 = "book2";
		String book3 = "book3";
		String book4 = "book4";
		
		stack.push(book1);
		stack.push(book2);
		stack.push(book3);
		stack.push(book4);
		
		System.out.println(stack.peek()); // book4
		
		System.out.println(stack.pop()); // book4
		
		System.out.println(stack.peek()); // book3
		
		System.out.println(stack.isEmpty()); // false
		
		stack.clear();
		
		System.out.println(stack.isEmpty()); // true
		
		stack.push(book4);
		
		System.out.println(stack.peek()); // book4
		
		// test when full
		for(int i = 0; i < 11; i++) {
			stack.push(book1);
		}
		
	}
	
}
