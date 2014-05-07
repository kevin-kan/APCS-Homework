public class Driver{
    public static void main(String[] args){
	BST tree1 = new BST();
        BST tree2 = new BST();

	tree1.insert(new Node(70));
	tree1.insert(new Node(30));
	tree1.insert(new Node(80));
	tree1.insert(new Node(20));
	tree1.insert(new Node(35));
	tree1.insert(new Node(75));
	tree1.insert(new Node(88));

	tree2.insert(new Node(20));
	tree2.insert(new Node(25));
	tree2.insert(new Node(30));
	tree2.insert(new Node(70));
	tree2.insert(new Node(75));
	tree2.insert(new Node(80));
	tree2.insert(new Node(88));

	tree1.traverse(tree1.root);
	System.out.println();
	tree2.traverse(tree2.root);
    }
}
