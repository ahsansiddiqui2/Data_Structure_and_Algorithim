class Main {
	public static void main(String[] args) {
		LinkedStack<String> ls = new LinkedStack<String>();
		ls.isEmpty();
		ls.push("Saad");
		ls.push("Zain");
		ls.push("Bilal");
		ls.push("Usman");
		ls.push("Saeed");
		ls.push("Yasir");
		ls.push("Mudasir");
		ls.push("Shahzeb");
		ls.push("Moazzam");
		ls.push("Shoaib");
		ls.display();
		System.out.println("Size of Linked Stack is: "+ls.size());
		System.out.println("Element that can be peeked is: "+ls.peek());
		System.out.println("Element that poped out of it, is: "+ls.pop());
		ls.search("Mudasir");

		ArrayStack<String> as = new ArrayStack<String>(,34);
	}
}