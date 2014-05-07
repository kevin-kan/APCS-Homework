public class Driver{
    public static void main(String[] args){
	BST tree = new BST();

	tree.insert(new Node(30));
	tree.insert(new Node(10));
	tree.insert(new Node(5));
	tree.insert(new Node(15));
	tree.insert(new Node(40));
	tree.insert(new Node(70));
	tree.insert(new Node(90));
	tree.insert(new Node(75));
	tree.insert(new Node(98));
	
	System.out.println(tree.search(15));
	System.out.println(tree.search2(tree.root, 15));
	tree.traverse(tree.root);
	
	System.out.println("");
	tree.delete(70);
	tree.traverse(tree.root);
    }
}
