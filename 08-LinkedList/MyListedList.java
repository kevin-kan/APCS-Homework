public class MyLinkedList{
    private Node head;
    
    public MyLinkedList(){
	head = null;
    }
    
    public void add(String d){
	Node tmp = new Node(d);
	//head = tmp;
	tmp.setNext(head);
	head = tmp;
    }
    public String toString(){
	String s = "";
	while (){
	}
	return s;

    
}