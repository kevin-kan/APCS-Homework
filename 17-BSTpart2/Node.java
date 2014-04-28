public class Node{
    private int data;
    private Node left;
    private Node right;

    public Node(int d){
	data = d;
	right = null;
	left = null;
    }

    public void setData(int d){
	data = d;
    }
    public int getData(){
	return data;
    }
    public void setLeft(Node n){
	left = n;
    }
    public void setRight(Node n){
        right = n;
    }
    public Node getLeft(){
	return left;
    }
    public Node getRight(){
        return right;
    }
    public String toString(){
	return "" + data;
    }
    
}
