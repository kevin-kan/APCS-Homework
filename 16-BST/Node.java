public class Node{
    private String data;
    private Node left;
    private Node right;

    public Node(String d){
	data = d;
	right = null;
	left = null;
    }

    public void setData(String d){
	data = d;
    }
    public String getData(){
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
