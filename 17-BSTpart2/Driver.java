public class Driver{
    public static void main(String[] args){
	BST tree = new BST();
	tree.insert(new Node(50));
	tree.insert(new Node(25));
	tree.insert(new Node(40));
	tree.insert(new Node(30));

	
	System.out.println(tree.search(30));
    }
}
