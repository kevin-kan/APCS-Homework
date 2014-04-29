public class BST{
    private Node root;
    
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
    public void insert(Node n){
	Node current = root;
	Node last = root;
	while(current!=null){
	    if(n.getData()>current.getData()){
		last=current;
		current=current.getRight();
	    }else{
		last=current;
		current=current.getLeft();
	    }
	}
	if(n.getData()>last.getData()){
	    last.setRight(n);
	}else{
	    last.setLeft(n);
	}
    }
    public void delete(int data){
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
        Node n = search(data);
        if ( n == null ){
            return n;
        }else if ((n.getLeft() == null) && (n.getRight() == null)){
	    n = null;
	    return n;
	}else if ((n.getLeft() != null) && (n.getRight() == null)){
	    n = n.getLeft();
	    n.setLeft(null);
	    return n;
	}else if ((n.getLeft() == null) && (n.getRight() != null)){
	    n = n.getRight();
	    n.setRight(null);
	    return n;
	}else{
	    //how?
	}
    }

}
