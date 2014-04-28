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

}