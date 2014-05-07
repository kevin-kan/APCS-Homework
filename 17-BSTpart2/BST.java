public class BST{
    public Node root;
    
    public BST() {
	root = null;
    }
    
    public Node search(int x){
	Node current = root;
	while  (current != null && current.getData() != x){
	    if (current.getData() < x)
		current = current.getRight();
	    else
		current = current.getLeft();
	}
	return current;
    }

    public Node search2(Node n, int x){
	if (n == null || n.getData() == x){
	    return n;
	}else if (x > n.getData()){
	    return search2(n.getRight(), x);
	}else{
	    return search2(n.getLeft(), x);
	}
    }

    public void insert(Node n) {
	Node x = root;
	Node y = null;
	if (root == null){
	    root = n;
	}else{
	    while (y == null) {
		if (x.getData() < n.getData()) {
		    if (x.getRight() == null) 
			y = x;
		    else 
			x = x.getRight();
		}
		else {
		    if (x.getLeft() == null) 
			y = x;
		    else
			x = x.getLeft();
		}
	    }
	    if (n.getData() > y.getData()) 
		y.setRight(n);
	    else
		y.setLeft(n);
	}
    }

    public void delete(int i){
	/*
	  1. get a pointer to the parent of the node we want to delete
	  -> piggyback or recursion

	  2. 3 cases:
	  a. the node to delete is leaf 
	  -> set the parents left/right pointer to null (as appropriate)
	  b. the node to delete has one child 
	  -> set the parent's left or right pointer to the node's non-null pointer (as appropriate)
	  * Cases a & b can be combined/indentical *
	  c. the node to delete has two children
	  -> find the largest value on the left subtree 
	  - go one left, then as far right as possible
	  - or find smallest in right subtree
	  -> make a copy of that value
	  -> pretend you have a tree with A node to delete as the root and delete the largest node in the left subtree
	  -it can only have 0 children or 1 child
	  -> replace the ndoe to delete with the copied value

	  3. root - treat as special case with if statement
	  -> OR use a  dummy node
	*/
	if (search(i) == null){
	    System.out.println("not found");
	    return;
	}

	Node parent = root;
	Node child = search(i);
	boolean leftBranch = false;
	boolean parentFound = false;


	while (parent != null && parentFound == false){
	    if (parent.getRight().getData() == i){
	        parentFound = true;
		leftBranch = false;
	    }
	    else if (parent.getLeft().getData() == i){
		parentFound = true;
		leftBranch = true;
	    }
	    else{
		if (parent.getData() > i)
		    parent = parent.getLeft();
		else if (parent.getData() < i)
		    parent = parent.getRight();
	    }
	}

	if (child.getRight() == null || child.getLeft() == null){
	    if (child.getRight() == null){
		if (leftBranch)
		    parent.setLeft(child.getLeft());
		else
		    parent.setRight(child.getRight());
	    }
	    else{
		if (leftBranch)
		    parent.setRight(child.getRight());
		else
		    parent.setLeft(child.getLeft());
	    }
	}

	else{
	    Node temp = child.getLeft();
	    while (temp.getRight() != null){
		temp = temp.getRight();
	    }
	    int largest = temp.getData();
	    delete(largest);
	    child.setData(largest);
	}

	if (root.getData() == i){
	    Node dummy = new Node(-1);
	    dummy.setRight(root);
	    dummy = root;
	    delete(dummy.getRight().getData());
	    root = dummy.getRight();

	}		
    }

    public void traverse(Node n){
	if  (n == null)
	    return;
	else{
	    System.out.println(n);
	    traverse(n.getLeft());
	    traverse(n.getRight());
	}
    }

}
